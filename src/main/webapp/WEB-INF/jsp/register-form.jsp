<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 04.04.2022
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Form</title>
</head>
<body>
<div class="error-msg">
</div>
<div class="dragon-form" align="center">
    <caption>
        <h2>Please, register yourself</h2>
    </caption>
    <div class="error-msg">
    </div>
    <form method="post" action="/users/register">
        <p>Login:
            <input path="login" type="text" name="login" class="form-control"/></p>
        <p>Password:
            <input path="password" type="text" name="password" class="form-control"/></p>
        <p>Mail:
            <input path="mail" type="text" name="mail" class="form-control"/></p>
        <input type="submit" class="btn btn-primary mx-auto mt-2" value="Submit">
    </form>
</div>
</body>
</html>
