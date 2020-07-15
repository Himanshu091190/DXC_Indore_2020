<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New/Edit Employee</title>
</head>
<body>

	<div align="center">
		<h1>New/Edit Employee</h1>
		<form:form action="saveEmployee" method="get" modelAttribute="employee">
			<table>
				<form:hidden path="id" />
				<tr>
					<td>Name:</td>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<td>Salary:</td>
					<td><form:input path="salary" /></td>
				</tr>
				<tr>
					<td>Designation:</td>
					<td><form:input path="designation" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="SAVE"></td>
				</tr>
			</table>
		</form:form>
	</div>

</body>
</html>