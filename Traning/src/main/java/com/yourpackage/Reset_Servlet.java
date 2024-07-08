package com.yourpackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/reset")
public class Reset_Servlet extends HttpServlet {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String username = request.getParameter("username");
	        String email = request.getParameter("email");
	        String newPassword = request.getParameter("newpassword");

	        UserDAO userDao = new UserDAO();
	        boolean result = userDao.resetPassword(username, email, newPassword);

	        if (result) {
	            response.sendRedirect("login.jsp");
	        } else {
	            response.sendRedirect("reset.jsp");
	        }
	}

}
