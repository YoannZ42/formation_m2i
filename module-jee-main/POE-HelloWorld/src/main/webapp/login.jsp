<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.Date"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" type="text/css" href="style.css">
	</head>
	
	<body>
		<h1>Login</h1>
		
		<h2><%= new Date() %></h2>
		
		<form action="login" method="post">
			
			<label for="txtLogin">Login</label>
			<input name="txtLogin" type="text" value="${login}"><br>

			<label for="txtPassword">Password</label>
			<input name="txtPassword" type="password" value="${password}"><br>
			
			<input type="submit" value="Connection">
		</form>
		
	</body>
</html>
