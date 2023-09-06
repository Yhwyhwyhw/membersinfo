
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: YangHaoWen
  Date: 2023/8/31
  Time: 8:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/mian.css">
</head>

<script src="js/jquery-3.7.0.js"></script>
<script>

</script>
<body>

<div id="from">
    <div style="float: right"></div>
    <table>
        <tr>
            <td colspan="7" style="text-align: center">俱乐部会员管理系统</td>
        </tr>
        <tr>
            <td width="50px">编号</td>
            <td width="60px">姓名</td>
            <td width="50px">性别</td>
            <td width="50px">年龄</td>
            <td width="300px">家庭住址</td>
            <td>email</td>
            <td width="80px">操作</td>
        </tr>

        <c:forEach items="${list}" var="membersinfo">
            <tr>
                <td>${membersinfo.id}</td>
                <td>${membersinfo.mname}</td>
                <td>${membersinfo.mgender}</td>
                <td>${membersinfo.mage}</td>
                <td>${membersinfo.maddress}</td>
                <td>${membersinfo.memail}</td>
                <td><div id="del"><a href="/membersinfo?type=del&id=${membersinfo.id}">删除</a></div></td>
            </tr>
        </c:forEach>

    </table>


</div>
</body>
</html>
