package com.hospital;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/viewDoctors")
public class ViewDoctorsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement("SELECT * FROM doctors");
            ResultSet rs = ps.executeQuery();

            out.println("<h2>Doctors List</h2>");

            while (rs.next()) {
                out.println(
                    rs.getInt("id") + " - " +
                    rs.getString("name") + " - " +
                    rs.getString("specialization") + "<br>"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}