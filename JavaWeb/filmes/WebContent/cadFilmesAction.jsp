<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:include page="inc/header.jsp"></jsp:include>

<main>
		<fieldset>
			<legend>Cadastro de Filmes</legend>
			<div>
				<form action="filme" method="post">
					<ul style="list-style: none;">
						<li>
							<label>Titulo:</label>
							<input class="form-control col-5" type="text" name="titulo" placeholder="Informe o titulo do filme...">
							<span id="tituloValidate"></span>
						</li>
						<li>
							<label>Classificação:</label>
							<input class="form-control col-5" type="number" name="classificacao" placeholder="3">
							<span id="classificacaoValidate"></span>
						</li>
						<li>
							<label>Titulo:</label>
							<input class="form-control col-5" type="text" name="genero" placeholder="Informe o gênero do filme...">
							<span id="generoValidate"></span>
						</li>
						<li>
							<inputclass="btn btn-success" type="submit" value="Cadastrar">
						</li>
					</ul>
				</form>
			</div>
		</fieldset>
	</main>
</div>

<!--  Scripts -->
<jsp:include page="inc/scripts.jsp"></jsp:include>

</body>
</html>