<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vistas y consultas</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-4">
		<a href="/registro" class="btn btn-success ">Registrar Nuevo</a>
		<table class="table">
			<thead>
				<tr>
					<th>CHECK</th>
					<th>ID</th>
					<th>NOMBRE</th>
					<th>APELLIDOS</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="person" items="${personas}">
					<tr>
						<td><input type="checkbox" class="form-check-input" id="process"></td>
						<td>${person.id}</td>
						<td>${person.nombre}</td>
						<td>${person.apellido}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<button type="button" onclick="guardarProcesados()" class="btn btn-primary">Procesar</button>
	</div>
</body>
</html>