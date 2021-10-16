<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
</style>
</head>

<body>
	<form action="/mvcwebappdemo4/employee/getbyid"
		method="POST">
		<label>Enter Emp Id</label> <input type="text" name="empId">
		<button type="submit">submit</button>
	</form>
	<br>
	<c:if test="${emp==null}">
	<b>No Records found</b>
	</c:if>
	<b>${emp}</b>
 
</body>
</html>