<%@ page language="java" pageEncoding="utf-8" %>
<html>
<body>

<!--springmvc上传文件-->

<form name="form1" action="/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="spring上传文件"/>
</form>

<form name="form1" action="/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="upload_file"/>
    <input type="submit" value="spring上传文件"/>
</form>
<h2>真傻啊小雨啊</h2>
</body>
</html>
