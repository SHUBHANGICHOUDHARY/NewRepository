

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


<body background="C:\Users\shubhanc\Downloads\ProjectImages\Logo\download.jfif" >
<div class="container">
	<div style="color:red">${secondmessage}</div>
	<h1 >Login</h1> 
	<form id="loginForm" modelAttribute="login" action="loginProcess" method="post">
			<div class="form-group">
				<label >Username  </label>
				<input type="text" name="username" class="form-control" id="username">
			</div>
			<div class="form-group">
				<label>Password  </label>
				<input type="password" name="password" class="form-control" id="password">
			</div>
			<div style="color:red"></div>
		<button type="submit" class="btn btn-default">Submit</button>
		
		<p>Not A User!!!!<a href="register.jsp">Register Now</a></p>
	</form>

	<%  session.setAttribute("firstmessage", null);  %>
	<br>
	<%  session.setAttribute("secondmessage", null);  %>
	</div>
</body>

</html>