<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>NoLogin_Equipment</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/username.css"/>
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
                    <li class="active"><a id="equipment" href="#">闲置器材</a></li>
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
               <form action="equipmentAction_query?user=hello" method="post" style="visibility: visible">
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
                    <a id="equipment_rent_a"  href="#" class="list-group-item">器材租借</a>
                    <a id="equipment_query_a" href="#" class="list-group-item">器材查询</a>
                    <a id="equipment_return" href="equipmentRentAction_detailReturn?leaseHolder=111" class="list-group-item">器材归还</a>
                </div>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login_equipment.js"></script>
</body>
</html>