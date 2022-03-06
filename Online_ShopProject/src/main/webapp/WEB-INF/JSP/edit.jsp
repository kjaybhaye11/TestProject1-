<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="com.tqpp.Model.Product,java.util.ArrayList" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align ="center">  Hi.. <%=session.getAttribute("username") %>  </h2>
<center>
<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>

<h1>Update Data</h1>
<form  method="get" action="update">

Id:  <input type="text"   name="pid"      value="${product.getPid()}" readonly><br>


Name:<input type="text"   name="pname"     value="${product.getPname()}" ><br>


Price:<input type="text"   name="price"     value="${product.getPrice()}"><br>


Desc:<input type="text"   name="pdesc"      value="${product.getPdesc()}"><br>


<input type="submit" value="update">
</form>

</center>

</body>
</html>