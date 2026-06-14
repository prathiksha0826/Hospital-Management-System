<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- paste CSS here -->
<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}

h1 {
    text-align: center;
    color: #2c3e50;
}

a {
    display: block;
    width: 220px;
    margin: 10px auto;
    text-align: center;
    padding: 10px;
    background: #2ecc71;
    color: white;
    text-decoration: none;
    border-radius: 5px;
}
a:hover {
    background: #27ae60;
}
</style>
</head>
<body>

<h1>Hospital Management System</h1>

<a href="addPatient.jsp">Add Patient</a><br>
<a href="viewPatients">View Patients</a><br>
<a href="deletePatient.jsp">Delete Patient</a><br>
<a href="viewDoctors">View Doctors</a><br>
<a href="bookAppointment.jsp">Book Appointment</a><br>

<a href="logout">Logout</a>

</body>
</html>