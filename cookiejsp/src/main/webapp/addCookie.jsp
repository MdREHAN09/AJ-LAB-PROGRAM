<%@ page import="javax.servlet.http.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Cookie Added</title>
</head>
<body>

<%
String name = request.getParameter("name");
String domain = request.getParameter("domain");
int expiry = Integer.parseInt(request.getParameter("expiry"));

// Create cookie
Cookie cookie = new Cookie(name, "SampleValue");

// Set properties
cookie.setDomain(domain);
cookie.setMaxAge(expiry);

// Add cookie to response
response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Domain:</b> <%= domain %></p>
<p><b>Expiry Time:</b> <%= expiry %> seconds</p>

<br>
<a href="viewCookies.jsp">Go to Active Cookie List</a>

</body>
</html>