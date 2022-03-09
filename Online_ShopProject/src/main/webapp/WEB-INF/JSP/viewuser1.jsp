<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import="java.util.List,com.tqpp.Model.Product" isELIgnored="false"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>

<!--  

<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<head>
-->
 
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-81">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
  <script type="text/javascript">
function m1(a,ob)
{
	/* console.log("hellooo"+ob); */
	var v=document.getElementById(""+ob).value;
/* 	console.log("vvvvvvvvvvvv"+v); */
	var h="cart?id="+ob+"&quan="+v;
	/* alert(h); */
	//alert(a);
	a.setAttribute("href",h);
	//this.setAttribute("href",)
}

</script>
  
  
  
  
</head>






<meta charset="ISO-8859-1">
<title>Products</title>
</head>


<body>

<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>

<center>

<h1>Products</h1>


    
<h2 align ="center">  Hi.. <%=session.getAttribute("username") %>  </h2>

<table border="2">

<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>
<h2 align="center"><a href="viewcart">View Cart</a></h2>

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