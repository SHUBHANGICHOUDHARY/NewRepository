<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
    <h1>Flipkart Electronic Store</h1>      
    <p>The Online Megastore Of Electronics</p>
  </div>
</div>
<div class="header-bot">
		<div class="container">
			<div class="row header-bot_inner_wthreeinfo_header_mid">
				<!-- logo -->
				<div class="col-md-3 logo_agile">
					<h1 class="text-center">
						<a href="index" class="font-weight-bold font-italic">
							Electro Store
						</a>
					</h1>
				</div>
			</div>
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
        <li class="active"><a href="#" ><img src="logo.png"  height="25" width=" 35">Electronics</a></li>
        <div class="dropdown">   
		<button class="dropbtn">Catgories</button>
		<div class="dropdown-content">
					<a href="mobiles">Mobiles</a>
					<a href="laptops">Laptops</a>
					<a href="mobileAccessories">Mobile Accessories</a>
		</div>
		</div>
        </ul>
        
        
      <ul class="nav navbar-nav navbar-right">
      
      <% 
      if(session.getAttribute("username")==null)
      {
      %>
      	 
    	 <li><a href="/FlipkartSpringAssignment/login"><span class="glyphicon glyphicon-user"></span> Login</a></li>
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
  
    <div class="col-sm-3"><div class="panel panel-primary"><div class="panel-heading">Mobile</div>
    <div class="panel-body"><a href="asus"><img src="asus-zenfone-max-pro-m2.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"/></a></div>  
    <div><p>asus-zenfone-max-pro-m2</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    <div class="col-sm-3"><div class="panel panel-success"><div class="panel-heading">Power Bank</div>
    <div class="panel-body"><a href="powerbank1" ><img src="power-bank-2i-plm09zm-mi-original-imafayukjxhzgjyb.jpg" class="img-responsive" style="width:300px;height:325px;" alt="Image"></a></div>  
    <div><p>power-bank-2i-plm09zm-mi-original</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    <div class="col-sm-3"><div class="panel panel-danger"><div class="panel-heading">Memory Card</div>
    <div class="panel-body"><a href="samsung" ><img src="samsung-mb-mc32ga-in-original-imaet6za3yhhdq4z.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>samsung-mb-mc32ga-in-original</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    <div class="col-sm-3"><div class="panel panel-primary"><div class="panel-heading">Head Phones</div>
    <div class="panel-body"><a href="solo" ><img src="solo-stereo-s460-wireless-bluetooth-life-like-original-imaehbcg7yrbhqdq.jpg" class="img-responsive" style="width:300px;height:325px;" alt="Image"></a></div>  
    <div><p>solo-stereo-s460-wireless-bluetooth-life-like-original</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
   </div>
 </div>
 <br>
 
  <div class="container">    
  <div class="row">
  	
  	<div class="col-sm-3"><div class="panel panel-primary"><div class="panel-heading">Head Phones</div>
    <div class="panel-body"><a href="bluetooth" ><img src="bluetooth-buy-surety-original-imaf96sy2x28wy24.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>bluetooth-buy-surety-original</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    <div class="col-sm-3"><div class="panel panel-success"><div class="panel-heading">Laptop</div>
    <div class="panel-body"><a href="acer" ><img src="acer-na-laptop-original-imaf9hu6p7z8ushp.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>acer-na-laptop-original</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
   
   	<div class="col-sm-3"><div class="panel panel-danger"><div class="panel-heading">Laptop</div>
    <div class="panel-body"><a href="dell" ><img src="dell-na-notebook-original-imaex8jwxedjtyxp.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>dell-na-notebook-original</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    <div class="col-sm-3"><div class="panel panel-primary"><div class="panel-heading">Mobile</div>
    <div class="panel-body"><a href="oppo" ><img src="oppo-k1.jpg" class="img-responsive" style="width:300px;height:350px;" alt="Image"></a></div>  
    <div><p>oppo-k1</p></div>
    <div><a href="login"><button type="submit" >Buy</button></a></div>
    </div>
    </div>
    
    
   </div>
 </div>