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
<title>Vendor</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">

			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>
			<li class="nav-item"><a class="nav-link active"
				href="product.jsp">Product</a></li>
			<li class="nav-item"><a class="nav-link active"
				href="vendor.jsp">Vendor</a></li>

		</ul>
	</nav>
	<h1>THIS IS VENDOR PAGE...</h1>

	<form action="biriyani" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> <input type="text"
				class="form-control" id="name" placeholder="Enter name" name="name">
		</div>
		<div class="mb-3">
			<label for="gst" class="form-label">GST</label> <input type="gst"
				class="form-control" id="gst" placeholder="Enter gst" name="gst">
		</div>

		<div class="mb-3">
			<label for="owner" class="form-label">Owner</label> <input
				type="owner" class="form-control" id="owner"
				placeholder="Enter owner" name="owner">
		</div>
		<div class="mb-3">
			<label for="location" class="form-label">Location</label> <input
				type="location" class="form-control" id="location"
				placeholder="Enter location " name="location">
		</div>
		<button type="submit" value="register" class="btn btn-success ">Send</button>
	</form>




	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</body>
</html>