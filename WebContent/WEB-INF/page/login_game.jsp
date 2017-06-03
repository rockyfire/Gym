<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login_Equipment</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/username.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>

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
                    <li><a id="gym" href="${pageContext.request.contextPath}/index.jsp">首页</a></li>
                    <li class="active"><a id="game" href="#">体育赛事</a></li>
                    <li><a id="ground" href="login_ground.jsp">场地详情</a></li>
                    <li><a id="equipment" href="login_equipment.jsp">闲置器材</a></li>
                    <li><a id="resource" href="my_resource.jsp">我的资源</a></li>
                    <li><a id="notice" href="login_notice.jsp">公告通知</a></li>
                    <li><a id="connection" href="connection.jsp">联系我们</a></li>
                    <li><a id="personal" href="personal.jsp">个人资料</a></li>
                </ul>
                <div id="personal_information"><a href="${pageContext.request.contextPath}/index.jsp">退出登录</a></div>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <table class="table table-bordered table-hover table-striped">
                   <thead>
                        <tr>
                            <th>赛事时间</th>
                            <th>赛事地点</th>
                            <th>赛事级别</th>
                            <th>赛事主办方</th>
                            <th>赛事详情</th>
                            <th>关注赛事</th>
                        </tr>
                   </thead>
                   <tbody>

                   </tbody>
               </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="game_apply_a" href="#" class="list-group-item">赛事申请</a>
                    <a id="game_query_a" href="#" class="list-group-item">赛事查询</a>
                </div>
            </div>
        </div>
    </div>

    <form id="game_query">
		<p>
            <label for="game_query_time">比赛时间</label>
            <input id="game_query_time" type="text" name=""/>
        </p>
        <p>
            <label for="game_query_space">比赛地点</label>
            <input id="game_query_space"type="text" name=""/>
        </p>
        <p>
            <label for="game_query_type">比赛类型</label>
            <input id="game_query_type" type="text" name=""/>
        </p>
        <p>
            <label for="game_query_player">参赛单位</label>
            <input id="game_query_player" type="text" name=""/>
        </p>
	</form>
    <form id="game_apply">
        <p>
            <label for="game_apply_name">赛事名称:</label>
            <input id="game_apply_name" type="text" name=""/>
        </p>
        <p>
            <label for="host_unit">主办单位:</label>
            <input id="host_unit" type="text" name=""/>
        </p>
        <p>
            <label for="game_apply_time">举办时间:</label>
            <input id="game_apply_time" type="text" name=""/>
        </p>
        <p>
            <label for="game_apply_place">举办场地:</label>
            <input id="game_apply_place" type="text" name="">
        </p>
        <p>
            <label for="game_apply_lever">赛事级别:</label>
            <input id="game_apply_lever" type="text" name="">
        </p>
        <p>
            <label for="game_apply_type">赛事类别:</label>
            <input id="game_apply_type" type="text" name="">
        </p>
    </form>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login_game.js"></script>
</body>
</html>