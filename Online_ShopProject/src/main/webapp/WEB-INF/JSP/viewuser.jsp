<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List,com.tqpp.Model.Product" isELIgnored="false"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>



<head>
<meta charset="ISO-8859-1">
<title>Products</title>
</head>


<body>
<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="validateuser" role="button">Logout</a>
    </h4>
<center>

<h1>Products</h1>
<h2 align ="center">  Hi.. <%=session.getAttribute("username") %>  </h2>
<h2 align="center"><a href="viewcart">View Cart</a></h2>
<table border="8">

<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>


<tr>
<th>ID</th>
<th>ProductName</th>
<th>ProductPrice</th>
<th>ProductDescp</th>
<th>Action</th>
</tr>
<c:forEach  var="s1" items="${productlist}">
<tr>
<td>${s1.getPid()}</td>
<td>${s1.getPname()}</td>
<td>${s1.getPrice()}</td>
<td>${s1.getPdesc()}</td>

<td><a href="cart?id=${s1.getPid()}">Add to Cart</a>

</tr>
</c:forEach>
</table>

<h4 >
    <a class="btn btn-primary" style="align-self: center" href="validateuser" role="button">Back</a>
    </h4>



</center>

</body>

</html>