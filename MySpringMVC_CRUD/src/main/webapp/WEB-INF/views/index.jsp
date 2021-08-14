<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student info</title>
</head>
<body>
	<div align="center">
		<div style="margin: 5px;">
			<font color="green">${sMsg}</font>
			 <font color="red">${eMsg}</font>
		</div>
		<%-- <form:form action="addStud" modelAttribute="stud" method="post">
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
			<input type="submit" value="Submit">
		</form:form> --%>

<form:form action="addStud" modelAttribute="stud" method="post">

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
 <th><label>E-mail</label></th>
 <td><form:input path="email"/></td>
</tr>

<tr>
 <th><label>Address</label></th>
 <td><form:input path="address"/></td>
</tr>
<tr>
<td>
<input type="submit" value=Registor>
<td>
<tr>
</table>
</form:form>		
		
		
<hr>		
		<br>
		<br>
	</div>
	<div align="center" >
		<table border="1px " width=60%>
			<tr style="font-weight:bold; background-color: #FF5050; " >
				<td >Student Id</td>
				<td>Name</td>
				<td>Class</td>
				<td>E-mail</td>
				<td>Address</td>
				<td>Delete</td>
				<td>Edit</td>
				
			</tr>
			<c:forEach var="stud" items="${studlist}">
				<tr style= "background-color: #9966FF;">
					<td>${stud.studId }</td>
					<td>${stud.studName }</td>
					<td>${stud.studClass }</td>
					<td>${stud.email }</td>
					<td>${stud.address }</td>
					
					<td><a href="deleteStud?studId=${stud.studId }"><button
								style="color: red;">Delete</button></a></td>
					<td><a href="editStud?studId=${stud.studId }"><button
								style="color: green;">Edit</button></a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>