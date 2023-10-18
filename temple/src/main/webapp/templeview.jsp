<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>temple view</title>
</head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<style>
table, th, td {
	border: 2px solid black;
}
</style>

<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-start">
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>
		</ul>
	</nav>

	<div>
		<table class="table table-bordered">
			<h3>* Temple Details *</h3>
			<table style="width: 100%">
				<tr>
					<th>Name</th>
					<th>Place</th>
					<th>Main God</th>
					<th>Constructed Year</th>
					<th>Constructed By</th>
				</tr>

				<jstl:forEach items="${group}" var="dto">
					<tr>
						<td>${dto.name}</td>
						<td>${dto.place}</td>
						<td>${dto.mainGod}</td>
						<td>${dto.constructedYear}</td>
						<td>${dto.constructedBy}</td>

					</tr>

				</jstl:forEach>
			</table>
	</div>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>