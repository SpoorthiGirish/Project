<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Go-Green/Edit Reservation</title>
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
				<div>
					<div><h1>Edit Reservation</h1>
					</div><br>
					        <div class="form-group">
					         
           <input type="email" class="form-control" name="email" placeholder="enter email:"  required/>
        </div>
         <div class="form-group">
				
           <input type="text" class="form-control" name="hotelname" placeholder="enter hotelname:"  required/>
        </div>
         <div class="form-group">
					        
           <input type="text" class="form-control" name="rooms" placeholder="enter rooms:"  required/>
        </div>
                 <div class="form-group">
           <input type="text" class="form-control" name="price" placeholder="enter amount:"  required/>
        </div>
       
						     <button type="submit" class="button">Update Reservation</button>
				</div>	
				
				<h2 style="color: green;">${success}</h2>
				<h2 style="color: red;">${fail}</h2>
						<a href="home"><center>Back</center></a>
			</form>			
		</div>
</body>
</html>