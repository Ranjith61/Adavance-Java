<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9"
	crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Airport</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"	href="airport.jsp">Air Port</a></li>
		<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>		
		</ul>
	</nav>
	<h2>THIS IS AIRPORT PAGE...</h2>
	
		<form action="idli" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Airport Name</label> <input type="text"
				class="form-control" id="name" placeholder="Enter name" name="name">
		</div>
		<div class="mb-3">
			<label for="country" class="form-label">Country</label> <input type="country" class="form-control"
				id="country" placeholder="Enter country "
				name="country">
		</div>
		<div class="mb-3">
			<label for="type" class="form-label">Type</label> <input
				type="type" class="form-control" id="type"
				placeholder="Enter type" name="type">
		</div>

		<div class="mb-3">
			<label for="city" class="form-label">City</label> <input
				type="city" class="form-control" id="city"
				placeholder="Enter city" name="city">
		</div>
		
		<div class="mb-3">
			<label for="capacity" class="form-label">Capacity</label> <input type="capacity" class="form-control"
				id="capacity" placeholder="Enter capacity "
				name="capacity">
		</div>
		<div class="mb-3">
			<label for="width" class="form-label">Width</label> <input type="width" class="form-control"
				id="width" placeholder="Enter width "
				name="width">
		</div>
		<div class="mb-3">
			<label for="totalTerminal" class="form-label">Total Terminals</label> <input type="totalTerminal" class="form-control"
				id="totalTerminal" placeholder="Enter totalTerminal "
				name="totalTerminal">
		</div>
		<div class="mb-3">
			<label for="openDate" class="form-label">Open Date</label> <input type="openDate" class="form-control"
				id="openDate" placeholder="Enter openDate "
				name="openDate">
		</div>
		<div class="mb-3">
			<label for="operational" class="form-label">Operational</label> <input type="operational" class="form-control"
				id="operational" placeholder="Enter operational "
				name="operational">
		</div>
		<div class="mb-3">
			<label for="inaguratedBy" class="form-label">Inagurated By</label> <input type="inaguratedBy" class="form-control"
				id="inaguratedBy" placeholder="Enter inaguratedBy "
				name="inaguratedBy">
		</div>
		<button type="submit" value="register" class="btn btn-success ">Send</button>
	</form>





	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>