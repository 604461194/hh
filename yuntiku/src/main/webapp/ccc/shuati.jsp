<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/yuntiku/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="css/bootstrap.min.css" />
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script type="text/javascript" src="js/bootstrap.js"></script>
	<style type="text/css">
		.widthBai {
			width: 100%;
		}
		
		.topic {
			border: 1px solid #E8E8E8;
			margin: 20px 0 20px 0;
		}
		
		.topic * {
			border: none;
		}
		
		.topic>.topic_content {
			background-color: #F9F9F9;
			padding: 40px 0 40px 0;
		}
		
		.topic_option {
			color: #1F6DCD;
			font-weight: bold;
		}
		
		.topic>.container-fluid {
			border-top: 1px solid #E8E8E8;
		}
		
		.topic>.container-fluid>a {
			margin: 20px 0 20px 0;
		}
		
		.st_divRight_ul>li {
			border-left: none;
			border-right: none;
		}
		
		#st_divLeft {
			position: fixed;
			width: 200px;
		}
		
		#st_divLeft * {
			border: none;
		}
		
		#st_divLeft button {
			width: 100%;
			height: 50px;
			border-radius: inherit;
		}
		
		#st_divLeft li {
			padding: 5px 0 5px 0;
		}
		
		#st_divRight {
			padding-left: 205px;
		}
		
		.Scantron{background-color: #BCBCBC;}
		.change_number{
				height: 200px;
				border: 1px solid gainsboro;
				background-color: gainsboro;
				
			}
			.change_number span{
				margin-left: 70px;
			}
			.change_number_down ul{
				
				list-style-type: none;
				margin-left: 10px;
				padding: 0;
			}
			.change_number_down li{
				float: left;
				border: 1px solid gainsboro;
				margin-left: 5px;
				width: 30px;
				height: 30px;
				line-height: 30px;
				text-align: center;
				margin-top: 10px;
				background-color: gray;
				
			}
			.change_number_down li a{
				color: white;
			}
	</style>
</head>
<body>
		<div class="container" style="margin-top: 20px;">
			<div id="st_divLeft">
				<ul class="list-group text-center">
					<li class="list-group-item">剩余考试时间</li>
					<li class="list-group-item">
						<h1 style="font-size: 60px;"><b>30:00</b></h1></li>
					<li class="list-group-item"><input type="checkbox" />开启计时</li>
					<li class="list-group-item"><button class="btn btn-info">休息一下</button></li>
					<li class="list-group-item"><button class="btn btn-info">我要交卷</button></li>
					<li class="list-group-item">
						<div class="btn-group widthBai open" >
							<button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							    收起答题卡
							  </button>
							 <div class="change_number">
						<span>答题卡<a>10</a></span>
						<div class="change_number_down">
							<ul>
								<li>
									<a>1</a>
								</li>
								<li>
									<a>2</a>
								</li>
								<li>
									<a>3</a>
								</li>
								<li>
									<a>4</a>
								</li>
								<li>
									<a>5</a>
								</li>
									<li>
									<a>6</a>
								</li>
								<li>
									<a>7</a>
								</li>
								<li>
									<a>8</a>
								</li>
								<li>
									<a>9</a>
								</li>
								<li>
									<a>10</a>
								</li>
							</ul>
						</div>
					</div>
						</div>
					</li>
				</ul>
			</div>
			<div id="st_divRight" class="widthBai">
				<ul class="list-group st_divRight_ul">
					<li class="list-group-item">使用Java实现面向对象编程-课程复习试卷</li>
				</ul>
				<div class="topic">
					<div class="topic_content">
						下面对于面向切面编程说法错误的是().
					</div>
					<ul class="list-group">
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">A:</span>面向对象程序设计思想要明显优于面向过程设计思想</a>
						</li>
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">B:</span>面向对象是Java语言的基本设计思想</a>
						</li>
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">C:</span>类是Java中最核心最基本的内容</a>
						</li>
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">D:</span>面向对象设计思想主要包括封装、继承和多态</a>
						</li>
					</ul>
					<div class="container-fluid">
						<a class="navbar-right">纠错</a>
					</div>
				</div>
				<div class="topic">
					<div class="topic_content">
						下面对于面向切面编程说法错误的是().
					</div>
					<ul class="list-group">
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">A:</span>面向对象程序设计思想要明显优于面向过程设计思想</a>
						</li>
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">B:</span>面向对象是Java语言的基本设计思想</a>
						</li>
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">C:</span>类是Java中最核心最基本的内容</a>
						</li>
						<li class="list-group-item"><input type="checkbox">
							<a><span class="topic_option">D:</span>面向对象设计思想主要包括封装、继承和多态</a>
						</li>
					</ul>
					<div class="container-fluid">
						<a class="navbar-right">纠错</a>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>