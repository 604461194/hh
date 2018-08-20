<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/yuntiku/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="text/javascript" src="js/echarts.js" ></script>
		<link href="css/bootstrap.min.css" rel="stylesheet">
		<style>
			.body_2{
				width: 990px;
				padding: 0;
				margin:auto;
				border: 1px solid gainsboro;
				background-color: white;
			
			}
			.body_2_header{
				height: 77px;
				width: 90%;
				margin: auto;
				line-height: 77px;
				padding: 0;
			}
			.body_2_header span{
				
				padding: 10px 20px;
			}
			.work{
				margin-left: 200px;
			}
			.time{
				margin-left: 100px;
			}
			.paih{
				border: 1px solid gainsboro;
			}
			.body_2_body{
				width: 90%;
				margin: auto;
				margin-top: 20px;
			}
			td{
				 border: 1px solid gainsboro;
				 height: 30px;
				  text-align: center;
			}
			th{
				 height: 30px;
				  text-align: center;
				  background-color: #246bc3;
				  border: 1px solid black;
			}
		</style>
<title>Insert title here</title>
</head>
<body>
		<div class="body_2">
			<div class="body_2_header">
				<span class="time">时间：2018.5.28~2018.6.1</span>
				<span class="paih work">本周榜</span>
				<span class="paih">本月榜</span>
				<span class="paih">上周榜</span>
				<span class="paih">上月榜</span>
			</div>
			<div class="body_2_body">
				
				<table width="100%" border="0" cellspacing="0">
		<thead>
			<tr>
				<th width="15%">排名</th>
				<th width="20%">姓名</th>
				<th width="15%">累计答题数</th>
				<th width="15%">实际答题数</th>
				<th width="20%">正确率</th>
				<th width="20%">用时(小时)</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${pai }" var="i" varStatus="ind">
				<tr>
					<td>${ind.index+1 }</td>
					<td>${i.uName }</td>
					<td>${i.number }</td>
					<td>
					${i.number }</td>
					<td>
					<fmt:formatNumber type="number" value="${i.accu*100  }" pattern="0.00" maxFractionDigits="2"/>
					%</td>
					<td>0.0小时</td>
				</tr>
				</c:forEach>
			</tbody>
				</table>
			</div>
			
		</div>
		
		
		
		<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
		<script src="../js/bootstrap.min.js"></script>
		<script type="text/javascript" src="../js/jquery-3.2.1.min.js"></script>
		<script>
			$(function(){
				$(".body_header span").eq(0).css("border-bottom","4px solid blue");
				$(".body_2_header .paih").eq(0).css("background-color","#246bc3");
				$(".body_2_header .paih").eq(0).css("color","white");
			})
		</script>
		</body>
</html>