<%--
  Created by IntelliJ IDEA.
  User: blueBoy
  Date: 2022/4/11
  Time: 18:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${user}" var="user">
    <tr>
        <td>${user.id}</td>
        <td>${user.name}</td>
        <td>${user.gender}</td>
        <td>${user.email}</td>

    </tr>
</c:forEach>

</body>
</html>
