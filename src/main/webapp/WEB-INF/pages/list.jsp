<%@ page import="com.jd.domain.Account" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/29 0029
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="Java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${list}" var="account">
        <h1>${account}</h1><br>
    </c:forEach>
</body>
</html>
