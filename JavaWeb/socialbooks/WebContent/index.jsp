<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SocialBooks</title>
<script src="https://kit.fontawesome.com/939df34509.js" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

</head>
<body>

<div class="container">
	<main>
		<div class="jumbotron">
			<h1>Social Books</h1>
			<h3>Fa�a seu Login para acessar</h3>
			<br>
			<hr>
			<a class="btn btn-lg btn-primary" href="livro?action=list">Acessar</a>
		</div>
	</main>

<!-- Footer -->
<jsp:include page="includes/footer.jsp"></jsp:include>

<!-- Scripts -->
<jsp:include page="js/scripts.js"></jsp:include>