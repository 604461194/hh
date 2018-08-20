<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<title>用户管理页面</title>
<!-- 主题风格 -->
<link rel="stylesheet" type="text/css"
	href="/shior/js/easyui/themes/bootstrap/easyui.css" />
<!-- 图标样式 -->
<link rel="stylesheet" type="text/css"
	href="/shior/js/easyui/themes/icon.css" />

<script type="text/javascript" src="/shior/js/jquery-1.8.3.js"></script>
<!-- easyUI核心类库 -->
<script type="text/javascript"
	src="/shior/js/easyui/jquery.easyui.min.js"></script>
<!-- 本地化 -->
<script type="text/javascript"
	src="/shior/js/easyui/locale/easyui-lang-zh_CN.js"></script>
</head>

<body class="easyui-layout">

	<div data-options="region:'north',split:false" style="height:100px;">
		<h1 align='center'>欢迎<span id="userInfo" style='color:red;'></span>用户登陆<a id="loginout" href="javascript:void(0)">注销</a></h1>
	</div> 
	
    <div id="west" data-options="region:'west',split:false"
		style="width:200px;">
		<ul id="funtree" class="easyui-tree" data-options="animate:true,lines:true,url:'/shior/user/getFunTree?fcode=0'"></ul>
	</div> 
		  
    <div id="center" data-options="region:'center',split:false"
		style="padding:5px;background:#eee;"></div>
		
	<script type="text/javascript">
		$(function(){
			//注销
			$("#loginout").click(function(){
				alert("退出成功");
				location.href="/shior/login/loginOut";
			});
			
			//初始化登陆用户信息
			$.post("/shior/user/getSessionUser?fcode=0",function(user){
				$("#userInfo").html(user.role.rname+"【"+user.userName+"】");
			},"json");
			
			//权限树
			$('#funtree').tree({
				onClick: function(node){
					if(node.id!=0){
						if($("#win1").length==0){
							$("body").append("<div id='win1'></div>");
						}
						$("#win1").window({
							"title":node.text+"信息窗口",
							"width":550,
							"height":350,
							"href":node.attributes.furl,
							"cache":false,
							"draggable":false,
							"minimizable":false,
							"maximizable":false,
							"collapsible":false,
							"modal":true,
							"onLoad":function(){
							},
							"onClose":function(){
								$("#win1").window("destroy");
							}
						});
					}
				}
			});			
		});
	</script>	
</body>

</html>
