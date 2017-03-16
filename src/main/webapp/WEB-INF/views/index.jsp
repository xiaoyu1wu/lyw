<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
<title>项目</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="/lyw/js/jquery-3.1.1.min.js">
	
</script>
<link rel="stylesheet" href="/lyw/css/bootstrap.min.css" type="text/css">
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/lyw/js/bootstrap.min.js"></script>

<link href="/lyw/css/project_frontpage.css" rel="stylesheet"
	type="text/css">

<style>
body {
	background-color: lightskyblue;
}
</style>
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
					<li><a href="#">首页 <span class="sr-only">(current)</span></a></li>
					<li><a href="#">发现</a></li>
					<li class="active"><a href="#">发布</a></li>

					<!--下拉菜单-->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">消息<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="/lyw/message/getRecruitMessage.do">招聘消息</a></li>
							<li><a href="/lyw/message/getRecommendMessage.do">推荐消息</a></li>
							<li><a href="/lyw/message/getSystemMessage.do">系统消息</a></li>
							<li><a href="#">消息详情</a></li>

						</ul></li>
					<!--下拉菜单-->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">我的<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">我的求职</a></li>
							<li><a href="#">我的投递</a></li>
							<li><a href="#">我的账户</a></li>
							<li><a href="#">我的简历</a></li>
							<!--
                            <li role="separator" class="divider"></li>
<li><a href="#">Separated link</a></li>
-->
						</ul></li>

					<form class="navbar-form navbar-left">
						<div class="form-group">
							<input type="text" class="form-control" placeholder="Search">
						</div>
						<button type="submit" class="btn btn-default">搜索</button>
					</form>


					<li class="rightpo"><a href="/lyw/user/redirectLogin.do">登录
							<span class="sr-only">(current)</span>
					</a></li>
					<li class="rightpo"><a href="/lyw/user/redirectRegedit.do">注册</a></li>

				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</div>
		<!-- /.container-fluid -->
	</nav>
	<!--导航栏结束-->

	<div id="carousel-example-generic" class="carousel slide"
		data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#carousel-example-generic" data-slide-to="0"
				class="active"></li>
			<li data-target="#carousel-example-generic" data-slide-to="1"></li>
			<li data-target="#carousel-example-generic" data-slide-to="2"></li>

		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner" role="listbox" id="pic">
			<div class="item active" id="pic">
				<img src="/lyw/imgs/1474539799836.jpg" alt="kendalljenner">
				<div class="carousel-caption">kendalljenner</div>
			</div>
			<div class="item">
				<img id="pic"
					src="/lyw/imgs/gamersky_03origin_05_201612241730133.jpg" alt="car">
				<div class="carousel-caption">car</div>
			</div>
			<div class="item" id="pic">
				<img src="/lyw/imgs/Zed.jpg" alt="zed">
				<div class="carousel-caption">zed</div>
			</div>


		</div>

		<!-- Controls -->
		<a class="left carousel-control" href="#carousel-example-generic"
			role="button" data-slide="prev"> <span
			class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span
			class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#carousel-example-generic"
			role="button" data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>


	<!--招聘信息-->
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-4 section-header">
					<h1>最新招聘信息</h1>
				</div>
				<div class="col-sm-4 col-sm-offset-4">
					<h3>
						<a href="#" class="fcous">更多</a>
					</h3>
				</div>

			</div>
			<div class="row">
				<c:if test="${not empty recruitList}">
					<c:forEach items="${requestScope.recruitList}" var="recruit">
						<div class="col-sm-4">
							<article id=98 class="post">
								<div class="thumbnail">
									</br> <a href="#"><img src="/lyw/imgs/s1.jpg" alt="s1"
										class="zhaopin-pic"></a>
									<div class="caption">
										<h3>${recruit.recrJob}</h3>
										<h4>${recruit.recrPlace}</h4>
										<p>${recruit.compName}</p>

									</div>
								</div>
							</article>
						</div>
					</c:forEach>
				</c:if>

				<!-- <div class="col-sm-4">
					<article id=98 class="post">
						<div class="thumbnail">
							</br> <a href="#"><img src="/lyw/imgs/s1.jpg" alt="s1"
								class="zhaopin-pic"></a>
							<div class="caption">
								<h3>java工程师</h3>
								<p>上海进院子软件科技</p>

							</div>
						</div>
					</article>
				</div>

				<div class="col-sm-4 ">
					<article id=98 class="post">
						<div class="thumbnail">
							</br> <a href="#"><img src="/lyw/imgs/s1.jpg" alt="s1"
								class="zhaopin-pic"></a>
							<div class="caption">
								<h3>java工程师</h3>
								<p>上海进院子软件科技</p>

							</div>
						</div>
					</article>
				</div>
				<div class="col-sm-4">
					<article id=98 class="post">
						<div class="thumbnail">
							</br> <a href="#"><img src="/lyw/imgs/s1.jpg" alt="s1"
								class="zhaopin-pic"></a>
							<div class="caption">
								<h3>java工程师</h3>
								<p>上海进院子软件科技</p>

							</div>
						</div>
					</article>
				</div>
				<div class="col-sm-4 ">
					<article id=98 class="post">
						<div class="thumbnail">
							</br> <a href="#"><img src="/lyw/imgs/s1.jpg" alt="s1"
								class="zhaopin-pic"></a>
							<div class="caption">
								<h3>java工程师</h3>
								<p>上海进院子软件科技</p>

							</div>
						</div>
					</article>
				</div> -->
			</div>
		</div>
	</section>







	<!--copyright-->
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