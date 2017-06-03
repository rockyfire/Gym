<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/public.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.2.1.min.js"></script>
    
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
                    <li class="active"><a id="usermanager" href="#">用户管理</a></li>
                    <li><a id="notice" href="notice.jsp">公告管理</a></li>
                    <li><a id="worker" href="worker.jsp">工作人员管理</a></li>
               </ul>
            </div>
        </div>
    </nav>

    <div class="container">
        <div class="row row-offcanvas row-offcanvas-right">
            <div class="col-xs-12 col-sm-9">
                <table class="table table-bordered table-hover table-striped">
                    <caption>用户管理</caption>
                    <thead>
                        <tr>
                            <th><a data-toggle="modal" data-target="#userMessage">用户编号</a></th>
                            <th>用户名称</th>
                            <th>删除</th>
                        </tr>
                    </thead>
                    <tbody>
                    	<s:iterator value="#request.users" var="user">
                    		<tr>
                    			<td>
                    				<div class="userDetails" data-toggle="modal" data-target="#userMessage">
                    					<s:property value="#user.userNubmer"/>
                    				</div>
                    			</td>
                    			<td>
                    				<a>
                    					<s:property value="#user.username"/>
                    				</a>
                    			</td>
                    			<td>
                    				<a href="userAction_deleteUser?userVo.userNubmer=<s:property value='#user.userNubmer'/>">
                    					删除
                    				</a>
                    			</td>
                    		</tr>
                    	</s:iterator>
                    </tbody>
                    
                </table>
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="" class="list-group-item">用户查询</a>
                    <a id="" data-toggle="modal" data-target="#add_user" class="list-group-item">新增用户</a>
                    <a id="" href="userAction_userAuthority" class="list-group-item">权限管理</a>
                    <a id="" href="usermanager_role.jsp" class="list-group-item">角色管理</a>
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
                
                
                
                    <form action="userAction_addUser" method="get">
                        <p>
                          <label for="MyUsername">姓名</label>
                          <input id="MyUsername" type="text" name="userVo.userName">
                        </p>
                        <p>
                          <label for="MyPassword">密码</label>
                          <input id="MyPassword" type="text" name="userVo.password">
                        </p>
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
<script type="text/javascript">
    $(function(){
        //按钮单击时执行           
        $("div.userDetails").click(function(){
        	
        	var userNumber = $(this).text();
        	userNumber = userNumber.trim(userNumber);
             $.ajax({
               type: "GET",
               url: "userAction_userDetails",
               data: {"userNumber":userNumber},
               async: false,
			   dataType: "json",
			   success:function(data){
				   $("#userNumber").val(data.userNumber);
				   $("#userName").val(data.list[0].userName);
				   $("#password").val(data.list[0].password);
				   $("#address").val(data.list[0].location);
				   $("#IDNumber").val(data.list[0].IDNumber);
				   $("#bornDay").val(data.list[0].bornDate);
				   $("#grade").val(data.list[0].grade);
				   $("#email").val(data.list[0].email);
			   },
			   error:function(XMLHttpRequest, textStatus, errorThrown){
				   alert("错误");
			   }
            }); 
         }); 
    });
    </script>

<!--用户详信息弹窗-->
    <div id="userMessage" class="modal fade">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal">
                        <span>&times;</span><span class="sr-only">关闭弹窗</span></button>
                    <h4 class="modal-title text-center" id="myModalLabel">用户资料</h4>
                </div>
                <div class="modal-body">
                    <form action="userAction_updateUser" method="get">
                        <table class="table table-bordered table-responsive table-striped">
                            <tbody>
                            <tr>
                                <td>用户编号</td>
                                <td><input id="userNumber" name="userVo.userNubmer" value=""/></td>
                            </tr>
                            <tr>
                                <td>用户名：</td>
                                <td><input id="userName" name="userVo.userName" value=""/></td>
                            </tr>
                            <tr>
                                <td>密码：</td>
                                <td><input id="password" name="userVo.password" value=""/></td>
                            </tr>

                            <tr>
                                <td>地址</td>
                                <td><input id="address" name="userVo.location" value=""/></td>
                            </tr>
                            <tr>
                                <td>身份证号</td>
                                <td><input id="IDNumber" name="userVo.IDNumber" value=""/></td>
                            </tr>
                            <tr>
                                <td>出生日期</td>
                                <td><input id="bornDay" name="userVo.bornDay" value=""/></td>
                            </tr>
                            <tr>
                                <td>所在年级</td>
                                <td><input id="grade" name="userVo.grade" value=""/></td>
                            </tr>
                            <tr>
                                <td>电子邮件</td>
                                <td><input id="email" name="userVo.email" value=""/></td>
                            </tr>
                            </tbody>
                        </table>
                        <s:submit value="保存"></s:submit>
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