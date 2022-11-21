<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go-Green/Search Hotel</title>
<link href="/styles/login.css" rel="stylesheet" >
</head>
<body>
<body id="LoginForm">
<div class="container">
<div class="login-form">
<div class="main-div">
    <div class="panel">
<body>
	<div style="margin-left:3%;" >
			<form  method="post">
				<div class="form-group">
					<div><h2>Search Hotels</h2></div><br>
					<div class="form-group">
						      <label for="Origin">Rating</label>
						      <input type="text" placeholder="Enter Rating:" name="rating" width="200px" >
						     </div>
						     <button type="submit" class="button" >Search</button>
				</div>	
			</form>			
		</div>
		<br>
		<br>
		<div style="margin-left: 3%;">
			
			<h3 style="color: red;"> ${error}</h3>
			<div>
				<div style="width: 400px;">
						<ul>
						<c:forEach var="listValue" items="${hotelnames}">
							<li>${listValue}</li>
						</c:forEach>
						</ul>
				</div>
			</div>
				<div class="col-sm-12 col-md-12">
					<div><h2>Book Hotels</h2>
					</div><br>
							<div class="form-group">
						      <label for="Origin">Hotel Name</label>
						      <input type="text" placeholder="Enter hotelname:" name="hotelname" width="200px" >
						     </div>
						     <button type="submit" class="button" onclick="location.href='/payment'">Book</button>
						    
				</div>	
					</div>
					
					<a href="home"><center>Back</center></a>
					
</body>
</html>