<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
body { font-family: Arial; background:#f4f6f9; }

.container {
    width: 35%;
    margin: 50px auto;
    background: white;
    padding: 20px;
    border-radius: 8px;
}

input {
    width: 100%;
    padding: 10px;
    margin: 8px 0;
}

button {
    width: 100%;
    padding: 10px;
    background: #e74c3c;
    color: white;
    border: none;
}
button:hover {
    background: #c0392b;
}
</style>
</head>
<body>

<h2>Delete Patient</h2>

<form action="deletePatient" method="get">
    Patient ID: <input name="id"><br>
    <button>Delete</button>
</form>

</body>
</html>