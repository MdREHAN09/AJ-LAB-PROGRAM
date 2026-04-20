<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Active Cookies</title>

<style>
.container {
    width: 400px;
    margin: 50px auto;
    padding: 20px;
    border: 1px solid #ccc;
}
</style>

</head>
<body>

<div class="container">
<h2>Active Cookie List</h2>

<%
Cookie[] cookies = request.getCookies();

if (cookies != null) {
%>
    <table border="1" cellpadding="5">
        <tr>
            <th>Name</th>
            <th>Value</th>
        </tr>

<%
    for (Cookie c : cookies) {
%>
        <tr>
            <td><%= c.getName() %></td>
            <td><%= c.getValue() %></td>
        </tr>
<%
    }
} else {
%>
    <p>No cookies found</p>
<%
}
%>

</table>

<br>
<a href="index.jsp">Add Another Cookie</a>

</div>

</body>
</html>