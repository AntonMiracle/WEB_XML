<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Login.jsp
<form action="j_security_check" method="post">
    Username : <input type="text" name="j_username"></br>
    Password : <input type="password" name="j_password"></br>
    <input type="submit" value="login"/>
</form>
</body>
</html>
