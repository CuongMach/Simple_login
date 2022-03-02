package com.codegym;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import javax.swing.text.Style;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if ("admin".equals(userName) && "admin".equals(passWord)) {
            writer.println("<h1>Welcome " + userName + " to website</h1>");
        } else {
            writer.println("<h1>Login Error</h1>");
        }
        writer.println("</html>");
    }
}
