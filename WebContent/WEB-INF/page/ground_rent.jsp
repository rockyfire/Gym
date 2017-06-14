<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ground_notice</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ground_public.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/ground_repair.css">
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
                    <li><a id="game" href="game.html">赛事管理</a></li>
                    <li class="active"><a id="ground" href="ground.html">场地管理</a></li>
                    <li><a id="equipment" href="equipment.html">器材管理</a></li>
                    <li><a id="trace" href="trace.html">财务管理</a></li>
                    <li><a id="usermanager" href="usermanager.html">用户管理</a></li>
                    <li><a id="notice" href="notice.html">公告管理</a></li>
                    <li><a id="worker" href="worker.html">工作人员管理</a></li>
               </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <table class="table table-bordered table-hover table-striped">
                    <caption>预约详情</caption>
                    <thead>
                        <tr>
                            <th>场地编号</th>
                            <th>租借编号</th>
                            <th>预约时间</th>
                            <th>归还时间</th>
                            <th>场地租金</th>
                            <th>用途详情</th>
                        </tr>
                    </thead>
                    <tbody>
						<s:iterator value="#request.groundRentVos" var="groundRentVo">
							<tr>
								<td><s:property value="#groundRentVo.groundNumber"/></td>
								<td><s:property value="#groundRentVo.groundRentNumber"/></td>
								<td><s:property value="#groundRentVo.rentTime"/></td>
								<td><s:property value="#groundRentVo.returnTime"/></td>
								<td><s:property value="#groundRentVo.rentRate"/></td>
								<td><s:property value="#groundRentVo.description"/></td>
							</tr>
						</s:iterator>
                    </tbody>
                </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="ground_add_a" href="#" class="list-group-item">添加预约</a>
                    <a id="ground_rent_a" href="#" class="list-group-item">预约情况</a>
               </div>
            </div>
        </div>
    </div>

<!-- 添加预约 -->
    <form id="ground_add" action="groundAction_addGroundRent" method="get">
        <p>
            <label for="ground_add_name">场地编号</label>
            <input id="ground_add_name" type="text" name="groundRentVo.groundNumber">
        </p>
        <p>
            <label for="ground_add_type">出借时间</label>
            <input id="ground_add_type" type="text" name="groundRentVo.rentTime">
        </p>
        <p>
            <label for="ground_add_location">归还时间</label>
            <input id="ground_add_location" type="text" name="groundRentVo.returnTime">
        </p>
        <p>
            <label for="ground_add_rate">用途描述</label>
            <input id="ground_add_rate" type="text" name="groundRentVo.description">
        </p>
        <s:submit value="提交"></s:submit>
    </form>

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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/ground_repair.js"></script>
</body>
</html>