<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="home">

<h1>This is Home Page</h1>
<h1>call by Home Controller</h1>
<h1> /Home</h1>


<% String name=(String) request.getAttribute("name");
     Integer id=(Integer) request.getAttribute("id");
    
      %>
<h1>My name is <%=name%></h1>
<h1>My id is <%=id%></h1>

   



<input type="submit" value="submit">
</form>
</body>
</html>