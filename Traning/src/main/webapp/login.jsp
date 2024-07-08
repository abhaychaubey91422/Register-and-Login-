<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login-page</title>
</head>
<body>
       <h2>Login</h2>
    <form action="login" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" placeholder = "username" required><br> <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"  placeholder = "password" required><br> <br>
        <button type="submit">Login</button>
    </form>
</body>
</html>