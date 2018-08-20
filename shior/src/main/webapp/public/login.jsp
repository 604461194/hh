<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>用户主界面</title>
<script type="text/javascript" src="/springrbac/js/jquery-1.8.3.js"></script>
</head>
<body>
	<div>
		<h1 style="color:red;">${msg}</h1>
		<form action="/shior/login/loginIn" method="POST">
			用户名:<input type="text" id="txtName" name="userName" />密码:<input
				type="password" id="txtPwd" name="userPwd" /><input type="submit"
				id="login" value="登陆" />
		</form>
	</div>
</body>
</html>