<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/yuntiku/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<style>
body {
	padding: 0;
	margin: 0;
	outline: none;
	background-image: url(img/body.jpg);
}

.nei {
	width: 55%;
	height: 400px;
	margin: auto;
	padding-top: 100px;
}

.log img {
	padding-left: 70px;
	padding-bottom: 60px;
}

.login {
	height: 300px;
	width: 84%;
	margin: auto;
	background-image: url(img/login-bg.jpg);
}

.uName {
	height: 40px;
	width: 100%;
	margin-top: 20px;
}

.info {
	margin: 0 auto;
	width: 60%;
	height: 300px;
}

.yzm {
	height: 40px;
	margin-top: 20px;
}
</style>
</head>
<body>
	<div class="nei">
		<div class="log">
			<img src="img/logo.jpg" />
		</div>
		<div class="login">
			<div class="info">
				<form method="post" action="user/doLogin">
					<input type="text" placeholder="账号" class="uName" name="account" /> <input
						type="password" placeholder="密码" class="uName" name="passWord" />

					<p style="margin-top: 5px">
						<input type="text" placeholder="验证码" class="yzm" name="uPwd" /><img
							width="120px" src=""> <img id="Img"
							style="position: relative; top: 14px" id="img_code"
							onclick="reImg()"><span id="yzmErr"
							style="padding-left: 3px; color: red; display: none; font-weight: bold">X</span>
					</p>
					<p>
						<a data-toggle="modal" class="register" data-target="#myModal">立即注册</a>
					</p>
					<input type="submit" value="登录" class="btn btn-success"
						style="width: 370px; height: 40px; margin-top: -5px;" />
				</form>

			</div>
		</div>
		<p style="color: #777777; margin-top: 80px; text-align: center;">Copyright
			© 1999~2018 北京阿博泰克北大青鸟信息技术有限公司 | 云豆网</p>
	</div>



	<!-- Modal -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title" id="myModalLabel">用户注册</h4>
				</div>
				<form class="form-horizontal" method="post" action="user/register">
				<div class="modal-body">
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">姓名</label>
							<div class="col-sm-10">
								<input type="text" class="form-control" name="userName" id="inputPassword3"
									placeholder="姓名">
							</div>
						</div>
						<div class="form-group">
							<label for="inputEmail3" class="col-sm-2 control-label">账号</label>
							<div class="col-sm-10">
								<input type="email" class="form-control" name="account" id="inputEmail3"
									placeholder="账号">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-10">
								<input type="password" name="passWord" class="form-control" id="inputPassword3"
									placeholder="密码">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">所属学期</label>
							<div class="col-sm-10">
								<select name="classesId">
								<option value="null">请选择班级</option>
								</select>
							</div>
						</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
					<button type="submit" class="btn btn-primary">注册</button>
				</div>
				</form>
			</div>
		</div>
	</div>
</body>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript">
$(function(){
	$(".register").on("click",function(){
		$.getJSON("api/selectclass",{},function(data){
			$.each(data,function(){
				$("[name=classesId]").append('<option value='+this.classesId+'>'+this.classesName+'</option>')
			})
			
		});
	})
})
</script>
</html>