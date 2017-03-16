<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
<title>我的</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="js/jquery-3.1.1.min.js">
	
</script>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="js/bootstrap.min.js"></script>

<link href="project_frontpage.css" rel="stylesheet" type="text/css">

</head>

<body>
	<header class="main-header">
	<div class="container">
		<div class="row ">
			<div class="col-sm-12 ">

				<!-- start logo -->
				<a href="#" title="万才网"><img
					src="http://static.ghostchina.com/image/b/46/4f5566c1f7bc28b3f7ac1fada8abe.png "
					alt="万才网" class="center-block"></a>
				<!-- end logo -->
				<h2 class="text-hide ">Ghost
					是一个简洁、强大的写作平台。你只须专注于用文字表达你的想法就好，其余的事情就让 Ghost 来帮你处理吧。</h2>

				<img class="img-responsive center-block hide"
					src="http://static.ghostchina.com/image/6/d1/fcb3879e14429d75833a461572e64.jpg "
					alt="Ghost 博客系统 ">
			</div>
		</div>
	</div>
	</header>
	<nav class="navbar navbar-default">
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
				<li class="active"><a href="shen/%E7%99%BB%E5%BD%95.html">登录
						<span class="sr-only">(current)</span>
				</a></li>
				<li><a href="shen/%E6%B3%A8%E5%86%8C.html">注册</a></li>

			</ul>
			<form class="navbar-form navbar-left">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button type="submit" class="btn btn-default">Submit</button>
			</form>

		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>
	</h>
	<div class="myinfo">
		<a href="#">我的简历</a>
	</div>
	<div class="myinfo">
		<a href="#">我的求职</a>

	</div>

	<div class="myinfo">
		<a href="#">我的投递</a>
	</div>
	<div class="myinfo">
		<a href="#">帮助与反馈</a>
	</div>
	<div class="myinfo">
		<a href="#">关于我们</a>
	</div>

	<nav class="main-navigation navbar navbar-default">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navfooter"
				aria-expanded="false">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>

		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="nav-footer collapse navbar-collapse" id="navfooter">
			<ul class="navfooter-menu">
				<li><a href="#">首页 <span class="sr-only">(current)</span></a></li>
				<li><a href="#">发现</a></li>
				<li class="active"><a href="#">+</a></li>
				<li><a href="#">消息</a></li>
				<li><a href="#">我的</a></li>

			</ul>


		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container-fluid --> </nav>

	<footer> </footer>

	<div class="copyright ">
		<div class="container">
			<div class="row ">
				<div class="col-sm-12">
					<span>Copyright &copy; <a href="http://www.ghostchina.com/ ">万才网</a></span>
					| <span><a href="http://www.miibeian.gov.cn/ "
						target="_blank ">ICP121212121212</a></span> | <span>广工无敌套路</span>
				</div>
			</div>
		</div>
	</div>


</body>

</html>