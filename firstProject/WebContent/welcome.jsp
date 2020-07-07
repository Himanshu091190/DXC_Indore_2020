<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Scriptlet Tag for Username -->
<%
String username = request.getParameter("username");
out.println("Welcome "+username);
session.setAttribute("user", username);
pageContext.setAttribute("myname", username,PageContext.SESSION_SCOPE);
%><br><br>

<a href="home.jsp">Home</a><br><br>

<!-- Expression Tag for Username -->
<%=
"Welcome "+request.getParameter("username")
%><br><br> 

<%
String drivername = config.getInitParameter("drivername");
out.print("Driver name is "+drivername);
%><br><br>

<%
String dbusername = application.getInitParameter("dbusername");
out.print("DB Username is "+dbusername);
%>

</body>
</html>