<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<base href="/yuntiku/">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>后台</title>
</head>
<body>
<button class="class">班级</button>
<button class="class">解析</button>
<button class="class">题目</button>
<input type="file" name="daoru">
<button class="daor">导入</button>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$(".class").on("click",function(){
		var name=$(this).text();
		alert(name);
		$.post("last/daochu",{name:name},function(data){
			alert(data);
		})
	})
	$(".daor").on("click",function(){
	var	path=$("[name=daoru]").val();
	$.post("last/daoRu",{path:path},function(data){
		alert(data);
	})
	})
	
})
</script>
</body>
</html>