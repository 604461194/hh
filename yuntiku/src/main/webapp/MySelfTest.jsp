<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
<base href="/yuntiku/">
<link rel="stylesheet" href="css/bootstrap.min.css" />
		<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
		<script type="text/javascript" src="js/bootstrap.js"></script>
		<script src="laydate/laydate.js"></script>
		<style type="text/css">
			#home p>a {
				border-radius: 16px;
				width: 105px;
				height: 32px;
			}
			
			#statistics {
				background-color: #F0F5F8;
				padding: 20px 20px 20px 20px;
			}
			
			.demo-input {
				padding-left: 10px;
				height: 38px;
				min-width: 262px;
				line-height: 38px;
				border: 1px solid #e6e6e6;
				background-color: #fff;
				border-radius: 2px;
			}
			
			.demo-footer {
				padding: 50px 0;
				color: #999;
				font-size: 14px;
			}
			
			.demo-footer a {
				padding: 0 5px;
				color: #01AAED;
			}
			
			#analyze_div div>p {
				margin: 20px 20px 20px 20px;
				;
			}
			
			#mainLabel_div {
				background-color: #E8E8E8;
			}
			
			#mainLabel>li>a {
				border: none;
				margin: 0 2px 0 2px;
			}
			
			#mainLabel>li>a:hover {
				border-bottom: 4px solid #246BC3;
				background-color: #E8E8E8;
			}
			
			#mainLabel>.active>a {
				border-bottom: 4px solid #246BC3;
				background-color: #E8E8E8;
			}
			
			.thumbnail {
				border: none;
			}
			a{
				cursor: pointer;
				text-decoration:none;
			}
			 a:hover{TEXT-DECORATION:none} 
		</style>
	</head>

	<body>
	
	
		<!--蒙版5-->
 	 <div class="modal fade" id="zcmodal" >
		  <div class="modal-dialog" style="width: 700px;">
		    <div class="modal-content" style="padding-left: 10px;">
		      <div class="modal-header">
		        <h4 class="modal-title">专项技能练习</h4>
		      </div>
		      <div class="modal-body" id="ydtable">
			 	 <div id="kc" width="650px" style="width:650px;border:1px grey solid;height:400px;overflow: auto;overflow-x:hidden">
			 	 	
			 	 </div>
		      </div>
		      <div class="modal-footer">
		      	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        		<button type="button" id="doyd" class="btn btn-primary">Yes</button>
		      </div>
		    </div><!-- /.modal-content -->
		  </div><!-- /.modal-dialog -->
		</div><!-- /.modal -->
	
	
	
		
		<div>
			<div id="mainLabel_div">
				<div class="container">
					<!-- Nav tabs -->
					<ul id="mainLabel" class="nav nav-tabs nav-justified" role="tablist">
						<li role="presentation" class="active">
							<a href="#home" aria-controls="home" role="tab" data-toggle="tab">分类自测</a>
						</li>
						<li role="presentation">
							<a href="#classRanking" aria-controls="classRanking" role="tab" data-toggle="tab">本班排行</a>
						</li>
						<li role="presentation">
							<a href="#schoolRanking" aria-controls="schoolRanking" role="tab" data-toggle="tab">本校排行</a>
						</li>
						<li role="presentation">
							<a href="#nationwideRanking" aria-controls="nationwideRanking" role="tab" data-toggle="tab">全国排行</a>
						</li>
					</ul>
				</div>
			</div>
			<!-- Tab panes -->
			<div class="tab-content">
				<div role="tabpanel" class="tab-pane active" id="home">
					<div class="row" style="margin-top: 50px;">
						<div class="col-sm-6 col-md-4">
							<div class="thumbnail">
								<img src="img/pc-t.gif" alt="...">
								<div class="caption text-center">
									<h3>专业技能型<img src="img/pc.png" title="可以选择课程中相关技能点的试题，进行针对性训练"></h3>
									<p>完成100道</p>
									<p>
										<a href="javascript:" class="btn btn-primary" data-toggle="modal"  data-target="#zcmodal" onclick="zyjnx()" role="button">进入</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-4">
							<div class="thumbnail">
								<img src="img/pc-t1.gif" alt="...">
								<div class="caption text-center">
									<h3>课程复习型<img src="img/pc.png" title="课程复习型自测将帮您检验各门课程相关技能点的掌握情况。如果试题做对了，那么恭喜您，说明您相关技能点掌握的不错，如果做错了，也没有关系，您可以反复的测试！"></h3>
									<p>完成100道</p>
									<p>
										<a href="javascript:" class="btn btn-primary" role="button">进入</a>
									</p>
								</div>
							</div>
						</div>
						<div class="col-sm-6 col-md-4">
							<div class="thumbnail">
								<img src="img/pc-t2.gif" alt="...">
								<div class="caption text-center">
									<h3>模拟真题型<img src="img/pc.png" title="模拟真题型自测将帮您检验所有课程技能点的掌握情况。如果模拟真题型自测考过了60分，那么恭喜您，您结业考试大概能及格了，赶紧一试吧！"></h3>
									<p>完成100道</p>
									<p>
										<a href="javascript:" class="btn btn-primary" role="button">进入</a>
									</p>
								</div>
							</div>
						</div>
					</div>
					<div id="statistics" class="text-center">
						<p>您最近三个月做题502道，完成题目数量具体时间分布如下：</p>
						<img src="img/getBarChartImage.png" / width="500">
						<div>
							<span>按时间段查询:</span>
							<input type="text" class="demo-input" placeholder="请选择日期" id="beginDate"> 至
							<input type="text" class="demo-input" placeholder="请选择日期" id="endDate">
							<button class="btn btn-default">Go</button>
						</div>
					</div>
					<div id="analyze" style="margin-top: 20px;">
						<div id="analyze_div">

							<!-- Nav tabs -->
							<ul class="nav nav-tabs" role="tablist">
								<li role="presentation" class="active">
									<a class="btn btn-primary" href="#perks" aria-controls="perks" role="tab" data-toggle="tab">按技能点分析</a>
								</li>
								<li role="presentation">
									<a class="btn btn-success" href="#course" aria-controls="course" role="tab" data-toggle="tab">按课程分析</a>
								</li>
								<li role="presentation">
									<a class="btn btn-danger" href="#selfTesting" aria-controls="selfTesting" role="tab" data-toggle="tab">模拟自测分析</a>
								</li>
							</ul>

							<!-- Tab panes -->
							<div class="tab-content">
								<div role="tabpanel" class="tab-pane active" id="perks">
									<p>
										按课程筛选:
										<select>
											<option>不区分</option>
											<option>1</option>
											<option>2</option>
											<option>3</option>
										</select>
										时间:
										<select>
											<option>最近一周</option>
											<option>最近一月</option>
										</select>
									</p>
									<div>
										没有符合条件的数据!
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="course">
									<img src="img/pc-1.gif" /> 您最近没有完成任何课程复习型试卷，如果已经学完了某些课程，建议您选择该课程进行测试
									<div>
										<p>时间:
											<select>
												<option>最近一周</option>
												<option>最近一月</option>
											</select>
										</p>
										<table class="table table-bordered">
											<tr>
												<td>序号</td>
												<td>课程 </td>
												<td>答题套数</td>
												<td>答题数</td>
												<td>平均正确率</td>
												<td></td>
											</tr>
											<tbody id="tb">
												<tr>
													<td>1</td>
													<td>深入.NET平台和C#编程 </td>
													<td>0</td>
													<td>0</td>
													<td>--</td>
													<td>开始测试</td>
												</tr>
												<tr>
													<td>2</td>
													<td>使用Java实现面向对象编程 </td>
													<td>0</td>
													<td>0</td>
													<td>--</td>
													<td>开始测试</td>
												</tr>
												<tr>
													<td>3</td>
													<td>使用Java实现数据库编程 </td>
													<td>0</td>
													<td>0</td>
													<td>--</td>
													<td>开始测试</td>
												</tr>
												<tr>
													<td>4</td>
													<td>使用jQuery制作网页交互 </td>
													<td>0</td>
													<td>0</td>
													<td>--</td>
													<td>开始测试</td>
												</tr>
												<tr>
													<td>5</td>
													<td>使用JSP/Servlet开发系统 </td>
													<td>0</td>
													<td>0</td>
													<td>--</td>
													<td>开始测试</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
								<div role="tabpanel" class="tab-pane" id="selfTesting">
									<img src="img/pc-2.gif" /> 您已经完成10次模拟结业测试，最近3次平均成绩是70分， 建议您再进行几次模拟测试，将平均分提升到70分以上，确保正式结业考试顺利通过！
									<div class="container">
										<p>各次模拟测试的具体成绩分布如下：</p>
										<img src="img/getLineChartImage.png"/>
									</div>
								</div>
							</div>

						</div>
					</div>
				</div>

				<!--班级排行-->
				<div role="tabpanel" class="tab-pane" id="classRanking">
					<div class="table-bordered container-fluid" style="padding: 20px 20px 20px 20px;">
						<p class="navbar-left">
							<a>时间：2018.5.21~2018.5.25</a>
						</p>
						<div class="navbar-right">
							<button class="btn btn-default btn-info">本周</button>
							<button class="btn btn-default">本月</button>
							<button class="btn btn-default">上周</button>
							<button class="btn btn-default">上月</button>
						</div>
					</div>
					<div class="table-bordered">
						<table class="table table-bordered table-striped">
							<thead style="background-color: #246BC3;color: white;">
								<tr>
									<td>排名</td>
									<td>姓名</td>
									<td>累计答题数</td>
									<td>实际答题数</td>
									<td>正确率</td>
									<td>用时(小时)</td>
								</tr>
							</thead>
							<tbody id="class_tbb">
								<tr>
									<td>1</td>
									<td>孙悟空</td>
									<td>100</td>
									<td>1</td>
									<td>0%</td>
									<td>6</td>
								</tr>
								<tr>
									<td>2</td>
									<td>孙行者</td>
									<td>100</td>
									<td>2</td>
									<td>0%</td>
									<td>9</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<!--本校排行-->
				<div role="tabpanel" class="tab-pane" id="schoolRanking">
					<div class="table-bordered container-fluid" style="padding: 20px 20px 20px 20px;">
						<p class="navbar-left">
							<a>时间：2018.5.21~2018.5.25</a>
						</p>
						<div class="navbar-right">
							<button class="btn btn-default btn-info">上周</button>
							<button class="btn btn-default">上月</button>
						</div>
					</div>
					<div class="table-bordered">
						<table class="table table-bordered table-striped">
							<thead style="background-color: #246BC3;color: white;">
								<tr>
									<td>排名</td>
									<td>班级</td>
									<td>姓名</td>
									<td>实际答题数</td>
									<td>正确率</td>
									<td>用时(小时)</td>
								</tr>
							</thead>
							<tbody id="school_tbb">
								<tr>
									<td>1</td>
									<td>java15</td>
									<td>孙悟空</td>
									<td>1</td>
									<td>0%</td>
									<td>6</td>
								</tr>
								<tr>
									<td>2</td>
									<td>java16</td>
									<td>孙行者</td>
									<td>2</td>
									<td>0%</td>
									<td>9</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
				<!--全国排行-->
				<div role="tabpanel" class="tab-pane" id="nationwideRanking">
					<div class="table-bordered container-fluid" style="padding: 20px 20px 20px 20px;">
						<p class="navbar-left">
							<a>时间：2018.5.21~2018.5.25</a>
						</p>
						<div class="navbar-right">
							<button class="btn btn-default btn-info">上周</button>
							<button class="btn btn-default">上月</button>
						</div>
					</div>
					<div class="table-bordered">
						<table class="table table-bordered table-striped">
							<thead style="background-color: #246BC3;color: white;">
								<tr>
									<td>排名</td>
									<td>校区</td>
									<td>姓名</td>
									<td>实际答题数</td>
									<td>正确率</td>
									<td>用时(小时)</td>
								</tr>
							</thead>
							<tbody id="nationwide_tbb">
								<tr>
									<td>1</td>
									<td>株洲建坤</td>
									<td>孙悟空</td>
									<td>1</td>
									<td>0%</td>
									<td>6</td>
								</tr>
								<tr>
									<td>2</td>
									<td>长沙大计</td>
									<td>孙行者</td>
									<td>2</td>
									<td>0%</td>
									<td>9</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div> 

		</div>
	</body>
	<script>
	
		function zyjnx(){
			$("#kc *").remove();
			$.getJSON("CurriculumApiController/"+${user.userId},function(data){
				$.each(data,function(){
					var newp="<p style='margin:20px 0px 20px 35px;'><a class='jh' style='font-size:20px' src='javascript:void(0)'>+</a><input class='kcid' type='hidden' value="+this.curriculumId+">【课程】"+this.curriculumName+"<p class='zj'></p><hr style='margin-left:35px;height:1px;color:gray;background-color:gray;' /></p>";
					$("#kc").append(newp);
				});
			});
		}
	
		$(function(){
			$("#kc").on("click",".jh",function(){ 
				var zjs=$(".zj");
				var jj=$(this).text();
				var t=$(".jh").index(this);
				var kcid=$(this).parent().find(".kcid").val();
				if(jj=="+"){
					$(this).text("-");
					$.getJSON("ChapterApiController/"+kcid,function(data){
						for(var i=0;i<data.length;i++){
							var newp="<p style='padding-left:65px'><a style='font-size:20px' src='javascript:void(0)' class='zsd'>+</a><input class='zsdid' type='hidden' value="+data[i].chapterId+">&nbsp;"+data[i].chapterName+"</p><input class='zsdid' type='hidden' value="+data[i].chapterId+"><p class='czsd'></p>";
							$(zjs[t]).append(newp)
						}
						
					});
				}
				
				if(jj=="-"){
					$(this).text("+");
					$(zjs[t]).empty();
				}
				
				
			})
			
			$("#kc").on("click",".zsd",function(){
				var czsds=$(".czsd");
				var jj=$(this).text();
				var t=$(".zsd").index(this);
				var zjId=$(this).next().val();
				if(jj=="+"){
					$(this).text("-");
					$.getJSON("KnowledgePointApiService/"+zjId,function(data){
						$.each(data,function(){
							var newp="<p style='padding-left:85px'><input class='cnmdid' type='hidden' value="+this.knowledgePointId+"><span>"+this.knowledgePointName+"</span><span>开始测试</span>";
							$(czsds[t]).append(newp)
						})
					})
				}
				
				if(jj=="-"){
					$(this).text("+");
					$(czsds[t]).empty();
				}
			})
		})
	
	
		lay('#version').html('-v' + laydate.v);

		//执行一个laydate实例
		laydate.render({
			elem: '#beginDate' //指定元素
		});
		laydate.render({
			elem: '#endDate' //指定元素
		})
	</script>
</html>