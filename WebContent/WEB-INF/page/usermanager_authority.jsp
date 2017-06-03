<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>权限管理</title>
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
                    <li><a href="main.jsp">首页</a></li>
                    <li><a id="game" href="game.jsp">赛事管理</a></li>
                    <li><a id="ground" href="ground.jsp">场地管理</a></li>
                    <li><a id="equipment" href="equipment.jsp">器材管理</a></li>
                    <li><a id="trace" href="trace.jsp">财务管理</a></li>
                    <li class="active"><a id="usermanager" href="usermanager.jsp">用户管理</a></li>
                    <li><a id="notice" href="notice.jsp">公告管理</a></li>
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
                        <button class="btn btn-default">普通用户</button>
                        <button class="btn btn-default">管理员</button>
                        <button class="btn btn-default">super管理员</button>
                    </div>
                    
                    <script type="text/javascript">
                    $(function(){
                        //按钮单击时执行           
                        $("div.btn_roles").click(function(){
                        	var userNumber = $(this).next().val();
                        	userNumber = userNumber.trim(userNumber);
                        	//alert(userNumber);
                             $.ajax({
                               type: "GET",
                               url: "roleAction_getUserRoles",
                               data: {"userNumber":userNumber},
                               async: false,
                			   dataType: "json",
                			   success:function(data){
                				   alert(data.userNumber+"success");
                			   },
                			   error:function(XMLHttpRequest, textStatus, errorThrown){
                				   alert("错误");
                			   }
                            }); 
                         }); 
                    });
                    </script>
                    <form>
                        <table class="table table-bordered table-responsive table-striped">
                            <thead>
                            <tr>
                                <th>用户编号</th>
                                <th>用户名称</th>
                                <th><button type="button" class="btn btn-default"
                                            data-toggle="modal" data-target="#role_update">
                                  		  角色修改</button>
                                </th>
                            </tr>
                            </thead>
                            <tbody>
                            	<s:iterator value="#request.users" var="user">
                            		<tr>
                            			<td><div><s:property value="#user.userNubmer"/></div></td>
                            			<td><div><s:property value="#user.userName"/></div></td>
                            			<td><div class="btn_roles" data-toggle="modal" data-target="#role_update">
                                  		  角色修改</div><input type="hidden" value="<s:property value='#user.userNubmer'/>">
                               			</td>
                            		</tr>
                            	</s:iterator>
                            </tbody>
                        </table>
                    </form>
                    
                    
                </div>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="" class="list-group-item">用户查询</a>
                    <a id="" data-toggle="modal" data-target="#add_user" class="list-group-item">新增用户</a>
                    <a id="" href="#" class="list-group-item">权限管理</a>
                    <a id="" href="usermanager_role.jsp" class="list-group-item">角色管理</a>
               </div>
            </div>
        </div>
    </div>


    <!--角色修改-->
    <div id="role_update" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><span class="sr-only">关闭弹窗</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">角色修改</h4>
                </div>
                
                
                <form action="roleAction_updateRoles" method="get">
                    <div class="modal-body">
                        <input type="hidden" name="userNumber" value="<s:property value='#userNumber'/>">
                        <table class="table table-bordered table-responsive table-striped">
                            <tbody>
                            <tr>
                                <td>角色</td>
                                <td>选中</td>
                            </tr>
                            <tr>
                                <td>角色</td>
                                <td><input type="checkbox" name="roleNumbers" value="" checked="checked"></td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                        <button type="button" class="btn btn-primary">保存</button>
                    </div>
                </form>
                
                
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