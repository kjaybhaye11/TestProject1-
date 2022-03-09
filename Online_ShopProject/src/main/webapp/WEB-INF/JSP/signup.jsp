<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<!--  <body>
<center>
<form action="addsignup" method="post">
<h1>....Sign UP....</h1>

<table >
<tr>
<th>UserName</th><td><input type="text"  name="userName"></td>
</tr>
<tr>
<th>Password</th><td><input type="password"  name="password"></td>
</tr>
<tr>
<th>Email</th><td><input type="text"  name="email"></td>
</tr>
<tr>
<th>Mobile</th><td><input type="number"  name="mobile"></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="submit"></td>
</tr>

</center>
</table>


</body>
</html>  -->

<body>
<center>
<form action="addsignup" method="post">
<h1>....Sign UP....</h1>


<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>


<table >
<tr>
<th>UserName</th><td><input type="text"  name="userName"  required="required" pattern="[A-Za-z]{2,}" ></td>
</tr>
<tr>
<th>Password</th><td><input type="password"  name="password" required="required" pattern=".{3,}"  ></td>
</tr>
<tr>
<th>Email</th><td><input type="text"  name="email" required="required" pattern=".{2,}" ></td>
</tr>
<tr>
<th>Mobile</th><td><input type="number"  name="mobile"  ></td>
</tr>

<tr>
<td colspan="2"><input type="submit" value="submit"></td>





</center>


</table>
<h4 >
    <a class="btn btn-primary" style="align-self: center" href="logout" role="button">Back</a>
    </h4>
</center>

</body>
</html> 

