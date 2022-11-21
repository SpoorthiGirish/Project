<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go-green/ Cancel Reservation</title>
<link href="/styles/login.css" rel="stylesheet" >
</head>
<body>
<body id="LoginForm">
<div class="container">
<div class="login-form">
<div class="main-div">
    <div class="panel">
<body>
     <h1>Cancel Reservation</h1>
   </div>
    <form id="reservation" method="post" >
					<h3>${error}</h3>
        <div class="form-group">
           <input type="text" class="form-control" name="email" placeholder="enter  email:"  required/>
        </div>
        
	  <div class="form-group">
            <input type="text" class="form-control" name="hotelname" placeholder="enter hotelname:" required/>
        </div>
		 <button type="submit" class="button">Cancel Reservation</button></div>
				
				<h2 style="color: green;">${success}</h2>
				<h2 style="color: red;">${fail}</h2>
				<a href="home"><center>Back</center></a>
			</form>			
		</div>
</body>
</html>