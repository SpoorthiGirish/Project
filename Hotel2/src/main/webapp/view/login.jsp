<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>HMS/Login</title>
</head>
<body id="LoginForm">

   <h2>Login</h2>
   <p>Please enter your email and password</p>
   </div>
    <form id="Login" method="post" >
		<h3>${error}</h3>
        <div>
            <input type="email" name="email" placeholder="Email Address" required>
        </div>

        <div>
            <input type="password" name="password" placeholder="Password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
            title="Must contain at least one number and one uppercase and lowercase letter, and at least 8 or more characters" required>
        </div>
        
        <button type="submit">Login</button>
		<div >
        <a href="register">Not Registered? Register Now</a>
		</div>
		<div>
        <a href="adminlogin">Admin Login</a>
		</div>
    </form>
    </div>

</div></div></div>


</body>
</html>