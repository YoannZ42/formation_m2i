<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Signin View</h1>
		
		
		
		
		<!-- Nom, Prénom, email, password, confirmation -->
		<form action="Signin" method="post">
			<label for="firstname">Prénom</label>
			<input type="text" name="firstname" value="${firstname}">
			<span> ${firstNameError} </span> <br>
			
			
			<label for="lastname">Nom</label>
			<input type="text" name="lastname" value="${lastname}">			
			<span> ${lastNameError} </span> <br>

			<label for="email">Email</label>
			<input type="email" name="email"  value="${email}" >
			<span> ${emailError} </span><br>
			
			<label for="password">Password</label>
			<input type="password" name="password"  value="${password}">
			<span> ${passwordError} </span><br>

			<label for="confirmation">Confirmation</label>
			<input type="password" name="confirmation"  value="${confirmation}">
			<span> ${confirmationError} </span><br>
			
			<input type="submit" value="Valider">
		</form>
		
		
	</body>
</html>