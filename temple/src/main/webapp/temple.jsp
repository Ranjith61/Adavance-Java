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
<title>Temple</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active"
				href="temple.jsp">Temple</a></li>
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>
			

		</ul>
	</nav>
	<h2>This is Temple page...</h2>
	<h4>Total temples saved: ${total}</h4>
	<a href="view">view</a>

	<form action="temple" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> <input type="text"
				class="form-control" id="name" placeholder="Enter name" name="name">
		</div>

		<div class="mb-3">
			<label for="place" class="form-label">Place</label> <input
				type="place" class="form-control" id="place"
				placeholder="Enter place" name="place">
		</div>

		<div class="mb-3">
			<label for="main god" class="form-label">Main god</label> <input
				type="main god" class="form-control" id="main god"
				placeholder="Enter main god" name="mainGod">
		</div>


		<div class="mb-3">
			<label for="constructed year" class="form-label">Constructed
				year</label> <input type="constructed year" class="form-control"
				id="constructed year" placeholder="Enter constructed year "
				name="constructedYear">
		</div>

		<div class="mb-3">
			<label for="constructed by" class="form-label">Constructed by</label>
			<input type="constructed by" class="form-control" id="constructed by"
				placeholder="Enter constructed by " name="constructedBy">
		</div>
		<button type="submit" value="register" class="btn btn-success ">Booked
			Items</button>
	</form>


	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>