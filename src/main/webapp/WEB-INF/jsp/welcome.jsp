<%--
  Created by IntelliJ IDEA.
  User: jingp
  Date: 2019/6/5
  Time: 15:17
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
    <title>SpringMVC Demo 首页</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="../../plugins/bootstrap/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="./plugins/js/html5shiv.min.js"></script>
    <script src="./plugins/js/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h3>欢迎来到《我的世界》,请开始你的表演</h3>
<form method="post" action="<c:url value="/fullmoon/register"/>">
    <button class="btn btn-default" type="submit">
        <span>注册</span>
    </button>
</form>
<form method="post" action="<c:url value="/fullmoon/login"/>">
    <button class="btn btn-default" type="submit">
        <span>登录</span>
    </button>
</form>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="./plugins/jquery/js/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="./plugins/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>
