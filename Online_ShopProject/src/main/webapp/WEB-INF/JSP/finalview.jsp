
  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@page import="java.util.List,com.tqpp.Model.Product" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

 
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<html>

>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>

 <h1 style="background-color:LightGray;">Order Placed and will be soon..</h1>
 
 <h1 style="background-color:LightGray;">Thanks!!!!!!..</h1>
 
 
 <h2 align ="center">  Done order <%=session.getAttribute("username") %>  </h2>
 
 
 <table>
<table border="2" >

 <tr>
           <th>ProductName </th>
            <th>ProductPrice </th>
             <th>Quantity </th>
             <th>Amount</th>
      </tr>
     </thead>
    <tbody>
   <c:forEach var="e1" items="${tempproductlist}">
  <tr>

<td>${e1.getItemname() }</td>
<td>${e1.getItemprice()}</td>
<td> ${e1.getQuantity()}</td>
<td> ${e1.getItemprice()*e1.getQuantity()}</td>

</tr>
</c:forEach> 
     
    </tbody>
  </table>
  Total Amount :${total}
  
  <br>
 
 
 
 
</center> 
 
 
 
<h4 align=" center" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
  
  
  
</body>
</html>
  