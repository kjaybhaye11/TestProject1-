<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import="java.util.List,com.tqpp.Model.Product" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>


<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2" >
<h1>Products</h1>
<tr>
<th>ID</th>
<th>ProductName</th>
<th>ProductPrice</th>
<th>ProductDescp</th>
<td>Action</td>
</tr>
<c:forEach  var="s1" items="${productlist}">
<tr>
<td>${s1.getPid()}</td>
<td>${s1.getPname()}</td>
<td>${s1.getPrice()}</td>
<td>${s1.getPdesc()}</td>

</tr>
</c:forEach>
</table>

</body>
</html>