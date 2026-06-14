package com.hospital;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bookAppointment")
public class BookAppointmentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        int pid = Integer.parseInt(req.getParameter("pid"));
        int did = Integer.parseInt(req.getParameter("did"));
        String date = req.getParameter("date");

        try {
            Connection con = DBConnection.getConnection();

            PreparedStatement check = con.prepareStatement(
                "SELECT COUNT(*) FROM appointments WHERE doctor_id=? AND appointment_date=?"
            );

            check.setInt(1, did);
            check.setString(2, date);

            ResultSet rs = check.executeQuery();
            rs.next();

            if (rs.getInt(1) == 0) {

                PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO appointments(patient_id, doctor_id, appointment_date) VALUES(?,?,?)"
                );

                ps.setInt(1, pid);
                ps.setInt(2, did);
                ps.setString(3, date);

                ps.executeUpdate();

                res.getWriter().println("✅ Appointment Booked!");

            } else {
                res.getWriter().println("❌ Doctor not available");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
