<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>Notice</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_public.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/notice.css">
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
                    <li><a id="" href="game.html">赛事管理</a></li>
                    <li><a id="" href="ground.html">场地管理</a></li>
                    <li><a id="" href="equipment.html">器材管理</a></li>
                    <li><a id="" href="trace.html">财务管理</a></li>
                    <li><a id="" href="usermanager.html">用户管理</a></li>
                    <li class="active"><a id="" href="#">公告管理</a></li>
                    <li><a id="" href="">工作人员安排</a></li>
               </ul>
            </div>
        </div>
    </nav>

    <table class="table table-bordered table-hover table-striped">
        <caption>公告</caption>
        <thead>
            <tr>
                <th>编&nbsp;号</th>
                <th>标&nbsp;题</th>
                <th>日&nbsp;期</th>
                <th>内&nbsp;容</th>
                <th>发布人</th>
                <th>删&nbsp;除</th>
            </tr>
        </thead>
        <tbody>
        <tr>
            <td colspan="6"><a id="notice_add_a" href="#">添加公告</a></td>
            </tr>
        </tbody>
    </table>

    <div id="notice_add">
        <p>
          <label for="notice_title">公告标题</label>
          <input id="notice_title" type="text" name=""/>
        </p>
        <p>
          <label for="notice_content">公告内容</label>
          <textarea id="notice_content"></textarea>
        </p>
    </div>

    <!-- ajax  value 一开始是隐藏的 ..dialog -->
    <div id="notice_detail">
      <p>
        <label for="notice_id">公告编号</label>
        <input id="notice_id" type="text" name=""/>
      </p>
      <p>
        <label for="notice_type">公告类型</label>
        <input id="notice_type" type="text" name=""/>
      </p>
      <p>
        <label for="notice_time">公告日期</label>
        <input id="notice_time" type="text" name=""/>
      </p>
      <p>
        <label for="notice_person">发布人</label>
        <input id="notice_person" type="text" name=""/>
      </p>
      <p>
        <label for="content">公告内容</label>
        <textarea id="content"></textarea>
      </p>
    </div>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/notice.js"></script>
</body>

</html>