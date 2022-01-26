<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Triângulo</title>
<link rel="stylesheet" href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"/>
</head>
<body style="background-color:#000">
	<form action="Triangulo" method="post" class="container" autocomplete="off">
		<div class="row flex-column align-items-center mt-5">
			<input type="text" placeholder="LADO 1" name="lado1" class="col-1">
			<img src="https://github.com/lidiamac/imagemTriangulo/blob/980aef0b802f00cc89e16d3b3e00422ab3c43425/triangulo.png?raw=true" alt="triangulo" class="w-25 mt-5 ">
		</div>
		
		<div class="row flex-row justify-content-evenly">
			<input type="text" placeholder="LADO 2" name="lado2" class="col-1">
			<input type="text" placeholder="LADO 3" name="lado3" class="col-1">
		</div>
	</form>
</body>
</html>