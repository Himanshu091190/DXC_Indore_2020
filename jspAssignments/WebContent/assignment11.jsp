<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<!--  SQL QUERY TO CREATE DATABASE TABLE -->
<!-- Create table Employees (id number, age number, FirstName varchar2(20), LastName varchar2(20)); -->
<html>
    <head>
        <title>SELECT Operation</title>
    </head>
    <body>
        <%!
            Connection con;
            PreparedStatement ps;
            public void jspInit()
            {
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/contactdb","root","root");
                    ps = con.prepareStatement("select * from Employees");
                }
                catch(Exception ex)
                {
                    ex.printStackTrace();
                }
            }
        %>
        <%
            ResultSet rs = ps.executeQuery();
            out.println("<table border=1 >");
            out.println("<tr style='background-color:#ffffb3; color:red'>");
            out.println("<th>Emp Id</th>");
            out.println("<th> Age(Year)</th>");
            out.println("<th>First Name</th>");
            out.println("<th>Last Name</th>");
            out.println("</tr>");

            while(rs.next())
            {
                out.println("<tr style='background-color:#b3ffd9;'>");
                out.println("<td>"+rs.getInt(1)+"</td>");
                out.println("<td>"+rs.getInt(2)+"</td>");
                out.println("<td>"+rs.getString(3)+"</td>");
                out.println("<td>"+rs.getString(4)+"</td");
                out.println("</tr>");
            }
            out.println("</table>");
            rs.close();
        %>
    </body>
</html>