<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>首页</title>
</head>
<body>
<h3>Hello World!</h3>
<form method="post" action="<c:url value="/fullmoon/"/>">
    <button class="btn btn-default" type="submit">
        <span>进入我的世界</span>
    </button>
</form>
</body>
</html>
