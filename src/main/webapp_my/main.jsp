<%@ page language="java" contentType="text/html; UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=ISO-8859-1">
    <title>小春论坛</title>
</head>
<body>
//此处访问Session域中user对象，显示用户名和积分信息
${user.userName},欢迎您进入小春论坛，您当前积分为${user.credits};
</body>
</html>