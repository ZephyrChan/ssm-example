<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/8/31 0031
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <a href="account/findAll">findAll</a>

    <h3>测试保存</h3>

    <form action="/account/save" method="post">
        姓名：<input type="text" name="name"/> <br>
        金额：<input type="text" name="money"/> <br>
        <input type="submit" value="提交"/> <br>
    </form>
</body>
</html>
