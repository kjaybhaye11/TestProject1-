<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<center>
<h1>ADD NEW PRODUCT RECORD</h1>

<h2 align ="center">  Hi.. <%=session.getAttribute("username") %>  </h2>
<head>
<style>
body {
  background-color: powderblue;  
}  
</style>
</head>
<FORM method="get" action="save" >
<table>
<tr>
<th>ProdName:</th>
<td> <input type="text" name="pname"></td>
</tr>
<tr>
<th>ProdPrice</th>
<td><input type="text" name="price"></td>
</tr>
<tr>
<th>ProdDescp</th>
<td><input type="text" name="pdesc"></td>
</tr>

<tr>
<th>ProdQuantity</th>
<td><input type="text" name="stockinhand"></td>
</tr>


<tr>
<td colspan="2">
<input type="submit" value="submit">
</td>
</tr>
</table>
</FORM>

<h4 >
    <a class="btn btn-primary" style="align-self: center" href="view" role="button">Back</a>
    </h4>

</center>
</body>
</html>