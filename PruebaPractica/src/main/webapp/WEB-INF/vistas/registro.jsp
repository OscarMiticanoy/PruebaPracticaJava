<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro Persona</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
</head>
<body>
	<div class="containar mt-4">
		<div class="card">
			<form action="/agregar" method="POST" class="col-sm-5">
				<div class="card-header">
					<h4>Agregar Persona</h4>
				</div>
				<div class="card-body">
					<div class="form-grup">
						<label>nombre</label><input type="text" name="nombre" class="form-control"/>
					</div>
					<div class="form-grup">
						<label>apellido</label><input type="text" name="apellido" class="form-control"/>
					</div>
					<div class="form-grup">
						<label>check</label><input type="hidden" name="procesado" value=false class="form-control"/>
					</div>
				</div>
				<div class="card-footer">
					<button type="submit" value="guardar" class="btn btn-primary">Guardar</button>
					<a href="/listar" class="btn btn -link">regresar</a>
				</div>
			</form>
		</div>
	</div>
</body>
</html>