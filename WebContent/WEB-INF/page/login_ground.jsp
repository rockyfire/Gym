<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login_Ground</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/username.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login_ground.css">
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
                    <li class="active"><a id="ground" href="#">场地详情</a></li>
                    <li><a id="equipment" href="login_equipment.html">闲置器材</a></li>
                    <li><a id="resource" href="my_resource.html">我的资源</a></li>
                    <li><a id="notice" href="login_notice.html">公告通知</a></li>
                    <li><a id="connection" href="connection.html">联系我们</a></li>
                    <li><a id="personal" href="personal.html">个人资料</a></li>
                </ul>
                <div id="personal_information"><a href="${pageContext.request.contextPath}/index.html">退出登录</a></div>
            </div>
        </div>
    </nav>


    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <table class="table table-bordered table-hover table-striped">
                   <thead>
                        <tr>
                            <th>场地名称</th>
                            <th>场地位置</th>
                            <th>场地租金</th>
                            <th>使用情况</th>
                            <th>是否预约</th>
                        </tr>
                   </thead>
                   <tbody>

                   </tbody>
               </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="ground_rent_a" href="#" class="list-group-item">场地预定</a>
                    <a id="ground_query_a" href="#" class="list-group-item">场地查询</a>
                </div>
            </div>
        </div>
    </div>


    <form id="ground_query">
		<p>
			<label for="ground_query_name">场地名称</label>
			<input id="ground_query_name" type="text" name="">
		</p>
		<p>
			<label for="ground_query_type">场地类型</label>
			<input id="ground_query_type" type="text" name="">
		</p>
		<p>
			<label for="ground_query_location">场地位置</label>
			<input id="ground_query_location" type="text" name="">
		</p>
		<p>
			<label for="ground_query_isuse">可用状态</label>
			<input id="ground_query_isuse" type="text" name="">
		</p>
		<p>
			<label for="ground_query_admin">管理人员</label>
			<input id="ground_query_admin" type="text" name="">
		</p>
	</form>
    <form id="ground_rent">
        <p>
          <label for="ground_rent_name">场地名称</label>
          <input id="ground_rent_name" type="text" name="">
        </p>
        <p>
          <label for="ground_rent_borrow">预约时间</label>
          <input id="ground_rent_borrow" type="text" name="">
        </p>
        <p>
          <label for="ground_rent_end">结束时间</label>
          <input id="ground_rent_end" type="text" name="">
        </p>
        <p>
          <label for="ground_rent_money">场地租金</label>
          <input id="ground_rent_money" type="text" name="" disabled="disabled">
        </p>
        <p>
          <label for="ground_rent_location">场地用途</label>
          <input id="ground_rent_location" type="text" name="">
        </p>
    </form>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login_ground.js"></script>
</body>
</html>