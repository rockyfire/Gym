<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>器材管理</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/equipment_detail.css">
</head>
<body>
    <form>
      <p>
        <label for="equipment_id">器材编号</label>
        <input id="equipment_id" type="text" name=""/>
      </p>
      <p>
        <label for="equipment_name">器材名称</label>
        <input id="equipment_name" type="text" name=""/>
      </p>
      <p>
        <label for="equipment_type">器材类型</label>
        <input id="equipment_type" type="text" name=""/>
      </p>
      <p>
        <label for="equipment_location">器材位置</label>
        <input id="equipment_location" type="text" name=""/>
      </p>
      <p>
        <label for="equipment_isuse">可用状态</label>
        <input id="equipment_isuse" type="text" name=""/>
      </p>
      <p>
        <label for="equipment_rate">器材租金</label>
        <input id="equipment_rate" type="text" name=""/>
      </p>
     <p id="form_sub_re">
        <input type="submit" value="提交修改" />
        <input type="reset" value="重置数据" />
      </p>
    </form>
    <a href="equipment_repair.jsp">租借详情</a>
    <a href="equipment_rent.jsp">维修详情</a>



    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.form.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/equipment_detail.js"></script>
</body>
</html>