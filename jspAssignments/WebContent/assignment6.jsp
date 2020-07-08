<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page errorPage="error.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<%    
    String num1=request.getParameter("n1");  
    String num2=request.getParameter("n2");  
  
    int a=Integer.parseInt(num1);  
    int b=Integer.parseInt(num2);  
    int c=a/b;  
    out.print("Division of numbers is: "+c);    
%>
</body>
</html>