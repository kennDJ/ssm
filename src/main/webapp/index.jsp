<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/29 0029
  Time: 20:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="Java" %>
<% String basePath = request.getScheme() + "://"
        + request.getServerName() + ":"
        + request.getServerPort() + request.getContextPath();%>
<html>
<head>
    <title>Title</title>
</head>
<body>


    <a href="<%=basePath + "/account/findAll"%>">查询所有</a>
</body>
</html>
