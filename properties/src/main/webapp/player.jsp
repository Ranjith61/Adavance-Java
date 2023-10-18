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
<title>Player</title>
</head>
<body>
	<nav class="navbar bg-info" data-bs-theme="Light">
		<ul class="nav justify-content-end">
		<li class="nav-item"><a class="nav-link active"	href="player.jsp">Player</a></li>
		<li class="nav-item"><a class="nav-link" href="index.jsp">Home</a>
			</li>		
		</ul>
	</nav>
	<h2>THIS IS PLAYER PAGE...</h2>
	
		<form action="players" method="post">
		<div class="mb-3">
			<label for="name" class="form-label">Name</label> <input type="text"
				class="form-control" id="name" placeholder="Enter name" name="name">
		</div>
		<div class="mb-3">
			<label for="sport" class="form-label">Sport</label> <input
				type="sport" class="form-control" id="sport"
				placeholder="Enter sport" name="sport">
		</div>

		<div class="mb-3">
			<label for="jersyNo" class="form-label">JersyNo</label> <input
				type="jersyNo" class="form-control" id="jersyNo"
				placeholder="Enter jersyNo" name="jersyNo">
		</div>
		<div class="mb-3">
			<label for="country" class="form-label">Country</label> <input type="country" class="form-control"
				id="country" placeholder="Enter country "
				name="country">
		</div>
		<div class="mb-3">
			<label for="dob" class="form-label">DOB</label> <input type="dob" class="form-control"
				id="dob" placeholder="Enter dob "
				name="dob">
		</div>
		<div class="mb-3">
			<label for="married" class="form-label">Married</label> <input type="married" class="form-control"
				id="married" placeholder="Enter married "
				name="married">
		</div>
		<div class="mb-3">
			<label for="captainName" class="form-label">Captain Name</label> <input type="captainName" class="form-control"
				id="captainName" placeholder="Enter captainName "
				name="captainName">
		</div>
		<div class="mb-3">
			<label for="coachName" class="form-label">Coach Name</label> <input type="CoachName" class="form-control"
				id="coachName" placeholder="Enter coachName "
				name="coachName">
		</div>
		<div class="mb-3">
			<label for="gender" class="form-label">Gender</label> <input type="gender" class="form-control"
				id="gender" placeholder="Enter gender "
				name="gender">
		</div>
		<div class="mb-3">
			<label for="age" class="form-label">Age</label> <input type="age" class="form-control"
				id="age" placeholder="Enter age "
				name="age">
		</div>
		<div class="mb-3">
			<label for="wife" class="form-label">Wife</label> <input type="wife" class="form-control"
				id="wife" placeholder="Enter wife "
				name="wife">
		</div>
		<button type="submit" value="register" class="btn btn-success ">Send</button>
	</form>





	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
		crossorigin="anonymous"></script>
</body>
</html>