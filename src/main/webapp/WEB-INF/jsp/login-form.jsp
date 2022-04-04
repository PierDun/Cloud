<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.04.2022
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<div class="mx-auto" style="color: red">
    <h7>${msg}</h7>
</div>
<div class="dragon-form" align="center">
    <caption>
        <h2>Please, register yourself</h2>
    </caption>
    <div class="error-msg">
    </div>
    <form method="post" action="${pageContext.request.contextPath}/users/login" >
        <p>Login:
            <input path="login" type="text" name="login" class="form-control"/></p>
        <p>Password:
            <input path="password" type="text" name="password" class="form-control"/></p>
        <input class="btn btn-primary mx-auto mt-2" type="submit" value="Login">
    </form>
</div>
</body>
</html>
