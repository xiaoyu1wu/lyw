<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>登录</title>
        <meta charset="UTF-8">
		<meta name="keywords" content="人才,登录,招聘">
		<meta name="description" content="万才网登录">
		<meta name="author" content="王神勇">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">     
        <link href="../css/bootstrap-3.3.5-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css">
        <link href="../css/loginzuc.css" rel="stylesheet" type="text/css">
        <script language="javascript" src="../css/bootstrap-3.3.5-dist/js/bootstrap.min.js"></script>
        <script language="javascript" src="../css/bootstrap-3.3.5-dist/js/jquery.js"></script>
    </head>
    <body>
        <!--导航标-->
        <div class="container ">
            <div class="row daohang ">
                <div class="col-md-2">
                   <a href="#"> <span class="glyphicon glyphicon-menu-left  floatleft lh"></span></a>
                </div>
                <div class="col-md-10  ">
                    <span class="floatright lh">登录</span>
                </div>
            </div>
        </div>
		<!--表单-->
        <div class="container formclass">
            <form class="form-horizontal">   
			<!--登录用户名-->
                <div class="input-group input-group-sm wh">
                    <span class="input-group-addon " id="sizing-addon2"><span class="glyphicon glyphicon-user"> </span></span>
                    <input type="text" class="form-control" placeholder="邮箱/用户名" aria-describedby="sizing-addon1" />
                </div> 
				<!--密码-->
                <div class="input-group input-group-sm wh">
                    <span class="input-group-addon" id="sizing-addon2"><span class="glyphicon glyphicon-lock"> </span></span>
                    <input type="text" class="form-control" placeholder="密码" aria-describedby="sizing-addon1" />
                </div>   
			<!--登录类型选择-->				
                <div class="form-group wh">     
                    <div class="radio col-md-6 col-lg-6 col-xs-6">
                        <label>
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                            个人
                        </label>
                    </div>   
                    <div class="radio col-md-6 col-lg-6 col-xs-6">
                        <label>
                            <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" >
                            企业
                        </label>
                    </div>     
                </div> 
				<!--忘记密码与注册连接-->
                <div class="input-group input-group-sm wh"  aria-label="...">
                    <a  href="#" class="col-md-6  col-lg-6 col-xs-6 ">忘记密码</a>
                    <a  href="./zc.html" class="col-md-6   col-lg-6 col-xs-6  ">快速注册</a>
                </div>
				<!--登录按钮-->
                <div class="btn-group btn-group-justified " role="group" >
                    <input class="btn btn btn-success btn-primary btn-block" type="submit" value="登录">
                </div>
            </form>
        </div>   
    </body>
</html>
