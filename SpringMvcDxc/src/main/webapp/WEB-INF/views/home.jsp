<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Manager Home</title>
    </head>
    <body>
        <div align="center">
            <h1>Employee List</h1>
            <h3><a href="/SpringMvcDxc/newEmployee">New Employee</a></h3>
            <table border="1">
                <th>No</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Designation</th>
                <th>Action</th>
                 
                <c:forEach var="employee" items="${listEmployee}" varStatus="status">
                <tr>
                    <!--  <td>${status.index + 1}</td>-->
                    <td>${employee.id}</td>
                    <td>${employee.name}</td>
                    <td>${employee.salary}</td>
                    <td>${employee.designation}</td>
                    <td>
                        <a href="/SpringMvcDxc/editEmployee?id=${employee.id}">Edit</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;
                        <a href="/SpringMvcDxc/deleteEmployee?id=${employee.id}">Delete</a>
                    </td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>