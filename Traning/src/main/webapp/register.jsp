<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registe-page</title>
</head>
<body>
        <h2>Register</h2>
        <form action="register" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" placeholder = "username" required><br> <br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" placeholder = "password"  required><br> <br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder = "email" required><br> <br>
        <button type="submit">Register</button>
    </form>
</body>
</html>