<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</head>

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <center>

 <h1 style="background-color:LightGray;">Order Placed and will be soon..</h1>
 
 <h1 style="background-color:LightGray;">Thanks!!!!!!..</h1>
 
 
 <h2 align ="center">  Done order <%=session.getAttribute("username") %>  </h2>
</center> 
 
<h4 align=" right" >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Logout</a>
    </h4>
  
  
  
</body>
</html>