<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Equipment</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_public.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment.css"/>
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
                <table class="table table-bordered table-hover">
                   <thead>
                        <caption>器材管理</caption>
                        <tr>
                            <th>器材名称</th>
                            <th>器材位置</th>
                            <th>器材租金</th>
                            <th>总数量</th>
                            <th>闲置数量</th>
                            <th>已借数量</th>
                            <th>维修数量</th>
                        </tr>
                   </thead>
                   <tbody>
						<s:iterator value="#request.equipment" var="equipment">
                    		<tr>
                    			<td>
                    				<div class="equipmentDetails">
                    					<s:property value="#equipment.equipmentName"/>
                    				</div>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.equipmentLocation"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.rentRate"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.equipmentAccount"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.idleNumber"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.rentedNumber"/>
                    				</p>
                    			</td>
                    			<td>
                    				<p>
                    					<s:property value="#equipment.repairNumber"/>
                    				</p>
                    			</td>
                    		</tr>
                    	</s:iterator>
                   </tbody>
               </table>
               <form action="equipmentAction_query" method="post">
			        <p>
			          <label for="equipment_query_name">器材名称</label>
			          <input id="equipment_query_name" type="text" name="equipmentVo.equipmentName">
			        </p>
			        <p>
			          <label for="equipment_query_type">器材类型</label>
			          <input id="equipment_query_type" type="text" name="equipmentVo.equipmentType">
			        </p>
			       	<input type="submit" value="提交" />
			    </form>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="equipment_query_a" href="equipmentAction_queryDetail" class="list-group-item">器材查询</a>
                    <a id="equipment_add_a" href="equipmentAction_detail" class="list-group-item">购置新添</a>
                    <a id="equipment_repair_a" href="equipmentRepairAction_detail" class="list-group-item">维修情况</a>
                    <a id="equipment_rent_a" href="equipmentRentAction_detail" class="list-group-item">租借情况</a>
                    <a id="equipment_return_a" href="equipmentRentAction_getDetailReturns" class="list-group-item">归还审核</a>
               </div>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/equipment_public.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/equipment.js"></script>