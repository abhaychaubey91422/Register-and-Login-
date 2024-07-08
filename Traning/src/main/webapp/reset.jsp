<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reset-Password</title>
</head>
<body>
       <h2>Reset Password</h2>
    <form action="reset" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" placeholder = "username" required><br> <br>
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" placeholder = "email" required><br> <br>
        <label for="newpassword">New Password:</label>
        <input type="password" id="newpassword" name="newpassword" placeholder = "newpassword"required><br> <br>
        <button type="submit">Reset</button>
    </form>
</body>
</html>