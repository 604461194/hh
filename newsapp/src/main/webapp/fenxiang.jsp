<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
<title>今日头条</title>
<style type="text/css">

img{
width: 100%;
}
</style>
</head>
<body>
<h1>${newsList[0].title }</h1>
<p>${newsList[0].content }</p>
<img alt="" src="${newsList[0].zhiliao.path }"> 
</body>
</html>