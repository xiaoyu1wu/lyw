<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>

<head>
    <title>error</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <script src="/lyw/js/jquery-3.1.1.min.js">
    </script>
    <link rel="stylesheet" href="/lyw/css/bootstrap.min.css" type="text/css">
    <script src="/lyw/js/bootstrap.min.js"></script>

    <link href="/lyw/css/project_frontpage.css" rel="stylesheet" type="text/css">

    <style>
        body {
            background-color: silver;
        }
    </style>
</head>

<body>
	<p style="text-align:center; background-color:red;">系统内部出现错误</p>
</body>
</html>