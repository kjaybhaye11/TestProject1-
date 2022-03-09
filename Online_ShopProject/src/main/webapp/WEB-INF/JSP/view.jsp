     <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.util.List,com.tqpp.Model.Product" isELIgnored="false"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>

  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>  


<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>




<body>
<center>
<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>
<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
<h1 align ="center">....Product CRUD....</h1> 

<h1 align ="center">  Hi <%=session.getAttribute("username") %>  </h1>


<h2 align ="center"> <a href="add">Add Product</a></h2> 
<table border="6" >

<tr>
<th>ID</th>
<th>ProductName</th>
<th>ProductPrice</th>
<th>ProductDescp</th>
<th>Stockinhand</th>
<td>Action</td>
</tr>
<c:forEach  var="s1" items="${productlist}">
<tr>
<td>${s1.getPid()}</td>
<td>${s1.getPname()}</td>
<td>${s1.getPrice()}</td>
<td>${s1.getPdesc()}</td>
<td>${s1.getStockinhand()}</td>
<td>
<a href="edit?id=${s1.getPid()}">Edit</a>
<a href="delete?id=${s1.getPid()}">Delete</a></td>
</tr>
</c:forEach>


</table>




<h4 >
    <a class="btn btn-primary" style="align-self: center" href="validateuser" role="button">Back</a>
    </h4>
</center>
</body>
</html>    