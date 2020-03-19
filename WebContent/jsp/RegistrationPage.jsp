<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
	<form action="" method="post" name="register">
		账号：<input type="text" name="username"><br>
		昵称：<input type="text" name="nickname"><br>
		密码：<input type="password" name="password"><br>
		<input type="submit" value="注册">
		<input type="button" value="去登录" onclick="login();">
	</form>
	<!-- <form action="/UserManagementSystem/jsp/LoginPage.jsp">
		<input type="submit" value="登录">
	</form> -->	
</body>
<script type="text/javascript">
	function login(){
		document.register.action = "/UserManagementSystem/jsp/LoginPage.jsp";
		document.register.submit();
	}
</script>
</html>