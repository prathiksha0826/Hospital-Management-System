package com.hospital;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deletePatient")
public class DeletePatientServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException {

        int id = Integer.parseInt(req.getParameter("id"));

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement ps = con.prepareStatement(
                "DELETE FROM patients WHERE id=?"
            );

            ps.setInt(1, id);

            int i = ps.executeUpdate();

            if (i > 0) {
                res.getWriter().println("✅ Patient Deleted Successfully");
            } else {
                res.getWriter().println("❌ Patient Not Found");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}