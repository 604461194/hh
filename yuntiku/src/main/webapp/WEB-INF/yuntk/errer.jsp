<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/yuntiku/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="js/echarts.js"></script>
<link href="css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
<style>
.body_change_down {
	width: 990px;
	margin: auto;
	border: 1px solid gainsboro;
}

.tao {
	height: 76px;
	width: 90%;
	margin: auto;
	background-color: white;
	border-bottom: 1px solid gainsboro; 
}

.left {
	margin-top: 10px;
	font-weight: bold;
}

.right {
	margin-top: 30px;
}

.right a {
	padding: 6px 25px;
	background-color: #1f6dc2;
	color: white;
	font-weight: bold;
}
</style>
</head>
<body>
	<!--111-->
	<div class="body_change_down">
	<c:forEach items="${record }" var="i">
		<div class="tao">
			<div class="col-lg-8 left">
				<p>${i.recordName }</p>
				<p>
					(考试时间：<span>${i.submitTime })</span>
				</p>
			</div>
			<div class="col-lg-4 right">
				<a>查 看 报 告</a> <a href="firstController/shuatiJilu/${i.recordId }">查 看 题目</a>
			</div>
		</div>
	</c:forEach>
	</div>
</body>
</html>