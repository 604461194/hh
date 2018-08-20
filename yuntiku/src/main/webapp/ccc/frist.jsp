<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/yuntiku/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<style>
			body {
				margin: 0;
				padding: 0;
				
			}
			
			.header {
				width: 990px;
				height: 170px;
				
				margin: 0px auto;
			}
			
			.header_one {
				height: 30px;
				background-color: white;
				border-bottom: 1px solid blue;
			}
			
			.onne {
				height: 30px;
				line-height: 30px;
			}
			.hrader_rigth{
				margin-left: 160px;
				
			}
			.ul_change{
				list-style-type: none;
				padding: 0;
			}
			.ul_change li{
				border: 1px solid gainsboro;
				width: 50%;	
				margin-top: -1px;
				padding-left: 16px;
				margin-left: -16px;
				background-color: white;	
			}
			.ul_change li:hover{
				background-color: orange;
			}
			.ul_change{
				display: none;
			}
			.header_twe{
				height: 102px;
				background-image: url(img/log.PNG);
			}
			.header_three{
				background-color: #1f6dc2;
				height: 36px;
				line-height: 35px;
				text-align: center;
			}
			.change span{
				font-family: "微软雅黑";
				font-weight: bold;
				color: white;
				
			}
			.option{
				color: gray;
			}
			.option:hover{
				cursor: pointer;
			}
		</style>
</head>
<body style="background-color: #f6f6f6;">
		<div>
			<div class="header">
				<div class="header_one">
					<div class="col-lg-7 onne">
						<span>ACCP8.0版本Y2课程</span><span class="option">▼</span>
						<ul class="ul_change">
							<li>ACCP7.0版本S1课程</li>
							<li>ACCP7.0版本S2课程</li>
							<li>ACCP8.0版本y2课程</li>
						</ul>
					</div>
					<div class="col-lg-1 onne">
						<img src="img/announcement.png" />消息
						
					</div>
					<div class="col-lg-4 onne">
						<span class="hrader_rigth">
						<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						<span>欢迎您</span>
						<span>qdd</span>
						<span>退出</span>
						</span>
					</div>
				</div>
				<div class="header_twe">
				
				</div>
				<div class="header_three">
					<div class="col-lg-2"></div>
					<div class="col-lg-2 change"><span>我的自测</span></div>
					<div class="col-lg-2 change"><span>统一测试</span></div>
					<div class="col-lg-2 change"><span>我的历史</span></div>
					<div class="col-lg-2 change"><span>新版题库</span></div>
					<div class="col-lg-2 "></div>
			</div>
		</div>

		<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>
		<script>
			$(function(){
				var i=0;
				$(".change").eq(0).css("background-color","#13467d");
				$(".option").on("click",function(){
					i++;
					if(i%2!=0){
						$(".ul_change").show();
					}else{
						$(".ul_change").hide();
					}
				})
			})
		</script>
	</body>
</html>