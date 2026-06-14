<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body {
    font-family: Arial;
    background: #f4f6f9;
}

.container {
    width: 300px;
    margin: 120px auto;
    background: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 0 10px #ccc;
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
</style>
</head>
<body>

<div class="container">
<h2>Employee Login</h2>

<form action="login" method="post">
    <input name="username" placeholder="Username">
    <input type="password" name="password" placeholder="Password">
    <button>Login</button>
</form>

</div>


</body>
</html>