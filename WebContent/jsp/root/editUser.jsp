<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>修改</title>
</head>
<body>
	<form action="/UserManagementSystem/root/updateUser" method="post">
		<table border="1">
			<tr>
				<td>id</td>
				<td>账号</td>
				<td>密码</td>
				<td>昵称</td>
				<td>注册日期</td>
			</tr>
				<tr>
					<td>
						<input type="text" name="id" value="${updateUser.id}" readonly="readonly">
					</td>
					<td><input type="text" name="username" value="${updateUser.username}"></td>
					<td><input type="text" name="password" value="${updateUser.password}"></td>
					<td><input type="text" name="nickname" value="${updateUser.nickname}"></td>
					<td></td>
				</tr>
		</table>
		<input type="submit" value="修改">
	</form>
	
	
</body>
</html>