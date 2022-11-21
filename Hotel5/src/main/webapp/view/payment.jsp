<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go-Green/Payment</title>
<link href="/styles/login.css" rel="stylesheet" >
</head>
<body>
<body id="LoginForm">
<div class="container">
<div class="login-form">
<div class="main-div">
    <div class="panel">

<body>
	<div style="margin-left: 3%;">
		<form method="post">
			<div>
				<div>
					<h1>Payment</h1>
				</div>
				<br>
				<div class="form-group">
					<input type="email"  class="form-control" placeholder="Enter email:" name="email" width="200px"  required>
				</div>
				<div class="form-group">
					<input type="text"
						  class="form-control" placeholder="Enter hotelname:" name="hotelname" width="200px"  required>
				</div>
				<div class="form-group">
				<input type="text"
					 class="form-control"	placeholder="Enter rooms:" name="rooms" width="200px" required>
				</div>
				<div class="form-group">
					 <input type="text"
					 class="form-control"	placeholder="Enter amount:" name="price" width="200px"  required>
				</div>
				<button type="submit" class="button">Pay</button>
			</div>

			<h2 style="color: green;">${success}</h2>
			<a href="home"><center>Back</center></a>
		</form>
	</div>
</body>
</html>