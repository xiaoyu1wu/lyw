<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<html>
<head>
<title>注册</title>
<meta charset="UTF-8">
<meta name="keywords" content="人才,登录,招聘">
<meta name="description" content="万才网登录">
<meta name="author" content="王神勇">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<link href="/lyw/css/bootstrap.min.css" rel="stylesheet" type="text/css">
<link href="/lyw/css/loginzuc.css" rel="stylesheet" type="text/css">
<script language="javascript" src="/lyw/css/bootstrap.min.js"></script>
<script language="javascript" src="/lyw/js/jquery-3.1.1.min.js"></script>
</head>
<body>
	<!--导航标-->
	<div class="container">
		<div class="row daohang ">
			<div class="col-md-2">
				<a href="#"> <span
					class="glyphicon glyphicon-menu-left  floatleft lh"></span></a>
			</div>
			<div class="col-md-10  ">
				<span class="floatright lh">注册</span>
			</div>
		</div>
	</div>


	<!--表单-->
	<div class="container formclass">

		<c:if test="${not empty message}">
					<p>错误信息: <c:out value="${message}"></c:out>
					</p>
		</c:if>
		
			<form class="form-horizontal" action="/lyw/user/regedit.do"
			method="post">
			<!--邮箱-->
			<div class="input-group input-group-sm wh">
				<span class="input-group-addon "><span
					class="glyphicon glyphicon-envelope"> </span></span> <input id="email"
					name="email" type="text" class="form-control" placeholder="邮箱"
					aria-describedby="sizing-addon1" />
			</div>
			<!--验证码-->
			<div class="input-group input-group-sm wh">
				<span class="input-group-addon "><span
					class="glyphicon glyphicon-user"> </span></span> <input id="yzm"
					name="yzm" type="text" class="form-control" placeholder="验证码"
					aria-describedby="sizing-addon1" /> <span
					class="input-group-addon "><a href="#">点击获取验证码</a></span>
			</div>
			<!--用戶名-->
			<div class="input-group input-group-sm wh">
				<span class="input-group-addon "><span
					class="glyphicon glyphicon-user"> </span></span> <input id="name"
					name="name" type="text" class="form-control" placeholder="用户名"
					aria-describedby="sizing-addon1" />
			</div>
			<!--密码-->
			<div class="input-group input-group-sm wh">
				<span class="input-group-addon "><span
					class="glyphicon glyphicon-lock"> </span></span> <input id="password"
					name="password" type="password" class="form-control"
					placeholder="密码" aria-describedby="sizing-addon1" />
			</div>
			<!--重新输入密码-->
			<div class="input-group input-group-sm wh">
				<span class="input-group-addon "><span
					class="glyphicon glyphicon-lock"> </span></span> <input
					id="confirmPassword" name="confirmPassword" type="password"
					class="form-control" placeholder="再次确认密码"
					aria-describedby="sizing-addon1" />
			</div>
			<!--选择登录类型-->
			<div class="form-group wh">
				<div class="radio col-md-6 col-lg-6 col-xs-6">
					<label> <input type="radio" name="type" id="type"
						value="person" checked> 个人
					</label>
				</div>
				<div class="radio col-md-6 col-lg-6 col-xs-6">
					<label> <input type="radio" name="type" id="type"
						value="company"> 企业
					</label>
				</div>
			</div>
			<!--协议复选框-->
			<div class="checkbox">
				<label> <input id="confirmProtocol" name="confirmProtocol"
					type="checkbox" class="" value=""> 我已经阅读并同意本网站协议
				</label>
			</div>
			<!--登录按钮-->
			<div class="btn-group btn-group-justified xiexi " role="group">
				<input class="btn btn btn-success btn-primary btn-block"
					type="submit" value="注册">
			</div>
		</form>
	</div>
</body>
</html>
