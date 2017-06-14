<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>角色管理</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
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
                        <button class="btn btn-default" data-toggle="modal" data-target="#add_role">新增角色</button>
                    </div>
                    <table class="table table-bordered table-hover table-striped">
                        <thead>
                            <tr>
                                <th>角色编号：</th>
                                <th>角色名称：</th>
                                <th><a href="usermanager_roleresource.html">权限列表</a></th>
                                <th><a data-toggle="modal" data-target="#role_resource">修改角色：</a></th>
                                <th><a>删除角色：</a></th>
                            </tr>
                        </thead>
                        
                        <tbody>
                        	<s:iterator value="#request.roles" var="role">
                        		<tr>
                        			<td><s:property value="#role.roleNumber"/></td>
                        			<td><s:property value="#role.roleName"/></td>
                        			<td><a href="roleAction_toRoleResource?roleVo.roleNumber=<s:property value="#role.roleNumber"/>">角色资源表</a></td>
                        			<td>
                        				<div class="update_role" data-toggle="modal" data-target="#role_resource">修改角色</div>
                        				<input type="hidden" name="roleVo.roleNumber" value='<s:property value="#role.roleNumber"/>'>
                        			</td>
                        			<td><a href="roleAction_deleteRole?roleVo.roleNumber=<s:property value="#role.roleNumber"/>">删除角色</a></td>
                        		</tr>
                        	
                        	</s:iterator>
                        
                        </tbody>
                        
                    </table>
                    
    <script type="text/javascript">
    $(function(){
        //按钮单击时执行           
        $(".update_role").click(function(){
        	//alert("dianji");
        	
        	var roleNumber = $(this).next().val();
        	roleNumber = roleNumber.trim(roleNumber);
        	
        	alert(roleNumber);
        	
             $.ajax({
               type: "GET",
               url: "roleAction_getRole",
               data: {"roleVo.roleNumber":roleNumber},
               async: false,
			   dataType: "json",
			   success:function(data){
				   $("#update_resourcename").val(data.roleVo.roleName);
				   $("#update_resourcedesc").val(data.roleVo.description);
				   $("#update_resourcenumber").val(data.roleVo.roleNumber);
				   
			   },
			   error:function(XMLHttpRequest, textStatus, errorThrown){
				   alert(errorThrown);
			   }
            }); 
         }); 
        
        $("#adduser_submit").click(function () {
			$("#adduser_form").submit();
		})
        
        
        
        
    });
    </script>
                </div>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="" class="list-group-item">用户查询</a>
                    <a id="" data-toggle="modal" data-target="#add_user" class="list-group-item">新增用户</a>
                    <a id="" href="userAction_userAuthority" class="list-group-item">权限管理</a>
                    <a id="" href="roleAction_toRoleManage" class="list-group-item">角色管理</a>
               </div>
            </div>
        </div>
    </div>

<!--新增角色弹窗-->
    <div id="add_role" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><span class="sr-only">关闭弹窗</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">新增角色</h4>
                </div>
                <form id="adduser_form" action="roleAction_addRole" method="get">
                    <div class="modal-body">

                            <table class="table table-bordered table-responsive table-striped">
                                <tbody>
                                <tr>
                                    <td>角色名称</td>
                                    <td><input type="text" name="roleVo.roleName" value=""></td>
                                </tr>
                                <tr>
                                    <td>角色描述</td>
                                    <td><input type="text" name="roleVo.description" value=""></td>
                                </tr>
                                </tbody>
                            </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button id="adduser_submit" type="button" class="btn btn-primary">保存</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

<!--角色修改-->
    <div id="role_resource" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><span class="sr-only">关闭弹窗</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">修改角色</h4>
                </div>
                <div class="modal-body">
                    <form action="roleAction_updateRole">
                        <table class="table table-bordered table-responsive table-striped">
                            <tbody>
                            <tr>
                                <td>角色编号</td>
                                <td><input id="update_resourcenumber" type="text" name="roleVo.roleNumber" value=""></td>
                            </tr>
                            <tr>
                                <td>角色名称</td>
                                <td><input id="update_resourcename" type="text" name="roleVo.roleName" value=""></td>
                            </tr>
                            <tr>
                                <td>角色描述</td>
                                <td>
                                	<input id="update_resourcedesc" type="text" name="roleVo.description" value="">
                                </td>
                                
                            </tr>
                            
                            </tbody>
                        </table>
                        <s:submit value="提交"></s:submit>
                    </form>

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary">保存</button>
                </div>
            </div>
        </div>
    </div>

<!--新增用户弹窗-->
    <div id="add_user" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><span class="sr-only">关闭弹窗</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">新增用户</h4>
                </div>
                <div class="modal-body">
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
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary">保存</button>
                </div>
            </div>
        </div>
    </div>

    
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/login_game.js"></script>
</body>

</html>