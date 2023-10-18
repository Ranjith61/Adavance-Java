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
<title>PRODUCT</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"	href="product.jsp">Product</a></li>
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>
			<li class="nav-item"><a class="nav-link active"	href="vendor.jsp">Vendor</a></li>
			
		</ul>
	</nav>
	<h2>THIS IS PRODUCT PAGE...</h2>
	
		<form action="runner" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> <input type="text"
				class="form-control" id="name" placeholder="Enter name" name="name">
		</div>
		<div class="mb-3">
			<label for="price" class="form-label">Price</label> <input
				type="price" class="form-control" id="email"
				placeholder="Enter Price" name="price">
		</div>

		<div class="mb-3">
			<label for="type" class="form-label">Type</label> <input
				type="type" class="form-control" id="type"
				placeholder="Enter type" name="type">
		</div>
		<div class="mb-3">
			<label for="quantity" class="form-label">Quantity</label> <input type="quantity" class="form-control"
				id="quantity" placeholder="Enter quantity "
				name="quantity">
		</div>
		<button type="submit" value="register" class="btn btn-success ">Send</button>
	</form>





	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>