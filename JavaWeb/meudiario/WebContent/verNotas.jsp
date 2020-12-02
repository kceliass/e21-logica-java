<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="includes/header.jsp"></jsp:include>

<main>
	<div class="card">
		<div class="card-body">
    	<h5 class="card-title"><c:out value="${nota.assunto}" /></h5>
			<ul style="list-style: none;">
				<li>ID: <b><c:out value="${nota.id}" /></b>
				</li>
				<li>Assunto: <b><c:out value="${nota.assunto}" /></b>
				</li>
				<li>Data da Nota: <b><c:out value="${nota.dtNota}" /></b>
				</li>
				<li>Texto: <b><c:out value="${nota.texto}" /></b></li>
			</ul>
		</div>
	</div>
</main>
</div>

<footer>
	<button onclick="window.history.back();">Voltar</button>
</footer>

<!-- Footer -->
<jsp:include page="includes/footer.jsp"></jsp:include>

</body>
</html>