<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!doctype html>

<html>

<head>
<title>招聘查询</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="/lyw/js/jquery-3.1.1.min.js">
	
</script>
<link href="/lyw/css/login.css" rel="stylesheet" type="text/css">
<link href="/lyw/css/zhuye.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/lyw/css/bootstrap.min.css" type="text/css">
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/lyw/js/bootstrap.min.js"></script>
<link href="/lyw/css/project_frontpage.css" rel="stylesheet"
	type="text/css">
<link href="/lyw/css/myinfo.css" rel="stylesheet" type="text/css">

</head>

<body>
	<!--   导航栏-->
	<nav class="navbar navbar-inverse">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">万才网</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav">
					<li><a href="../%E5%B7%A5%E7%A8%8B%E9%A6%96%E9%A1%B5.html">首页
							<span class="sr-only">(current)</span>
					</a></li>
					<li><a
						href="../%25E5%258F%2591%25E7%258E%25B0/%E5%8F%91%E7%8E%B0.html">发现</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">发布<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="../%25E5%258F%2591%25E5%25B8%2583/%E5%8F%91%E5%B8%83%E6%8B%9B%E8%81%98.html">发布招聘</a></li>
							<li><a
								href="../%25E5%258F%2591%25E5%25B8%2583/%E5%8F%91%E5%B8%83%E6%B1%82%E8%81%8C.html">发布求职</a></li>


						</ul></li>
					<!--下拉菜单-->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">消息<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="../%25E6%25B6%2588%25E6%2581%25AF/%E6%8B%9B%E8%81%98%E6%B6%88%E6%81%AF.html">招聘消息</a></li>
							<li><a
								href="../%25E6%25B6%2588%25E6%2581%25AF/%E6%8E%A8%E8%8D%90%E6%B6%88%E6%81%AF.html">推荐消息</a></li>
							<li><a
								href="../%25E6%25B6%2588%25E6%2581%25AF/%E7%B3%BB%E7%BB%9F%E6%B6%88%E6%81%AF.html">系统消息</a></li>
							<li><a
								href="../%25E6%25B6%2588%25E6%2581%25AF/%E6%B6%88%E6%81%AF%E8%AF%A6%E6%83%85.html">消息详情</a></li>

						</ul></li>
					<!--下拉菜单-->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">我的<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="%E6%88%91%E7%9A%84%E6%B1%82%E8%81%8C.html">我的求职</a></li>
							<li><a href="%E6%88%91%E7%9A%84%E6%8A%95%E9%80%92.html">我的投递</a></li>
							<li><a href="%E4%BF%AE%E6%94%B9%E5%AF%86%E7%A0%81.html">修改密码</a></li>
							<li><a href="%E6%88%91%E7%9A%84%E7%AE%80%E5%8E%86.html">我的简历</a></li>

						</ul></li>

					<form action="" class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">搜索</button>
					</form>


					<li class="rightpo"><a href="../shen/shensx/html/login.html">登录
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="rightpo"><a href="../shen/shensx/html/zc.html">注册</a></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<!--导航栏结束--------------------------------------------------------------------------------------------------------------->

	<!--搜索功能-->
	<!--搜索功能-->
        <div class="container">
            <form class="form-inline">
                <div class="input-group input-group-sm floatright">
                    <input type="text" class="form-control" placeholder="Search for...">
                    <span class="input-group-btn">
                        <button class="btn btn-default" type="button">Go!</button>
                    </span>
                </div>
            </form>
        </div>
        <!--历史搜索关键字-->
        <div class="container biankuang">
            <div class="row">
                <div class="col-md-12">
                    我的搜索关键字：
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <span class="label label-success" style="background-color: #FFFFFF;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>

                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                </div>
            </div>
        </div>
        <!--热门-->
        <div class="container biankuang">
            <div class="row">
                <div class="col-md-12">
                    热门搜索：
                </div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <span class="label label-success" style="background-color: #FFFFFF;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</span>

                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                    <a href="#"><span class="label label-success">java招聘</span></a>
                </div>
            </div>
        </div>
        
        
        <!--最新展示-->
        <div class="container zhanshi">
            <div class="jumbotron">
                <h1>吴彦祖大家庭</h1>
                <p>我们现招软件工程师</p>
                <p><a class="btn btn-primary btn-lg" href="#" role="button">热招中</a></p>
            </div>
        </div>
        <!--招聘信息-->
        <div class="container">
        	<c:if test="${not empty recruitList}">
				<c:forEach items="${requestScope.recruitList}" var="recruit">
					<div class="panel panel-success" >
		                <div class="panel-heading">
		                    <h3 class="panel-title"><a href="#">职位</a></h3>
		                </div>
		                <div class="panel-body" style="background-color: #E8E8E8;padding:0px;margin: 0px;">
		                    <span style="font-size: 20px;padding:10px;margin: 0px;"><strong>公司</strong>:${recruit.compName}</span>
		                    <span style="color:#c9302c; float: right;padding:0px; padding-bottom:10px; padding-right:10px;"><strong>薪水</strong>：${recruit.recrSalary}</span><hr style="padding: 0px;"/>
		                    <span style="float: left; padding-bottom:10px; padding-left:10px;"><strong>职位</strong>:${recruit.recrJob}</span><hr style="padding: 0px;"/>
		                    <span style="float: left; padding-bottom:10px; padding-left:10px;"><strong>职责</strong>:${recruit.recrDuty}</span><hr style="padding: 0px;"/>
		                    <span style="float: left; padding-left:10px;"><strong>要求</strong>:${recruit.recrDemand}</span>
		                    <span style="float: right;padding-right:10px; padding-bottom:20px;"><strong>时间</strong>:${recruit.recrDate}</span>
		                    
		                </div>
		                 
		            </div>
					
				</c:forEach>
			</c:if>
       
            <!--分页-->
            <nav aria-label="Page navigation">
                <ul class="pagination" style="text-align:left;">
                    <li>
                        <a href="#" aria-label="Previous">
                            <span aria-hidden="true">&laquo;</span>
                        </a>
                    </li>
                    <li class="active"><a href="#">1</a></li>
                    <li><a href="#">2</a></li>
                    <li><a href="#">3</a></li>
                    <li><a href="#">4</a></li>
                    <li><a href="#">5</a></li>
                    <li>
                        <a href="#" aria-label="Next">
                            <span aria-hidden="true">&raquo;</span>
                        </a>
                    </li>
                </ul>
            </nav>
        </div>
	<!--copyright-------------------------------------------------------------------------------------------------------->
	<nav class="navbar-fixed-bottom">
		<div class="copyright ">
			<div class="container">
				<div class="row ">
					<div class="col-sm-12">
						<span>Copyright &copy; <a
							href="http://www.ghostchina.com/ ">万才网</a></span> | <span><a
							href="http://www.miibeian.gov.cn/ " target="_blank ">ICP121212121212</a></span>
						| <span>广工无敌套路</span>
					</div>
				</div>
			</div>
		</div>
	</nav>

</body>
</html>
