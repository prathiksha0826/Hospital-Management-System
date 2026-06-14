package com.hospital;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addPatient")
public class PatientServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String ageStr = req.getParameter("age");
        String gender = req.getParameter("gender");

        try {
            int age = Integer.parseInt(ageStr);

            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO patients(name, age, gender) VALUES(?,?,?)"
            );

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, gender);

            int i = ps.executeUpdate();

            if (i > 0) {
                res.getWriter().println("✅ Patient Added Successfully");
            } else {
                res.getWriter().println("❌ Failed to Add Patient");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}