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

	<form action="http://localhost:8080/mvcwebappdemo2/employee/save" method="POST">
		
		<label>Name</label><br> 
		<input type="text" name="empName" required="required"><br>

		<label>phonenumber</label><br> 
		<input type="text" name="empPhone" required="required"><br>

		<label>Email</label><br> 
		<input type="text" name="email" required="required">
		<br>
		<label>Password</label><br> 
		<input type="password" name="passowrd" required="required">
		<br>
		 
		<label>Dob</label><br> 
		<input type="date" name="empDob"><br>

		<label>Choose a gender:</label> 
		<select name="gender" required="required">
			<option value="male">Male</option>
			<option value="female">Female</option>
		</select> <br>
		
		<button type="submit">Register</button>
		
		&nbsp;
		
		<c:if test="${status!=null && status==true}">
			<b>Registration Done!</b>
		</c:if>
		<c:if test="${status!=null && status==false}">
			<b>Registration Failed!</b>
		</c:if>
		
	</form>
</body>
</html>