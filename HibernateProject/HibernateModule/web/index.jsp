<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示数据</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>用户名</th>
        <th>密码</th>
        <th>邮箱</th>
    </tr>
    <s:iterator value="users" var="obj">
        <tr>
            <td><s:property value="id"/></td>
            <td><s:property value="username"/></td>
            <td><s:property value="password"/></td>
            <td><s:property value="email"/></td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
