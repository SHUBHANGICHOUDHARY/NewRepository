<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
   <style>
    /* Remove the navbar's default rounded borders and increase the bottom margin */ 
    .navbar {
      margin-bottom: 50px;
      border-radius: 0;
    }
    
    /* Remove the jumbotron's default bottom margin */ 
     .jumbotron {
      margin-bottom: 0;
    }
   
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #f2f2f2;
      padding: 25px;
    }
  </style>

</head>
<h1>Registration Form</h1>


<body background="C:\Users\shubhanc\Downloads\ProjectImages\Logo\download.jfif">
<div class="container">
	<form id="regForm" modelAttribute="user" action="registerProcess" method="post">
	
			<div class="form-group">
				<label >UserId  </label>
				<input type="text" name="userId" class="form-control" id="userid">
			</div>
			<div class="form-group">
				<label >Username  </label>
				<input type="text" name="username" class="form-control" id="username">
			</div>
			<div class="form-group">
				<label>Password  </label>
				<input type="password" name="password" class="form-control" id="password">
			</div>
			<div class="form-group">
				<label >Email-Id  </label>
				<input type="email" name="email" class="form-control" id="emailid">
			</div>
			<div class="form-group">
				<label >Address </label>
				<input type="text" name="address" class="form-control" id="address">
			</div>
			<div class="form-group">
				<label>Contact  </label>
				<input type="text" name="contact" class="form-control" id="contact">
			</div>
    	<div style="color:red">${firstmessage}</div>
   		<button type="submit" class="btn btn-default">Submit</button>
	</form>
	</div>
	<% session.setAttribute("firstmessage", null); %>
</body>

</html>