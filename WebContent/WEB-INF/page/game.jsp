<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Game</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/game.css">
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
                    <li><a href="main.html">首页</a></li>
                    <li class="active"><a id="game" href="#">赛事管理</a></li>
                    <li><a id="ground" href="ground.html">场地管理</a></li>
                    <li><a id="equipment" href="equipment.html">器材管理</a></li>
                    <li><a id="trace" href="trace.html">财务管理</a></li>
                    <li><a id="usermanager" href="usermanager.html">用户管理</a></li>
                    <li><a id="notice" href="notice.html">公告管理</a></li>
                    <li><a id="" href="">工作人员安排</a></li>
               </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <table class="table table-bordered table-hover table-striped">
                    <caption>赛事管理</caption>
                    <thead>
                        <tr>
                            <th>赛事名称</th>
                            <th>赛事时间</th>
                            <th>赛事场地</th>
                            <th><a id="game_detail_a" href="#">赛事详情</a></th>
                            <th>审核情况</th>
                        </tr>
                    </thead>
                    <tbody>
                    </tbody>
                 </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="game_query_a" href="#" class="list-group-item">赛事查询</a>
                </div>
            </div>
        </div>
    </div>

   	<div id="game_detail">
   		<form>
   			<p>
   				<label for="game_detail_name">赛事名称:</label>
                <input id="game_detail_name" type="text" name=""/>
   			</p>
   			<p>
   				<label for="host_unit">主办单位:</label>
                 <input id="host_unit" type="text" name=""/>
   			</p>
   			<p>
   				<label for="game_detail_time">举办时间:</label>
                <input id="game_detail_time" type="text" name=""/>
   			</p>
   			<p>
   				<label for="game_detail_place">举办场地:</label>
   				<input id="game_detail_place" type="text" name="">
   			</p>
            <p>
   				<label for="game_detail_lever">赛事级别:</label>
   				<input id="game_detail_lever" type="text" name="">
   			</p>
            <p>
   				<label for="game_detail_type">赛事类别:</label>
   				<input id="game_detail_type" type="text" name="">
   			</p>
            <p>
   				<label for="game_detail_check">赛事审核:</label>
   				<input id="game_detail_check" type="text" name="">
   			</p>
   		</form>
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

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/game.js"></script>
</body>
</html>