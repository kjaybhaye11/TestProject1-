<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

 <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>


<h1 style="background-color:powderblue;">Welcome My Page</h1>

<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>





<form action="validateuser" method="get">
<table border="2">
<tr>
<th>UserName</th><td><input type="text"  name="userName" required="required" pattern="[A-Za-z]{2,}" ></td>
</tr>
<tr>
<th>Password</th><td><input type="password"  name="password"  required="required" pattern=".{3,}"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"></td>
</tr>
</table>




</form>
<h4 >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Back</a>
    </h4>
</center>
</body>
</html> 




<!--  <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>


<h1 style="background-color:powderblue;">Welcome My Page</h1>

<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>





<form action="validateuser" method="get">
<table border="2">
<tr>
<th>UserName</th><td><input type="text"  name="userName"  ></td>
</tr>
<tr>
<th>Password</th><td><input type="password"  name="password"></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="submit"></td>
</tr>
</table>




</form>
</center>
</body>
</html> -->