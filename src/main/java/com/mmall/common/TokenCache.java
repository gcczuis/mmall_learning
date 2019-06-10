package com.mmall.common;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;



//这个缓存用来校验 检查忘记密码问题答案是否正确 和 正确后修改密码 这两个操作是否是同一个用户
public class TokenCache {
    
    public static final String TOKEN_PREFIX = "token_";
    private static Logger logger = LoggerFactory.getLogger(TokenCache.class);
    //LRU算法（当缓存中数量到达最大10000后会使用LRU算法去除最少使用的缓存项）
    private static LoadingCache<String,String> localCache = CacheBuilder.newBuilder()
            .initialCapacity(1000)
            .maximumSize(10000)
            .expireAfterAccess(12,TimeUnit.HOURS)
            .build(new CacheLoader<String, String>() {
        //默认的数据加载实现，当调用get取值的时候，如果key没有对应的值，就调用这个方法进行加载。
        @Override
        public String load(String s) throws Exception {
            return "null";
        }
    });
    public static void setKey(String key,String value){
        localCache.put(key,value);
    }
    
    public static String getKey(String key){
        String value = null;
        try {
            value = localCache.get(key);
            if("null".equals(value)){
                return null;
            }
            return value;
        } catch (ExecutionException e) {
            logger.error("localCache get error",e);
        }
        return null;

    }
}
