<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Get all Data</h1>
	<table style="width:100%">
  <tr>
    <th>Emp id</th>
    <th>Emp name</th>
    <th>Emp gender</th>
    <th>Emp mail</th>
    <th>Emp password</th>
    <th>Emp phone</th>
  </tr>
  
  <c:forEach items="${emp}" var="e">
  <tr>
    <td>${e.empId}</td>
    <td>${e.empName}</td>
    <td>${e.gender}</td>
    <td>${e.email}</td>
    <td>${e.passowrd}</td>
    <td>${e.empPhone}</td>
  </tr>
  </c:forEach>
  
</table>
</body>
</html>