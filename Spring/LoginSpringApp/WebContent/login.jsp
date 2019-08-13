<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h2>${logonerror}</h2>
	<form action="valid" method="post">
	<table>
	<tr>
		<th >Enter user name:</th>
		<th><input type="text" name="username"/></th></tr><br>
	<tr>	
		<th>Enter password:</th>
		<th><input type="password" name="password"/></th><br></tr>
	<tr>	
		<th><input type="submit" name="submit" value="Login"></th></tr>
	</table>
	</form>
	

</body>
</html>