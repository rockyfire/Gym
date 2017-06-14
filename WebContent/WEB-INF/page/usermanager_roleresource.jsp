<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head lang="en">
    <meta charset="UTF-8">
    <title>user_RoleResource</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
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
                    <li><a href="main.html">首页</a></li>
                    <li><a id="game" href="game.html">赛事管理</a></li>
                    <li><a id="ground" href="ground.html">场地管理</a></li>
                    <li><a id="equipment" href="equipment.html">器材管理</a></li>
                    <li><a id="trace" href="trace.html">财务管理</a></li>
                    <li class="active"><a id="usermanager" href="usermanager.html">用户管理</a></li>
                    <li><a id="notice" href="notice.html">公告管理</a></li>
                    <li><a id="" href="">工作人员安排</a></li>
               </ul>
            </div>
        </div>
    </nav>



    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <div class="modal-body">
                    <div class="text-center">
                        <span class="text-right">当前角色：<s:property value="#request.roleName"/></span>
                    </div>
                    <form action="roleAction_updateRoleResources" method="get">
                        <table class="table table-bordered table-responsive table-striped">
                            <thead>
                            <tr>
                                <th>资源编号</th>
                                <th>资源名称</th>
                                <th>资源描述</th>
                                <th>选中</th>
                            </tr>
                            </thead>
                            
                            <tbody>
                            	<s:iterator value="#request.resources" var="resource">
                            		<tr>
                            			<td><div><s:property value="#resource.roleResoruceNumber"/></div></td>
                            			<td><div><s:property value="#resource.roleResourceName"/></div></td>
                            			<td><div><s:property value="#resource.description"/></div></td>
                            			<td>
	                            			<div>
	                            				<input type="checkbox" name="resourceNumbers" 
	                            						<s:if test="#resource.roleNumber!=null">
	                            							checked="checked"
	                            						</s:if>
	                            						value='<s:property value="#resource.roleResoruceNumber"/>'>
	                            			</div>
                            			</td>
                            		</tr>
                            	</s:iterator>
                            </tbody>
                        </table>
                        <input type="hidden" name="roleVo.roleNumber" value='<s:property value="#request.roleNumber"/>'>
                        <s:submit value="提交"></s:submit>
                    </form>
                </div>
            <!--列出左右的资源，如果该资源是该角色拥有的就在复选框中选上-->
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="" class="list-group-item">用户查询</a>
                    <a id="" data-toggle="modal" data-target="#add_user" class="list-group-item">新增用户</a>
                    <a id="" href="usermanager_authority.html" class="list-group-item">权限管理</a>
                    <a id="" href="#" class="list-group-item">角色管理</a>
               </div>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login_game.js"></script>
</body>
</html>