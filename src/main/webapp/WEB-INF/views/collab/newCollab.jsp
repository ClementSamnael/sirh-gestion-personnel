<%@page import="java.time.LocalDate"%>
<%@ page language="java" pageEncoding="UTF-8"%>


<section class="container-fluid">
	<div class="container">
		<form action="<%= request.getContextPath() %>/collaborateurs/ajouter" method="post">
			<div class="form-group row">
				<label for="inputNom" class="col-sm-2 col-form-label">Nom</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputNom"
						placeholder="Nom" required>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputPrenom" class="col-sm-2 col-form-label">Prénom</label>
				<div class="col-sm-10">
					<input type="text" class="form-control" id="inputPrenom"
						placeholder="Prénom" required>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputDate" class="col-sm-2 col-form-label">Date
					de naissance</label>
				<div class="col-sm-10">
					<input type="date" class="form-control" id="inputDate"
						placeholder="Date de naissance" required>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputAdresse" class="col-sm-2 col-form-label">Adresse</label>
				<div class="col-sm-10">
					<textarea id="inputAdresse" required></textarea>
				</div>
			</div>
			<div class="form-group row">
				<label for="inputSecu" class="col-sm-2 col-form-label">Numéro
					de sécurité social</label>
				<div class="col-sm-10">
					<input type="number" class="form-control" id="inputSecu"
						placeholder="X-XXXX-XXXX-XXXX-XX" required>
				</div>
			</div>

			<div class="text-right">
				<!-- Button trigger modal -->
				<button type="submit" class="btn btn-primary">Créer</button>
			</div>
		</form>
	</div>
</section>