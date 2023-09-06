<%--
  Created by IntelliJ IDEA.
  User: YangHaoWen
  Date: 2023/8/31
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>添加机房信息页面</h1>
<form method="post" action="/computerrom?status=add">
    <span>机房名称：</span><input type="text" name="roomName"><br>
    <span>计算机数量：</span><input type="text" name="computerNumber"><br>
    <span>机房管理员：</span><input type="text" name="manager"><br>
    <span>机房 地址：</span><input type="text" name="location"><br>
    <span>机房 状态：</span>
    <select name="state">
        <option value="1">使用中</option>
        <option value="2">空闲中</option>
        <option value="3">维护中</option>
    </select><br>
    <span>相关操作：</span><input type="submit" value="新增"><input type="reset" value="重置">
</form>
</body>
</html>
