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
    
     .dropbtn {
    background-color: black;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    }
 
.dropdown {
    position: relative;
    display: inline-block;
}
 
.dropdown-content {
    display: none;
    position: absolute;
    background-color: lightgrey;
    min-width: 200px;
    z-index: 1;
}
 
.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}
 
.dropdown-content a:hover {background-color: white;}
.dropdown:hover .dropdown-content {display: block;}
.dropdown:hover .dropbtn {background-color: grey;}
  </style>
</head>


<body background="background2.jpg" height="900" width=" 1000" >
<div class="jumbotron">
  <div class="container text-center">
    <h1>Laptops</h1>      
    
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index.jsp" ><img src="logo.png"  height="25" width=" 35">Electronics</a></li>
        <div class="dropdown">   
		<button class="dropbtn">Catgories</button>
		<div class="dropdown-content">
					<a href="mobiles.jsp">Mobiles</a>
					<a href="laptops.jsp">Laptops</a>
					<a href="mobileAccessories.jsp">Mobile Accessories</a>
		</div>
		</div>
        </ul>
        
        
      <ul class="nav navbar-nav navbar-right">
      
      <% 
      if(session.getAttribute("username")==null)
      {
      %>
      	 
    	 <li><a href="login.jsp"><span class="glyphicon glyphicon-user"></span> Login</a></li>
      <%
      }
      else
      {
      %>
      	 <li><a href="LogoutServlet"><span class="glyphicon glyphicon-user"></span> Logout</a></li>
      </ul>
      <%
      }	
      %>
      </div>
      </div>
      </nav>
<div class="container">    
<div class="row">
  	<div class="col-sm-3"><div class="panel panel-success"><div class="panel-heading">Laptop</div>
    <div class="panel-body"><a href="acer.html" ><img src="acer-na-laptop-original-imaf9hu6p7z8ushp.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>acer-na-laptop-original</p></div>
    <div><a href="login.jsp"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    <div class="col-sm-3"><div class="panel panel-danger"><div class="panel-heading">Laptop</div>
    <div class="panel-body"><a href="dell.html" ><img src="dell-na-notebook-original-imaex8jwxedjtyxp.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>dell-na-notebook-original</p></div>
    <div><a href="login.jsp"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    
</div>
</div>
</body>
</html>>