<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
      <%@page import="java.util.List,com.tqpp.Model.Product" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<body>

<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>


<div class="container mt-3">
<c:if test="${cartlist==null}">
<h1>Your cart is empty</h1>
</c:if>

<c:if test="${cartlist!=null}">
<h1>VIEW YOUR CARD.</h1>

 <form action="placeorder">
 
  <h2 align ="center">  Hi <%=session.getAttribute("username") %>  </h2>
  <h2 align ="center">....Welcome....</h2> 
  <p align ="center"> VIEW YOUR CART.</p>
  <table class="table table-bordered" border="3" >
  <% int total=0; %>
   <thead>
      <tr>
           <th>ProductName </th>
            <th>ProductPrice </th>
             <th>Quantity </th>
             <th>Amount</th>
      </tr>
     </thead>
    <tbody>
   <c:forEach var="e1" items="${cartlist}">
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
  <input type="submit" value="place order">
  </form>
  </c:if>
</div>

<br>
<h4> &nbsp;
 <a href="viewproduct"> Back To View Product</a> </h4>

</body>
</html>