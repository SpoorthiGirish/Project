<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Group-Green/Add Hotel</title>
<link href="/styles/addhotel.css" rel="stylesheet" >
<style>
/* header { text-align:center; padding:10px}
footer{ text-align:center; padding:10px}
.pane{ color:white;background-color:pink;width:-5%;padding-left:1;vertical-align:top}
.button{ color:white;background-color:black;padding: 5px 40px 5px;border-radius:4px}
table { position:absolute;top:0; bottom:0;left:0;right:0;height:100%; width:100%; border-collapse:collapse}
a:link{color:white} */
</style>
</head>
<body>
<table>
 <h1>Welcome to Admin Portal</h1>
 <!-- <tr><td rowspan="3" class="pane"><br> -->

<div class="btn from-middle" onclick="location.href='/addHotel'">
				Add new Hotel
		</div>
		<div class="btn from-middle" onclick="location.href='/editHotel'">
				Edit Hotel
		</div>
		<div class="btn from-middle" onclick="location.href='/adminlogin'">
				Logout
		</div>
		</table>
</body>
</html>