<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
<form action="record/inserta" method="post">
		<div class="container" style="margin-top: 20px;">
			<div id="st_divLeft">
				<ul class="list-group text-center">
					<li class="list-group-item">剩余考试时间</li>
					<li class="list-group-item">
						<h1 style="font-size: 60px;"><b>30:00</b></h1></li>
					<li class="list-group-item"><input type="checkbox" />开启计时</li>
					<li class="list-group-item"><button class="btn btn-info">休息一下</button></li>
					<li class="list-group-item"><button class="btn btn-info sub" type="button">我要交卷</button></li>
					<li class="list-group-item">
						<div class="btn-group widthBai open" >
							<button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
							    收起答题卡
							  </button>
							 <div class="change_number">
						<span>答题卡<a>10</a></span>
						<div class="change_number_down">
							<ul>
							<c:forEach items="${ti }" var="i" varStatus="k">
								<li>
									<a>${k.index+1 }</a>
								</li>
								</c:forEach>
							</ul>
						</div>
					</div>
						</div>
					</li>
				</ul>
			</div>
			<div id="st_divRight" class="widthBai">
				<ul class="list-group st_divRight_ul">
				<c:if test="${chapter.chapterName==null }">
					<li class="list-group-item">${knowledgepoint.knowledgePointName }</li>
					<input type="hidden" name="recordName1" value="${knowledgepoint.knowledgePointName }">
					</c:if>
					<c:if test="${chapter.chapterName!=null }">
					<li class="list-group-item">${chapter.chapterName }</li>
					<input type="hidden" name="recordName1" value="${chapter.chapterName }">
					</c:if>
				</ul>
				<c:forEach items="${ti }" var="i">
				<div class="topic">
					<div class="topic_content">
						${i.content }
					</div>
					<ul class="list-group tianswer">
					<input type="text" name="answer" value="">
					<input type="hidden" name="subjectId" value="${i.subjectId }">
					<input type="hidden" name="validity" value="${i.validity }">
						<li class="list-group-item"><input type="checkbox" name="option" value="A">
							<a><span class="topic_option">A:</span>${i.optionContentA }</a>
						</li>
						<li class="list-group-item"><input type="checkbox" name="option" value="B">
							<a><span class="topic_option">B:</span>${i.optionContentB }</a>
						</li>
						<li class="list-group-item"><input type="checkbox"  name="option" value="C">
							<a><span class="topic_option">C:</span>${i.optionContentC }</a>
						</li>
						<li class="list-group-item"><input type="checkbox"  name="option" value="D">
							<a><span class="topic_option">D:</span>${i.optionContentD }</a>
						</li>
						<c:if test="${i.optionContentE!=null }">
						<li class="list-group-item"><input type="checkbox" name="option" value="E">
							<a><span class="topic_option">E:</span>${i.optionContentE }</a>
						</li>
						</c:if>
					</ul>
					<div class="container-fluid">
						<a class="navbar-right">纠错</a>
					</div>
				</div>
				</c:forEach>
			</div>
		</div>
	</form>
	<script type="text/javascript">
	$(function(){
		 $(".sub").on("click",function(){
			 for(var b= 0;b<$(".tianswer").length;b++){
				 var tian=$(".tianswer").eq(b);
					var a= $(tian).find("[name=option]").length;
					var answer="";
					for(var i=0;i<a;i++){
						if($(tian).find("[name=option]").eq(i).is(":checked")){
							answer+=$(tian).find("[name=option]").eq(i).val();
						}
					}
					$("[name=answer]").eq(b).val(answer);	
			 }
			 if($("[name=answer]").val()==""){
				var sub=confirm("有题目漏选是否提交？");
				if(sub){
					$("form").submit();
				}
			}else{
				$("form").submit();
			}
		}) 
	})
	</script>
	</body>
</html>