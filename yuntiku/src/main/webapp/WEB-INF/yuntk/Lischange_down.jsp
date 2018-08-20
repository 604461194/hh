<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="/yuntiku/">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<script type="text/javascript" src="js/echarts.js"></script>
		<link href="css/bootstrap.min.css" rel="stylesheet">
<style>
			.body_Ti {
				width: 990px;
				margin: auto;
				background-color: white;
					
			}
			
			.tiMu {
				margin:0 auto;
				width: 96%;
				
			}
			.ti_left {
				border: 1px solid gainsboro;
			}
			.ti_left img {
				border: 1px solid gainsboro;
			}
			.look_error{
				border: 1px solid gainsboro;
				height: 70px;
				line-height: 70px;
				text-indent: 60px;
			}
			.ti_left p{
				border: 1px solid gainsboro;
				padding: 10px 20px;
				margin-top: 10px;
				text-align: center;
				color: white;
				font-size: 15px;
				font-weight: bold;
				background-color: #9fc5f1;
			}
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
			.ti_right_top{
				text-align: center;
				border: 1px solid gainsboro;
				height: 50px;
				width: 104%;
				margin-left: -15px;
				line-height: 50px;
				color: #0099cc;
				font-size: 17px;
				font-weight: bold;
			}
			.tite{
				width: 100%;
				margin: auto;
				text-indent: 110px;
				
			}
			.sanjia{
		     	border-style: solid;
	            border-width: 0px 0px 70px 70px;
	            border-color: transparent transparent transparent blue;
	            width: 0px;
	            height: 0px;
	            position: relative;
	            top: -61px;
			}
				.sanjia1{
		     	border-style: solid;
	            border-width: 0px 0px 70px 70px;
	            border-color: transparent transparent transparent red;
	            width: 0px;
	            height: 0px;
	            position: relative;
	            top: -61px;
			}
			.sanjia span{
				font-size: 20px;
				color: white;
				margin-left: -60px;
				
				
			}
			.ti{
				border: 1px solid gainsboro;
				margin-top: 10px;
				width: 103%;
				margin-left: -10px;
			}
			.ti_top{
				background-color: #f9f9f9;
				border: 1px solid gainsboro;
				
			}
			.look_option{
				color: greenyellow;
				font-size: 18px;
				text-indent: 110px;
				margin-top: 10px;
			}
			.answer{
			border-top:1px solid gainsboro ;	
			text-indent: 150px;
			font-size: 20px;
			}
			.answer span{
				padding: 10px 20px;
			}
		</style>
<title>Insert title here</title>
</head>
<body>
		<!--111-->
		<div class="body_Ti">
			<div class="tiMu">
				<div class="col-lg-3 ti_left">
					<img src="img/sub5_mian.jpg" />
					<p>查看报告</p>
					<p>查看解析</p>
					<div class="look_error">
						<input type="checkbox" name="error" />
						<span>只 看 错 题</span>
					</div>
					<div class="change_number">
						<span>答题卡<a>10</a></span>
						<div class="change_number_down">
							<ul>
							<c:forEach items="${recordDetail }" varStatus="a">
								<li>
									<a>${a.index+1 }</a>
								</li>
							</c:forEach>
							</ul>
						</div>
					</div>
				</div>
				<div class="col-lg-9 ti_right">
					<div class="ti_right_top">
						<span>
						 ${recordDetail.get(0).record.recordName }
						</span>
					</div>
					<c:forEach items="${recordDetail }" var="i" varStatus="a">
					<div class="ti">
					
						<div class="ti_top">
							<div class="tite">
								<p>${i.content }</p>
								<p>(选择一项)</p>
							</div>
							<c:if test="${i.recorddetail.validity==1 }">
							<div class="sanjia">
								<br />
								<span>${a.index+1 }</span>
							</div>
							</c:if>
								<c:if test="${i.recorddetail.validity==0 }">
							<div class="sanjia1">
								<br />
								<span>${a.index+1 }</span>
							</div>
							</c:if>
						</div>
						<div class="look_option">
							<p><span>A</span>:<a>${i.optionContentA }</a></p>
							<p><span>B</span>:<a>${i.optionContentB }</a></p>
							<p><span>C</span>:<a>${i.optionContentC }</a></p>
							<p><span>D</span>:<a>${i.optionContentD }</a></p>
							<c:if test="${i.optionContentE!=null }">
							<p><span>E</span>:<a>${i.optionContentE }</a></p>
							</c:if>
						</div>
						<div class="answer">
							<span>${i.recorddetail.uAnswer }</span><span>正确答案<span>${i.validity }</span></span>
							<span onclick="jiexi('${i.subjectId }')">题目解析</span><span onclick="shoucan('${i.subjectId }')">收藏</span>
						</div>
					</div>
					</c:forEach>
				</div>
			</div>
		</div>
		<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript">
		//收藏
		function shoucan(a){
		$.post("shoucan",{subjectId:a},function(data){
			if(data>0){
				alert("收藏成功！！！");
			}else{
				alert("收藏失败！！！");
			}
		})
		}
		//解析
		function jiexi(b){
			alert(b);
		}
		</script>
	</body>
</html>