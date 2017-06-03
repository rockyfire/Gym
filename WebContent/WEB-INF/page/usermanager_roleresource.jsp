<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
                        <button class="btn btn-default">新增资源</button>
                        <button class="btn btn-default">保存更改</button>
                        <span class="text-right">当前角色：</span>
                    </div>
                    <form>
                        <table class="table table-bordered table-responsive table-striped">
                            <thead>
                            <tr>
                                <th>资源编号</th>
                                <th>资源名称</th>
                                <th>资源等级</th>
                                <th>资源描述</th>
                                <th><input type="checkbox" name="roleResources" value="resourceId">选中</th>
                            </tr>
                            </thead>
                        </table>
                    </form>
                </div>
            <!--列出左右的资源，如果该资源是该角色拥有的就在复选框中选上-->
            </div>
            <div class="col-xs-6 col-sm-3  sidebar-offcanvas" id="sidebar">
                <div class="list-group">
                    <a href="#" class="list-group-item active">体育馆管理系统</a>
                    <a id="" class="list-group-item">用户查询</a>
                    <a id="" data-toggle="modal" data-target="#add_user" class="list-group-item">新增用户</a>
                    <a id="" href="usermanager_authority.jsp" class="list-group-item">权限管理</a>
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