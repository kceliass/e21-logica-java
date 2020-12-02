<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="inc/header.jsp"></jsp:include>

	<main>
		<div class="jumbotron">
			<h1>Adiciona Aqui o Filme que desejar!</h1>
		</div>

		<div style="width:70%; margin: 5px auto;">
			<form action="filme?action=listFilmes" method="post">
				<div class="form-group">
					<label for="titulo">Titulo:</label>
					<input type="text" name="titulo" class="form-control" placeholder="Insira o titulo do filme">
				</div>
				<div class="form-group">
					<label for="genero">Gênero:</label>
					<input type="text" name="genero" class="form-control" placeholder="Insira o gênero do filme">
				</div>
					<label for="classificacao">Classificação:</label>
				<div class="row" style="margin: 5px auto;">
					<label for="Livre" class="cls-btn badge badge-success" style="margin-left: 5px;">
					<input type="radio" name="classificacao" id="classificacao" value="Livre"> Livre </label>
					<label for="10" class="cls-btn badge badge-info" style="margin-left: 5px;">
					<input type="radio" name="classificacao" id="classificacao" value="10"> 10+ </label>
					<label for="12" class="cls-btn badge badge-warning btn-yellow" style="margin-left: 5px;">
					<input type="radio" name="classificacao" id="classificacao" value="12"> 12+ </label>
					<label for="14" class="cls-btn badge badge-warning" style="margin-left: 5px;">
					<input type="radio" name="classificacao" id="classificacao" value="14"> 14+ </label>
					<label for="16" class="cls-btn badge badge-danger" style="margin-left: 5px;">
					<input type="radio" name="classificacao" id="classificacao" value="16"> 16+ </label>
					<label for="18" class="cls-btn badge badge-dark" style="margin-left: 5px;">
					<input type="radio" name="classificacao" id="classificacao" value="18"> 18+ </label>
				</div>
					<div class="top-filme from-group" id="top-filme">
					<label for="titulo">Top Filmes</label>
                        <label for="top-filme" class="badge badge-success" style="margin-left: 5px;"><input type="radio" name="topfilme" id="classificacao" value="sim"> Sim </label>
                        <label for="top-filme" class="badge badge-danger" style="margin-left: 5px;"><input type="radio" name="topfilme" id="classificacao" value="não"> Não </label>
                    </div>
				<input type="submit" id="btnSubmit" class="btn btn-lg btn-block btn-success" value="Enviar" >
				<a href="javascript:void(0);" onclick="window.history.back();" class="btn btn-lg btn-block btn-danger" >Cancelar</a>
			</div>
			</form>
		
		</div>
	</main>

<jsp:include page="inc/footer.jsp"></jsp:include>
