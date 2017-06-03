<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Equipment_rent</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_public.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_rent.css">
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
                    <li><a id="ground" href="ground.jsp">场地管理</a></li>
                    <li class="active"><a id="equipment" href="equipment.jsp">器材管理</a></li>
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
                    <caption>租借详情</caption>
                    <thead>
                        <tr>
                            <th>租借编号</th>
                            <th>租借名称</th>
                            <th>租借数量</th>
                            <th>租借用户</th>
                            <th>借出时间</th>
                            <th>归还时间</th>
                            <th>器材租金</th>
                            <th>用途详情</th>
                        </tr>
                    </thead>
                    <tbody>

                    </tbody>
                </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="equipment_query_a" href="#" class="list-group-item">器材查询</a>
                    <a id="equipment_add_a" href="#" class="list-group-item">购置新添</a>
                    <a id="equipment_repair_a" href="equipment_repair.jsp" class="list-group-item">维修情况</a>
                    <a id="equipment_rent_a" href="#" class="list-group-item">租借情况</a>
               </div>
            </div>
        </div>
    </div>


    <form id="equipment_add">
        <p>
          <label for="equipment_add_name">器材名称</label>
          <input id="equipment_add_name" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_type">器材类型</label>
          <input id="equipment_add_type" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_location">器材位置</label>
          <input id="equipment_add_location" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_rate">器材租金</label>
          <input id="equipment_add_rate" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_number">器材数量</label>
          <input id="equipment_add_number" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_buytime">购入时间</label>
          <input id="equipment_add_buytime" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_description">器材说明</label>
          <textarea id="equipment_add_description"></textarea>
        </p>
    </form>

    <form id="equipment_query">
        <p>
          <label for="equipment_query_name">器材名称</label>
          <input id="equipment_query_name" type="text" name="">
        </p>
        <p>
          <label for="equipment_query_type">器材类型</label>
          <input id="equipment_query_type" type="text" name="">
        </p>
        <p>
          <label for="equipment_query_location">器材位置</label>
          <input id="equipment_query_location" type="text" name="">
        </p>
        <p>
          <label for="equipment_query_canuse">可用状态</label>
          <input id="equipment_query_canuse" type="text" name="">
        </p>
    </form>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/equipment_public.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/equipment_rent.js"></script>