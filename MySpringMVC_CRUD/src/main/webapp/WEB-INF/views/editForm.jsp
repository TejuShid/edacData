<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<%-- <form:form action="updateStud" modelAttribute="stud">
			<label>Student Id</label>
			<form:input path="studId" />
			<br>
			<label>Name</label>
			<form:input path="studName" />
			<br>
			<label>Class</label>
			<form:input path="studClass" />
			<br>
			<label>Address</label>
			<form:input path="address" />
			<br>
			<input type="submit" value="Update">
		</form:form> --%>
		
------------------------------------------------------------------------------------------------------------------------------------------
<form:form action="updateStud" modelAttribute="stud" method="POST">

<table>
<tr>
  <th><label>Student Id:</label></th>
  <td><form:input path="studId" /></td>
</tr>

<tr>
  <th><label>First Name:</label></th>
  <td><form:input path="studName"/></td>
</tr>
<tr> 
  <th><label>Class:</label></th>
  <td><form:input  path="studClass"/></td>
</tr>
<tr>
 <th><label>Address</label></th>
 <td><form:input path="address"/></td>
</tr>

<tr>
 <th><label>E-mail</label></th>
 <td><form:input path="email"/></td>
</tr>
<tr>
<td>
<input type="submit" value=Update>
<td>
<tr>
</table>
</form:form>			
		
-----------------------------------------------------------------------------------------------------------------------------------------		
		
		
		
	</div>
</body>
</html>