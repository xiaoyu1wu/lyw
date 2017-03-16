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
<!doctype html>

<html>

<head>
<title>招聘消息</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script src="/lyw/js/jquery-3.1.1.min.js">
	
</script>

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
					<li><a href="../faxian/%E5%8F%91%E7%8E%B0.html">发现</a></li>
					<li class="dropdown"><a href="" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">发布<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="../fabu/%E5%8F%91%E5%B8%83%E6%8B%9B%E8%81%98.html">发布招聘</a></li>
							<li><a
								href="../fabu/%E5%8F%91%E5%B8%83%E6%B1%82%E8%81%8C.html">发布求职</a></li>


						</ul></li>

					<!--下拉菜单-->
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">消息<span class="caret"></span></a>
						<ul class="dropdown-menu">
                            <li><a href="/lyw/message/getRecruitMessage.do">招聘消息</a></li>
                            <li><a href="/lyw/message/getRecommendMessage.do">推荐消息</a></li>
                            <li><a href="/lyw/message/getSystemMessage.do">系统消息</a></li>
                            <li><a href="#">消息详情</a></li>

                        </ul>
                    </li>
					<!--下拉菜单-->
					<li class="dropdown"><a href="%E6%88%91%E7%9A%84.html"
						class="dropdown-toggle" data-toggle="dropdown" role="button"
						aria-haspopup="true" aria-expanded="false">我的<span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a
								href="../wode/%E6%88%91%E7%9A%84%E6%B1%82%E8%81%8C.html">我的求职</a></li>
							<li><a
								href="../wode/%E6%88%91%E7%9A%84%E6%8A%95%E9%80%92.html">我的投递</a></li>
							<li><a
								href="../wode/%E4%BF%AE%E6%94%B9%E5%AF%86%E7%A0%81.html">修改密码</a></li>
							<li><a
								href="../wode/%E6%88%91%E7%9A%84%E7%AE%80%E5%8E%86.html">我的简历</a></li>
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
	<!--导航栏结束-->



	<section>
		<div class="container">
			<div class="row">
				<c:if test="${not empty messageList}">
					<c:forEach items="${requestScope.messageList}" var="messageItem">
						<div class="col-sm-4">
							<article id=98 class="post">
								<div class="thumbnail">


									<div class="caption">
										<a href="#">
											<h3>${messageItem.resource}</h3>
										</a>
										<p>${messageItem.content}</p>

									</div>

								</div>
							</article>
						</div>
					</c:forEach>
				</c:if>
				<c:if test="${empty messageList}">
					<div class="col-sm-12">
						<article id=98 class="post">
							<div class="thumbnail">


								<div class="caption">
									<h1>暂无消息</h1>

								</div>

							</div>
						</article>
					</div>
				</c:if>
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