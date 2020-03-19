<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录</title>
</head>
<body>
	<form action="/UserManagementSystem/Login" method="post" name="login">
		<div>
			账号：<input type="text" name="user.username"><font color="red">${usernameError }</font>
		</div>
		<div>
			密码：<input type="password" name="user.password"><font color="red">${passwordError }</font>
		</div>
		<input type="submit" value="登录">
		<input type="button" value="去注册" onclick="register();">
	</form>
</body>
<script type="text/javascript">
	function register(){
		document.login.action = "/UserManagementSystem/jsp/RegistrationPage.jsp";
		document.login.submit();
	}
</script>
</html>