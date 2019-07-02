<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" pageEncoding="UTF-8" isELIgnored="false"%>

<nav class="navbar sticky-top navbar-expand-lg navbar-light bg-lights"
	style="background-color: #e3f2fd;">

	<a class="navbar-brand" href=<c:url value="lister"/>> <img src=<c:url value="/images/dta.jpg"/>
		width="100" height="50" class="d-inline-block align-top"
		alt="dta ingénierie">
	</a>

	<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
		<div class="navbar-nav">
			<a class="nav-item nav-link active" href="#">Collaborateurs <span
				class="sr-only">(current)</span></a> <a class="nav-item nav-link"
				href="#">Stastiques</a> <a class="nav-item nav-link" href="#">Activités</a>
		</div>
	</div>
</nav>