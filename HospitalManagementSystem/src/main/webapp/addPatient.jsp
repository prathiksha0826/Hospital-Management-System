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
    background: #3498db;
    color: white;
    border: none;
}
button:hover {
    background: #2980b9;
}
</style>
</head>
<body>

<form action="addPatient" method="post">
    Name: <input name="name"><br>
    Age: <input name="age"><br>
    Gender: <input name="gender"><br>
    <button>Add</button>
</form>

</body>
</html>