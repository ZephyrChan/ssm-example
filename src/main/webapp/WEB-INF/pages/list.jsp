<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/31 0031
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>success</title>
</head>
<body>
    <h3>success 成功返回了。。。。</h3>
    ${list}
    <br>

    <c:forEach items="${list}" var="account">
        ${account.name}
        <br>
    </c:forEach>

</body>
</html>
