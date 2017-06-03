<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Ground</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ground_public.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ground.css"/>
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
                    <li><a href="main.jsp">首页</a></li>
                    <li><a id="game" href="game.jsp">赛事管理</a></li>
                    <li class="active"><a id="ground" href="#">场地管理</a></li>
                    <li><a id="equipment" href="equipment.jsp">器材管理</a></li>
                    <li><a id="trace" href="trace.jsp">财务管理</a></li>
                    <li><a id="usermanager" href="usermanager.jsp">用户管理</a></li>
                    <li><a id="notice" href="notice.jsp">公告管理</a></li>
                    <li><a id="" href="">工作人员安排</a></li>
               </ul>
            </div>
        </div>
    </nav>
	<div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <table class="table table-bordered table-hover table-striped">
					<caption>场地管理</caption>
					<thead>
						<tr>
							<th>场地编号</th>
							<th>场地名称</th>
							<th>场地位置</th>
							<th>场地租金</th>
							<th>使用情况</th>
							<th>是否删除</th>
						</tr>
					</thead>
					<tbody>

					</tbody>
				</table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="ground_query_a" href="#" class="list-group-item">场地查询</a>
					<a id="ground_add_a" href="#" class="list-group-item">场地添加</a>
					<a id="ground_repair_a" href="ground_repair.jsp" class="list-group-item">维修情况</a>
					<a id="ground_rent_a" href="ground_rent.jsp" class="list-group-item">预约情况</a>
               </div>
            </div>
        </div>
    </div>




   	<div id="ground_add">
   		<form>
   			<p>
   				<label for="ground_add_name">场地名称</label>
   				<input id="ground_add_name" type="text" name="">
   			</p>
   			<p>
   				<label for="ground_add_type">场地类型</label>
   				<input id="ground_add_type" type="text" name="">
   			</p>
   			<p>
   				<label for="ground_add_location">场地位置</label>
   				<input id="ground_add_location" type="text" name="">
   			</p>
   			<p>
   				<label for="ground_add_rate">场地租金</label>
   				<input id="ground_add_rate" type="text" name="">
   			</p>
   			<p>
   				<label for="ground_add_description">场地说明</label>
   				<textarea id="ground_add_description"></textarea>
   			</p>
   		</form>
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
	</form>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ground_public.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ground.js"></script>
</body>
</html>