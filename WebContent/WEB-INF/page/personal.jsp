<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>完善个人信息</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/person.css"/>
</head>
<body>
    <nav class="navbar navbar-inverse">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed"
                        data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
                        aria-expanded="false">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">Gym</a>
            </div>
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a id="game" href="login_game.html">体育赛事</a></li>
                    <li><a id="ground" href="login_ground.html">场地详情</a></li>
                    <li><a id="equipment" href="login_equipment.html">闲置器材</a></li>
                    <li><a id="resource" href="my_resource.html">我的资源</a></li>
                    <li><a id="notice" href="login_notice.html">公告通知</a></li>
                    <li><a id="connection" href="connection.html">联系我们</a></li>
                    <li class="active"><a id="personal" href="personal.html">个人资料</a></li>
                </ul>
                <div id="personal_information"><a href="${pageContext.request.contextPath}/index.html">退出登录</a></div>
            </div>
        </div>
    </nav>

    <form>
        <p>
             <label for="unit">单位:</label>
             <input id="unit" type="text" name=""/>
        </p>
        <p>
            <label for="user_id">身份号:</label>
            <input id="user_id" type="text" name=""/>
        </p>
        <p>
            <label for="email">邮箱:</label>
            <input id="email" type="text" name=""/>
        </p>
        <p>
            <label for="hostel">宿舍:</label>
            <input id="hostel" type="text" name=""/>
        </p>
    </form>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
</body>
</html>