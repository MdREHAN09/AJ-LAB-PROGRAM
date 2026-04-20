<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Add Cookie</title>

<style>
.container {
    width: 350px;
    margin: 50px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
</style>

</head>
<body>

<div class="container">
<h2>Add Cookie</h2>

<form action="addCookie.jsp" method="post">
    
    Name:
    <input type="text" name="name" required><br><br>

    Domain:
    <input type="text" name="domain" required><br><br>

    Max Expiry Age (seconds):
    <input type="number" name="expiry" required><br><br>

    <input type="submit" value="Add Cookie">
</form>

</div>

</body>
</html>