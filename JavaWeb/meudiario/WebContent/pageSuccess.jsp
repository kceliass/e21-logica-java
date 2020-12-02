<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="includes/header.jsp"></jsp:include>


<main>
	
	<div class="jumbotron">
		<h1>Meu Di�rio</h1>
		<h3 class="text-light bg-success block">
		<c:out value="${mensagem }" />
		</h3>
		<br>
		<hr>
		<a class="btn btn-lg btn-primary" href="notas?action=list">Lista de Notas</a>
	</div>
		
</main>

<jsp:include page="includes/footer.jsp"></jsp:include>
