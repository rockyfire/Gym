<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>体育馆网上系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/my_resource.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/username.css">
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
                    <li><a id="gym" href="${pageContext.request.contextPath}/index.html">首页</a></li>
                    <li><a id="match" href="login_game.html">体育赛事</a></li>
                    <li><a id="ground" href="login_ground.html">场地详情</a></li>
                    <li><a id="equipment" href="login_equipment.html">闲置器材</a></li>
                    <li class="active"><a id="resource" href="#">我的资源</a></li>
                    <li><a id="notice" href="login_notice.html">公告通知</a></li>
                    <li><a id="connection" href="connection.html">联系我们</a></li>
                    <li><a id="personal" href="personal.html">个人资料</a></li>
                </ul>
                <div id="personal_information"><a href="${pageContext.request.contextPath}/index.html">退出登录</a></div>
            </div>
        </div>
    </nav>
    <table class="table table-bordered table-hover table-striped">
        <caption>我关注的赛事</caption>
        <thead>
            <tr>
                <th>赛事时间</th>
                <th>赛事地点</th>
                <th>赛事级别</th>
                <th>赛事主办方</th>
                <th>赛事详情</th>
                <th>赛事关注</th>
            </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
    <hr/>
    <table class="table table-bordered table-hover table-striped">
        <caption>我申请的赛事</caption>
        <thead>
            <tr>
                <th>赛事时间</th>
                <th>赛事地点</th>
                <th>赛事级别</th>
                <th>赛事主办方</th>
                <th>赛事详情</th>
                <th>是否通过</th>
            </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
    <table class="table table-bordered table-hover table-striped">
        <caption>我预定的场地</caption>
        <thead>
            <tr>
                <th>场地ID</th>
                <th>场地名称</th>
                <th>预约时间</th>
                <th>结束时间</th>
                <th>场地租金</th>
                <th>场地用途</th>
                <th>是否撤销</th>
                <th>是否通过</th>
            </tr>
        </thead>
        <tbody>

        </tbody>
    </table>
    <table class="table table-bordered table-hover table-striped">
        <caption>我租借的器材</caption>
        <thead>
            <tr>
                <th>器材ID</th>
                <th>器材名称</th>
                <th>租借数量</th>
                <th>借出时间</th>
                <th>归还时间</th>
                <th>器材租金</th>
                <th>器材用途</th>
                <th>是否撤销</th>
                <th>是否通过</th>
            </tr>
        </thead>
        <tbody>

        </tbody>
    </table>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/username.js"></script>
</body>
</html>