package com.hospital;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        // SIMPLE STATIC LOGIN (you can replace with DB later)
        if ("admin".equals(username) && "admin".equals(password)) {

            HttpSession session = req.getSession();
            session.setAttribute("user", username);

            res.sendRedirect("index.jsp");

        } else {
            res.getWriter().println("❌ Invalid Login");
        }
    }
}