<%@ page language="java" pageEncoding="UTF-8"%>


<div class="text-right">
	<button type="button" class="btn btn-dark">Ajout d'un nouveau
		Collaborateur</button>
</div>
<section class="container-fluid">

	<div class="container">
		<div class="row">
			<div class="col-sm-5">
				<h1>Les Collaborateurs</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-5">Rechercher un nom ou un prénom qui
				commence par :</div>
			<div class="col">
				<input type="search" />
				<button type="button" class="btn btn-outline-success">Recherche</button>
			</div>
			<div class="col">
				<div class="custom-control custom-checkbox">
					<input type="checkbox" class="custom-control-input"
						id="customCheck1"> <label class="custom-control-label"
						for="customCheck1">Voir les Collaborateurs désactivés</label>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-5">Filtre par Département :</div>
			<div class="col-sm-3">
				<select class="custom-select">
					<option selected>Tous</option>
					<option value="Comptabilité">Comptabilité</option>
					<option value="Ressources_Humaines">Ressources Humaines</option>
					<option value="Informatique">Informatique</option>
				</select>
			</div>
		</div>
	</div>


	<div class="card-deck m-5">
		<div class="card">
			<div class="card-header">NOM Prénom</div>
			<div class="card-body">
				<div class="container">
					<div class="media">
						<img src="<%=request.getContextPath()%>/images/armorknight.jpg" class="align-self-center mr-3"
							alt="armorknight">
						<div class="media-body">
							<p class="card-text">Fonction</p>
							<p class="card-text">Département</p>
							<p class="card-text">Email</p>
							<p class="card-text">Téléphone</p>
						</div>
						<div class="media-body">
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
						</div>
					</div>
				</div>
				<div class="text-right">
					<button type="button" class="btn btn-dark">Éditer</button>
				</div>
			</div>
		</div>

		<div class="card">
			<div class="card-header">NOM Prénom</div>
			<div class="card-body">
				<div class="container">
					<div class="media">
						<img src="<%=request.getContextPath()%>/images/armorknight.jpg" class="align-self-center mr-3"
							alt="armorknight">
						<div class="media-body">
							<p class="card-text">Fonction</p>
							<p class="card-text">Département</p>
							<p class="card-text">Email</p>
							<p class="card-text">Téléphone</p>
						</div>
						<div class="media-body">
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
						</div>
					</div>
				</div>
				<div class="text-right">
					<button type="button" class="btn btn-dark">Éditer</button>
				</div>
			</div>
		</div>

		<div class="card">
			<div class="card-header">NOM Prénom</div>
			<div class="card-body">
				<div class="container">
					<div class="media">
						<img class="image-fluid" src="<%=request.getContextPath()%>/images/armorknight.jpg"
							class="align-self-center mr-3" alt="armorknight">
						<div class="media-body">
							<p class="card-text">Fonction</p>
							<p class="card-text">Département</p>
							<p class="card-text">Email</p>
							<p class="card-text">Téléphone</p>
						</div>
						<div class="media-body">
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
						</div>
					</div>
				</div>
				<div class="text-right">
					<button type="button" class="btn btn-dark">Éditer</button>
				</div>
			</div>
		</div>
	</div>

	<div class="card-deck m-5">
		<div class="card">
			<div class="card-header">NOM Prénom</div>
			<div class="card-body">
				<div class="container">
					<div class="media">
						<img src="<%=request.getContextPath()%>/images/armorknight.jpg" class="align-self-center mr-3"
							alt="armorknight">
						<div class="media-body">
							<p class="card-text">Fonction</p>
							<p class="card-text">Département</p>
							<p class="card-text">Email</p>
							<p class="card-text">Téléphone</p>
						</div>
						<div class="media-body">
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
						</div>
					</div>
				</div>
				<div class="text-right">
					<button type="button" class="btn btn-dark">Éditer</button>
				</div>
			</div>
		</div>

		<div class="card">
			<div class="card-header">NOM Prénom</div>
			<div class="card-body">
				<div class="container">
					<div class="media">
						<img src="<%=request.getContextPath()%>/images/armorknight.jpg" class="align-self-center mr-3"
							alt="armorknight">
						<div class="media-body">
							<p class="card-text">Fonction</p>
							<p class="card-text">Département</p>
							<p class="card-text">Email</p>
							<p class="card-text">Téléphone</p>
						</div>
						<div class="media-body">
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
						</div>
					</div>
				</div>
				<div class="text-right">
					<button type="button" class="btn btn-dark">Éditer</button>
				</div>
			</div>
		</div>

		<div class="card">
			<div class="card-header">NOM Prénom</div>
			<div class="card-body">
				<div class="container">
					<div class="media">
						<img src="<%=request.getContextPath()%>/images/armorknight.jpg" class="align-self-center mr-3"
							alt="armorknight">
						<div class="media-body">
							<p class="card-text">Fonction</p>
							<p class="card-text">Département</p>
							<p class="card-text">Email</p>
							<p class="card-text">Téléphone</p>
						</div>
						<div class="media-body">
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
							<p class="card-text">XXXXXXXXX</p>
						</div>
					</div>
				</div>
				<div class="text-right">
					<button type="button" class="btn btn-dark">Éditer</button>
				</div>
			</div>
		</div>
	</div>
</section>