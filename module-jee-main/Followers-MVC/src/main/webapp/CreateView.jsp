<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create View</title>
</head>
<body>
	<h1>Create</h1>
	
	<form method="post">
		<label for='txtName'>Nom</label>
		<input type='text' name='txtName'> <br/>
		
		<label for='txtLevel'>Niveau</label>
		<input type='number' name='txtLevel'> <br/>
		
		<label for='txtSize'>Taille</label>
		<input type='number' name='txtSize'> <br/>
		
		<label for='txtType'>Type</label>
		<input type='text' name='txtType'> <br/>
		
		<input type='submit' value='Valider'>
	</form>
	
</body>
</html>