<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>0
<head>
    <meta charset="UTF-8">
    <title>Equipment_repair</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_public.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_repair.css">
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
                    <li class="active"><a id="equipment" href="equipmentAction_detail">器材管理</a></li>
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
                    <caption>维修情况</caption>
                    <thead>
                        <tr>
                            <th>维修编号</th>
                            <th>维修器材</th>
                            <th>维修时间</th>
                            <th>维修数量</th>
                            <th>支出金额</th>
                            <th>维修人员</th>
                            <th>维修内容</th>
                        </tr>
                   </thead>
                   <tbody>
                   		<s:iterator value="#request.equipmentRepair" var="equipment">
                    		<tr>
                    			<td>
                    				<div class="equipmentDetails">
                    					<s:property value="#equipment.equipmentRepairNumber"/>
                    				</div>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.equipmentName"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.equipmentTime"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.equipmentNumber"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.pay"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.workers"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.description"/>
                    				</p>
                    			</td>
                    		</tr>
                    	</s:iterator>
                        <tr><td colspan="7" align="center"><a id="equipment_repair_apply_a"  href="#">添加维修</a></td></tr>
                   </tbody>
               </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="equipment_query_a" href="#" class="list-group-item">器材查询</a>
                    <a id="equipment_add_a" href="#" class="list-group-item">购置新添</a>
                    <a id="equipment_repair_a" href="#" class="list-group-item">维修情况</a>
                    <a id="equipment_rent_a" href="equipmentRentAction_detail" class="list-group-item">租借情况</a>
               </div>
            </div>
        </div>
    </div>

    <form id="equipment_repair_apply">
        <p>
          <label for="equipment_repair_apply_name">器材名称</label>
          <input id="equipment_repair_apply_name" type="text" name="equipmentRepairVo.equipmentName">
        </p>
        <p>
          <label for="equipment_repair_apply_time">维修时间</label>
          <input id="equipment_repair_apply_time" type="text" name="equipmentRepairVo.equipmentTime">
        </p>
        <p>
          <label for="equipment_repair_apply_rate">支出金额</label>
          <input id="equipment_repair_apply_rate" type="text" name="equipmentRepairVo.pay">
        </p>
        <p>
          <label for="equipment_repair_apply_admin">维修人员</label>
          <input id="equipment_repair_apply_admin" type="text" name="equipmentRepairVo.workers">
        </p>
        <p>
          <label for="equipment_repair_apply_number">器材数量</label>
          <input id="equipment_repair_apply_number" type="text" name="equipmentRepairVo.equipmentNumber" placeholder="" />
        </p>
        <p>
          <label for="equipment_repair_apply_content">维修内容</label>
          <textarea id="equipment_repair_apply_content" name="equipmentRepairVo.description"></textarea>
        </p>
    </form>

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
          <label for="equipment_add_buytime">购入时间</label>
          <input id="equipment_add_buytime" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_number">器材数量</label>
          <input id="equipment_add_number" type="text" name="">
        </p>
        <p>
          <label for="equipment_add_description">器材说明</label>
          <textarea id="equipment_add_description" name="description"></textarea>
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
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/equipment_repair.js"></script>
</body>
</html>