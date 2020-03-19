<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户管理首页</title>
</head>
<body>
	<h1>用户管理</h1>
	<a href="/UserManagementSystem/jsp/root/addUser.jsp">添加</a>
	<a href="/UserManagementSystem/root/Logout">退出</a>
	<table border="1">
		<tr>
			<td>id</td>
			<td>账号</td>
			<td>昵称</td>
			<td>注册日期</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.username}</td>
				<td>${user.nickname}</td>
				<td></td>
				<td>
					<a href="/UserManagementSystem/root/deleteUser?id=${user.id}">删除</a> | 
					<a href="/UserManagementSystem/root/editUser?id=${user.id}">修改</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>