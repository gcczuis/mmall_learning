package com.mmall.vo;

import java.math.BigDecimal;
import java.util.List;

public class CartVo {
    List<CartProductVo> cartProductVoList;
    private BigDecimal cartTotalPrice;//总价
    private boolean allChecked;//是否已经都勾选
    private String imageHost;//购物车需要显示图片，所以需要图片服务器的地址

    public List<CartProductVo> getCartProductVoList() {
        return cartProductVoList;
    }

    public void setCartProductVoList(List<CartProductVo> cartProductVoList) {
        this.cartProductVoList = cartProductVoList;
    }

    public BigDecimal getCartTotalPrice() {
        return cartTotalPrice;
    }

    public void setCartTotalPrice(BigDecimal cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }

    public boolean isAllChecked() {
        return allChecked;
    }

    public void setAllChecked(boolean allChecked) {
        this.allChecked = allChecked;
    }

    public String getImageHost() {
        return imageHost;
    }

    public void setImageHost(String imageHost) {
        this.imageHost = imageHost;
    }
}
