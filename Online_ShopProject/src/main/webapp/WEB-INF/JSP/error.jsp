<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
     isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<h1>Errorrrrrrrr</h1>

<h1>You Dont delete This Product</h1>
<%=exception.getMessage() %>

<h4 >
    <a class="btn btn-primary" style="align-self: center" href="view" role="button">Back</a>
    </h4>
    
    </center>
</body>
</html>