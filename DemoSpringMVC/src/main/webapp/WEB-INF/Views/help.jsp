<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false"    %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/fmt" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <% /*   String name=(String) request.getAttribute("name");
     Integer rno=(Integer) request.getAttribute("rno");    */
    
  %>

<h1>this is Help Page No</h1>
<h1>Hello my name is :   ${name }<%--<%=name%>  --%>   </h1>
<h1> your roll no is:  ${rno} <%-- <%=rno%>--%>  </h1>

         
 
   




</body>
</html>