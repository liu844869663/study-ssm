<%--
  Created by IntelliJ IDEA.
  User: jingp
  Date: 2019/6/5
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>注册</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="./plugins/bootstrap/css/bootstrap.min.css">

</head>
<body>
<form method="post" action="<c:url value="/fullmoon/register/addUser"></c:url> ">
    <div class="input-group">
        <span class="input-group-addon">姓名：</span>
        <input type="text" name="name" class="form-control" aria-label="Amount (to the nearest dollar)">
    </div>
    <div class="input-group">
        <span class="input-group-addon">密码：</span>
        <input type="text" name="password" class="form-control" aria-label="Amount (to the nearest dollar)">
    </div>
    <div class="input-group">
        <span class="input-group-addon">年龄：</span>
        <input type="number" name="age" class="form-control" aria-label="Amount (to the nearest dollar)">
    </div>
    <button type="submit" class="btn btn-default" aria-label="Right Align">提交</button>
</form>
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="./plugins/jquery/js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="./plugins/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
