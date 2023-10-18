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
<title>Food</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">
			<li class="nav-item"><a class="nav-link active" href="food.jsp">Food</a></li>
			<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>
		</ul>
	</nav>
	<h2>THIS IS FOOD PAGE...</h2>

	<form action="vada" method="post">


		<label for="exampleInputName">Name</label> <input
			type="name" class="form-control" id="exampleInputName"
			placeholder="Enter name">
		</div>
		<div class="form-group">
			<label for="exampleInputType">Type</label> <input
				type="type" class="form-control" id="exampleInputType"
				placeholder="Enter Type">
		</div>
		<div class="form-group">
			<label for="exampleInputhotelName">Hotel Name</label> <input
				type="hotelName" class="form-control" id="exampleInputPassword1"
				placeholder="Enter HotelName">
		</div>
		<div class="form-group">
			<label for="exampleInputPrice">Price</label> <input
				type="price" class="form-control" id="exampleInputPrice"
				placeholder="Enter Price">
		</div>
		<div class="form-group">
			<label for="exampleInputquantity">Quantity</label> <input
				type="quantity" class="form-control" id="exampleInputQuantity"
				placeholder="Enter quantity">
		</div>
		<div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
                </div>
		</form>

		<script
			src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
			integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
			crossorigin="anonymous"></script>
</body>
</html>