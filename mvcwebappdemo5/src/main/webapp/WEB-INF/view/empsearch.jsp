<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
</style>
</head>

<body>
	<form action="http://localhost:8080/mvcwebappdemo5/employee/getbyid"
		method="POST">
		<label>Enter Emp Id</label> <input type="text" name="empId">
		<button type="submit">submit</button>
	</form>
	<br>
	<b>${emp1}</b> 

</body>
</html>