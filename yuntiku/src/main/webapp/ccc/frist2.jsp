<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
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
.body_1 {
	width: 990px;
	margin: auto;
	background-color: white;
}

.body_body {
	height: 400px;
}

.body_type {
	height: 400px;
}

.zhuanxiang {
	font-size: 20px;
	font-weight: bold;
}

.over_c {
	padding: 30px;
}

.btn {
	border-radius: 30px;
	width: 120px;
	background-color: #1f6dc2;
	color: white;
}

.type_down {
	margin-left: 20px;
}

.body_type_1 {
	margin: auto;
	padding: 70px;
}

.body_tu {
	background-color: #f0f5f8;
}

.body_tu_1 {
	width: 80%;
	margin: auto;
}

#main {
	width: 800px;
	height: 350px;
	border: 1px solid black;
}

.bodt_tu_top {
	padding: 20px 0 0 150px;
}

.seach {
	padding: 30px 0 40px 0;
}
</style>
</head>
<body>
	<div class="body_1">
		<!--111-->
		<!--导航-->
		<!--222-->
		<div class="body_body">
			<div class="body_type col-lg-4">
				<div class="body_type_1">
					<img src="img/pc-t.gif" />
					<p class="type_down">
						<br /> <span class="zhuanxiang">专项技能型</span><img
							src="img/pc.png" /> <br /> <span class="over_c">完成10道</span>
						<br /> <a href="motai/zhuan.html" data-toggle="modal"
							data-target="#myModal"><button class="btn">进入</button></a>
					</p>
				</div>
			</div>
			<div class="body_type col-lg-4">
				<div class="body_type_1">
					<img src="img/pc-t1.gif" />
					<p class="type_down">
						<br /> <span class="zhuanxiang">课程复习型</span><img
							src="img/pc.png" /> <br /> <span class="over_c">完成20道</span>
						<br /> <a href="content.html" data-toggle="modal"
							data-target="#myModal"><button class="btn">进入</button></a>
					</p>
				</div>
			</div>
			<div class="body_type col-lg-4">
				<div class="body_type_1">
					<img src="img/pc-t2.gif" />
					<p class="type_down">
						<br /> <span class="zhuanxiang">模拟真题型</span><img
							src="img/pc.png" /> <br /> <span class="over_c">完成50道</span>
						<br />
						<button class="btn">进入</button>
					</p>
				</div>
			</div>
		</div>
		<!--3333-->
		<div class="body_tu">
			<p class="bodt_tu_top">您最近一周做题0道，完成题目数量具体时间分布如下：</p>
			<div class="body_tu_1">
				<div id="main"></div>
				<p class="seach">
					按时间段查询<input type="date">至<input type="date">
					<button>go</button>
				</p>
			</div>

		</div>
	</div>
	<!--模态框-->
	<div class="modal fade" id="myModal">
		<div class="modal-dialog">
			<div class="modal-content"></div>
		</div>
	</div>
	<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
	<script>
		$(function() {
			$(".body_header span").eq(0).css("border-bottom", "4px solid blue");
		})
	</script>
	<script>
		var json = [ {
			classname : "2018/2/2",
			classid : "55"
		}, {
			classname : "2018/2/3",
			classid : "5"
		}, {
			classname : "2018/2/4",
			classid : "11"
		}, {
			classname : "2018/2/5",
			classid : "15"
		}, {
			classname : "2018/2/6",
			classid : "5"
		}, {
			classname : "2018/2/7",
			classid : "12"
		}, {
			classname : "2018/2/8",
			classid : "13"
		} ]

		// 基于准备好的dom，初始化echarts实例
		var myChart = echarts.init(document.getElementById("main"));

		$(function() {
			set();
		})

		function set() {
			//$.post("",{},function(data){
			getTongJiTu(json);
			//})

		}

		function getTongJiTu(json) {
			var classNames = new Array();
			var classIds = new Array();
			$.each(json, function(e) {
				classNames[e] = this.classname;
				classIds[e] = this.classid;
			});

			var option = {
				title : {
					text : ''
				},
				tooltip : {},
				legend : {
					data : [ '题量' ]
				},
				xAxis : { /*x轴*/
					data : classNames
				},
				yAxis : {}, /*y轴*/
				series : [ { /*series*/
					name : '题量',
					type : 'line', /* 统计图类型 1:柱状统计图 bar 2:折线统计图 line 3:饼状统计图 pie*/
					data : classIds,
					smooth : true
				} ]
			};
			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);
		}
	</script>
</html>