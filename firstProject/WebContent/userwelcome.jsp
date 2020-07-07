<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="com.dxc.jspservlets.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		String username = request.getParameter("loginname");
		String uemail = request.getParameter("loginmail");
		User mUser = (User) session.getAttribute("userObject");
		if(mUser.getName().equalsIgnoreCase(username) && mUser.getEmail().equalsIgnoreCase(uemail))
			out.print("Welcome "+mUser.getName()+" "+mUser.getEmail());
		else {
			pageContext.forward("error.jsp");
		}
	%><br>
	<br>
</body>
</html>