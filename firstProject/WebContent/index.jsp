<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.dxc.jspservlets.Calculator" />
<%
obj.setData(5);
out.print("Square of "+obj.getData()+" is "+obj.square(obj.getData()));
out.print("<br><br>Cube of "+obj.getData()+" is "+obj.cube(obj.getData()));
%><br><br>
Welcome to index.jsp page<br><br>
click here for <a href="home.jsp">Home</a><br><br>
click here for <a href="login.jsp">Login</a><br><br>
click here for <a href="contact.jsp">Contact</a><br><br>
click here for <a href="signup.jsp">Signup</a><br><br>
click here for <a href="error.jsp">Error</a><br><br>

<!-- A scriptlet Tag is used to execute java source code in JSP -->
<% out.println("First JSP Scriptlet Tag element"); %><br><br>

<!-- JSP Expression Tag is written to the output stream of the response. No need to write and use out.println
to write data, Its mainly used to print the values of variable or method

Note: Do not end your statement with semicolon in case of expression tag -->
<%= "Welcome to JSP Expression Tag Element" %><br><br>
Current Time<%= java.util.Calendar.getInstance().getTime() %><br><br>


<!-- JSP Declaration Tag is used to declare Fields and Methods -->
<%! int data=50; %>
<%! int square(int n) {
	return n*n;
}
%>
<%= "Value of the variable is "+data %><br><br>
<%= "Square of the variable "+data+" is "+square(data) %><br><br>

<%this.log("Log message from page tag"); %>
</body>
</html> 