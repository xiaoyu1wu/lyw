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
    <title>我的</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script src="/lyw/js/jquery-3.1.1.min.js">
    </script>

    <link rel="stylesheet" href="/lyw/css/bootstrap.min.css" type="text/css">
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="/lyw/js/bootstrap.min.js"></script>
    <link href="/lyw/css/project_frontpage.css" rel="stylesheet" type="text/css">

    <link href="/lyw/css/myinfo.css" rel="stylesheet" type="text/css">
    <link href="/lyw/css/xiaoxi.css" rel="stylesheet" type="text/css">

</head>

<body>

    <!--   导航栏-->
    <nav class="navbar navbar-inverse">
        <div class="container">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">万才网</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="/lyw/user/index.do">首页 <span class="sr-only">(current)</span></a></li>
                    <li><a href="../%25E5%258F%2591%25E7%258E%25B0/%E5%8F%91%E7%8E%B0.html">发现</a></li>
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">发布<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="../%25E5%258F%2591%25E5%25B8%2583/%E5%8F%91%E5%B8%83%E6%8B%9B%E8%81%98.html">发布招聘</a></li>
                            <li><a href="../%25E5%258F%2591%25E5%25B8%2583/%E5%8F%91%E5%B8%83%E6%B1%82%E8%81%8C.html">发布求职</a></li>


                        </ul>
                    </li>

                    <!--下拉菜单-->
                    <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">消息<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="../%25E6%25B6%2588%25E6%2581%25AF/%E6%8B%9B%E8%81%98%E6%B6%88%E6%81%AF.html">招聘消息</a></li>
                            <li><a href="../%25E6%25B6%2588%25E6%2581%25AF/%E6%8E%A8%E8%8D%90%E6%B6%88%E6%81%AF.html">推荐消息</a></li>
                            <li><a href="../%25E6%25B6%2588%25E6%2581%25AF/%E7%B3%BB%E7%BB%9F%E6%B6%88%E6%81%AF.html">系统消息</a></li>
                            <li><a href="../%25E6%25B6%2588%25E6%2581%25AF/%E6%B6%88%E6%81%AF%E8%AF%A6%E6%83%85.html">消息详情</a></li>

                        </ul>
                    </li>
                    <!--下拉菜单-->
                    <li class="dropdown">
                        <a href="/lyw/usermessage/myResume" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">我的<span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="/lyw/usermessage/myApplicationForJob">我的求职</a></li>
                            <li><a href="/lyw/usermessage/myDeliver">我的投递</a></li>
                            <li><a href=/lyw/usermessage/modifyPassword">修改密码</a></li>
                            <li><a href="/lyw/usermessage/myResume">我的简历</a></li>
                            <!--
                            <li role="separator" class="divider"></li>
<li><a href="#">Separated link</a></li>
-->
                        </ul>
                    </li>

                    <form class="navbar-form navbar-left">
                        <div class="form-group">
                            <input type="text" class="form-control" placeholder="Search">
                        </div>
                        <button type="submit" class="btn btn-default">搜索</button>
                    </form>


                    <li class="rightpo"><a href="../shen/shensx/html/login.html">登录 <span class="sr-only">(current)</span></a>
                    </li>
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
            <div class="myinfoimg">
                <div>
                    <a href="/lyw/usermessage/personCenter"><img src="/lyw/imgs/1461659538522276.png" alt="昵称"></img>
                    </a>
                </div>
                <label>昵称</label>
                <hr/>

            </div>
            <!--个人信息左侧导航栏-->
            <div class="row">
                <div class="col-sm-2 myinfonav">
                    <ul class="nav nav-pills nav-stacked">
                        <li><a href="/lyw/usermessage/myResume.do">我的简历</a></li>
                        <li><a href="/lyw/usermessage/myApplicationForJob.do">我的求职</a></li>
                        <li><a href="/lyw/usermessage/myDeliver.do">我的投递</a></li>

                        <li><a href="/lyw/usermessage/modifyPassword.do">修改密码</a></li>
                    </ul>
                </div>
                <!--个人信息导航栏结束-->
                <!--                个人信息主界面-->
                <div class="col-sm-8 sidebar">

                    <form class="form-horizontal" action="/lyw/usermessage/modifyMyMessage.do" method="post">

                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">昵称</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="nickname" placeholder="昵称" name="userName" value="${user.userName }">
                            </div>
                        </div>
                      <!--   <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">职业</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" id="position" placeholder="软件开发工程师" name="">
                            </div>
                        </div> -->
                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">地址</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="address" placeholder="所在地" name="userLivingCity" value="${user.userLivingCity }">
                            </div>
                        </div>
                        <!-- <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">擅长领域</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" id="goodat" placeholder="擅长领域">
                            </div>
                        </div> -->
                        <div class="form-group">
                            <label for="inputpassword" class="col-sm-2 control-label">电话</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="tele" placeholder="电话" name="userPhone" value="${user.userPhone }">
                            </div>
                        </div>



                        <div class="form-group">
                            <label for="inputE" class="col-sm-2 control-label">email：</label>
                            <div class="col-sm-8">
                                <input type="email" class="form-control" id="inputE" placeholder=""  name="userEmail" value="${user.userEmail }">
                              
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label ">性别</label>
                            <div class="col-sm-8">
                                <label class="radio-inline">
                                    <input type="radio" name="sex" id="inlineRadio1" value="option1">男

                                </label>
                                <label class="radio-inline">
                                    <input type="radio" name="sex" id="inlineRadio2" value="option1">女

                                </label>
                            </div>
                        </div>


                        <!-- <div class="form-group">
                            <label class="col-sm-2 control-label">兴趣</label>
                            <div class="col-sm-8">
                                <label class="checkbox-inline">
                                    <input type="checkbox" name="inlineRadioOptions" id="inlineCheckbox1" value="option1">玩游戏

                                </label>
                                <label class="checkbox-inline">
                                    <input type="checkbox" name="inlineRadioOptions" id="inlineCheckbox2" value="option2">打代码
                                </label>
                            </div>

                        </div> -->

                        <div>
                            <div class="row">
                                <div class="save">
                                    <button type="submit" class="btn btn-primary">保存修改</button>

                                </div>
                            </div>
                        </div>
                    </form>
                </div>
                <!--        个人信息界面结束-->
            </div>
        </div>
    </section>




    <!--copyright-->
    <nav class="navbar-fixed-bottom">
        <div class="copyright ">
            <div class="container">
                <div class="row ">
                    <div class="col-sm-12">
                        <span>Copyright &copy; <a href="http://www.ghostchina.com/ ">万才网</a></span> |
                        <span><a href="http://www.miibeian.gov.cn/ " target="_blank ">ICP121212121212</a></span> |
                        <span>广工无敌套路</span>
                    </div>
                </div>
            </div>
        </div>
    </nav>

</body>

</html>