<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page import="entity.Characters" %>   
<%@ page import="services.CharacterService" %>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Show View</title>
	</head>
	<body>
		<h1>Liste des personnages :</h1>
		
		<table>
			<thead>
				<tr> 
					<th>id</th> 
					<th>nom</th>
					<th>type</th>
					<th>taille</th>
					<th>niveau</th>
					<th>update</th>
					<th>delete</th>
				</tr>
			</thead>

			<tbody>
				<% for ( Characters c : new CharacterService().getAll() ) {%>
					<tr>
						<td> <%= c.getId() %> </td>
						<td> <%= c.getName() %> </td>
						<td> <%= c.getType() %> </td>
						<td> <%= c.getSize() %> </td>
						<td> <%= c.getLevel() %> </td>
						<td> <a href='#'>update</a> </td>
						<td> <a href='#'>delete</a> </td>
					</tr>
				<% } %>
			</tbody>
		</table>
		
		<a href='/Followers-MVC/add'>Create</a>
		
	</body>
</html>