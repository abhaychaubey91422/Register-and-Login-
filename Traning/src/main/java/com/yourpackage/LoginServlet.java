package com.yourpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String username = request.getParameter("username");
        String password = request.getParameter("password");

        UserDAO userDao = new UserDAO();
        boolean result = userDao.validateUser(username, password);

        if (result) {
            HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login.jsp");
        }
	}

}
