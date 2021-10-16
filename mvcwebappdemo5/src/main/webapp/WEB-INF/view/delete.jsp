<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Delete jsp</h1>
	<form action="http://localhost:8080/mvcwebappdemo5/employee/delete"
		method="POST">
		<label>Enter Emp Id to delete</label> 
		<input type="text" name="empId">
		<br>
		<br>
		<button type="submit">Click here to delete record</button>
		&nbsp;
		
		<c:if test="${status!=null && status==true}">
			<b>Record Deleted!</b>
		</c:if>
		<c:if test="${status!=null && status==false}">
			<b>No Records Found to be deleted!</b>
		</c:if>
	</form>
</body>
</html>