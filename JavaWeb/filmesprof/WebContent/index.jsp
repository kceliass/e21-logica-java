<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:include page="inc/header.jsp"></jsp:include>

<main>
	<div class="jumbotron row">
		<h1>Top Filmes</h1>
	</div>

	<div class="row">
		<div class="card col-4" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">August Rush</h5>
				<h6 class="card-subtitle mb-2 text-muted">
					Drama - <span class="badge badge-success">Livre</span>
				</h6>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="card-link">Ver</a>
			</div>
		</div>


		<div class="card col-4" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">Avengers</h5>
				<h6 class="card-subtitle mb-2 text-muted">
					Ficção - <span class="badge badge-warning">+12</span>
				</h6>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="card-link">Ver</a>
			</div>
		</div>

		<div class="card col" style="width: 18rem;">
			<div class="card-body">
				<h5 class="card-title">Jhon Wick</h5>
				<h6 class="card-subtitle mb-2 text-muted">
					Ação - <span class="badge badge-danger">+16</span>
				</h6>
				<p class="card-text">Some quick example text to build on the
					card title and make up the bulk of the card's content.</p>
				<a href="#" class="card-link">Ver</a>
			</div>
		</div>
	</div>
</main>
<jsp:include page="inc/footer.jsp"></jsp:include>
