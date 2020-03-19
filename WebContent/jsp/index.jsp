<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<c:if test="${not empty username}">
		<font color="blue">${username}</font>你好,登录成功！
		<a href="/UserManagementSystem/Logout">登出</a>
	</c:if>
	<c:if test="${empty username}">
		您好，请<a href="/UserManagementSystem/jsp/LoginPage.jsp">登录</a> | <a href="/UserManagementSystem/jsp/RegistrationPage.jsp">注册</a>
	</c:if>
</body>
</html>