<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>体育馆网上系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/jquery.ui.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/demo.css"/>
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
                    <li class="active"><a id="gym" href="#">首页</a></li>
                    <li><a id="game" href="html/login_game.html">体育赛事</a></li>
                    <li><a id="ground" href="html/login_ground.html">场地详情</a></li>
                    <li><a id="equipment" href="html/login_equipment.html">闲置器材</a></li>
                    <li><a id="notice" href="html/login_notice.html">公告通知</a></li>
                    <li><a id="connection" href="html/connection.html">联系我们</a></li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="jumbotron">
        <div class="container-fluid">
            <h1 class="text-center">体育馆网上系统</h1>
            <p class="text-center">Gymnasium  System</p>
        </div>
            <div class="row center-block">
                <div id="box" class="col-xs-offset-1 col-sm-offset-3 col-md-offset-4" >
                    <ul class="nav nav-tabs col-xs-offset-3 col-sm-offset-4 col-md-offset-5" role="tablist">
                        <li role="presentation" class="active"><a href="#signin" role="tab" data-toggle="tab">登录</a></li>
                        <li role="presentation" ><a href="#register" role="tab" data-toggle="tab">注册</a></li>
                    </ul>
                    <div class="tab-content">
                        <div role="tabpanel1" class="tab-pane fade in active col-sm-offset-3" id="signin">
                        
                        
                            <form id="sign" class="form-signin form-horizontal" role="form" action="userAction_login">
                                <p style="margin-top: 10px;">
                                    <label for="username">帐&nbsp;&nbsp;&nbsp;&nbsp;号:</label>
                                    <input id="username" type="text" name="userVo.username" />
                                </p>
                                <p>
                                    <label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
                                    <input id="password" type="password" name="userVo.password" />
                                    <a id="forget_password" href="#">忘记密码</a>
                                </p>
                                <!--<p>-->
                                    <!--<label for="validate_code">验证码:</label>-->
                                    <!--<input id="validate_code" type="text" name="validate" style="width: 100px"/>-->
                                    <!--<img src=""/>-->
                                    <!--<input id="change_img" type="button" value="换一张"/>-->
                                <!--</p>-->
                                <p class="text-center">
                                    <input type="radio" name="identity" value="admin">管理员</input>
                                    <input type="radio" name="identity" value="student">学生</input>
                                    <input type="radio" name="identity" value="teacher">教师</input>
                                </p>
                                <p>
                                    <input class="btn btn-lg btn-primary " type="submit" value="登录"/>
                                </p>
                            </form>
                            
                            
                        </div>
                        <div role="tabpanel2" class="tab-pane fade in col-sm-offset-3" id="register">
                             <form id="reg" class="form-register form-horizontal" role="form" action="userAction_addUser">
                                <p style="margin-top: 10px;">
                                    <label for="student_id">学&nbsp;&nbsp;&nbsp;&nbsp;号:</label>
                                    <input id="student_id" type="text" name="student_id"/>
                                </p>
                                <p>
                                    <label for="user_name">姓&nbsp;&nbsp;&nbsp;&nbsp;名:</label>
                                    <input id="user_name" type="text" name="userVo.username"/>
                                </p>
                                <p>
                                    <label for="pass_word">密&nbsp;&nbsp;&nbsp;&nbsp;码:</label>
                                    <input id="pass_word" type="password" name="userVo.password"/>
                                </p>
                                <p>
                                    <label for="validatecode">验证码:</label>
                                    <input id="validatecode" type="text" name=""/>
                                    <input id="getvalcode" class="btn btn-default" type="button" value="获取验证码"/>
                                </p>
                                <p>
                                    <input id="agree" type="checkbox" name="" checked="checked"/>
                                    <label for="agree">我已阅读并同意相关服务条款</label>
                                </p>
                                <p>
                                    <input class="btn btn-lg btn-primary" type="submit" value="提交"/>
                                </p>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <form id="forget_password_form">
        <p>
            <label for="for_username">帐号</label>
            <input id="for_username" type="text" name="" value="所申诉帐号"/>
        </p>
        <p>
            <label for="for_student_id">手机号</label>
            <input id="for_student_id" type="text" name=""/>
        </p>
        <p>
            <label for="for_student_password">验证码</label>
            <input id="for_student_password" type="password" name=""/>
        </p>
        <p>
            <label for="for_pass_word">新密码:</label>
            <input id="for_pass_word" type="password" name="pass_word"/>
        </p>
        <p>
            <label for="for_pass_word_sure">确认密码:</label>
            <input id="for_pass_word_sure" type="password"/>
        </p>
    </form>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.ui.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/demo.js"></script>
</body>
</html>