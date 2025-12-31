<!doctype html>
<head>

		<link href="webjars/bootstrap/5.3.8/css/bootstrap.min.css" rel="stylesheet" >
<title>Login JSP</title>
</head>
<body>
<div class="container">
<nav class="navbar sticky-top navbar-expand-lg navbar-dark bg-dark">

  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link" href="/">Home</a>
      <a class="nav-item nav-link" href="sayHello">SayHello</a>

    </div>
    

  </div>
</nav>
 
    		<h1>Login</h1>		
		<pre style="color:red"><b>${ errorMessage }</b></pre>
		<form method="post">
			Name: <input type="text" name="name"><br/>
			</br>
			Password: <input type="password" name="password"><br/>
			</br>
			<input type="submit" class="btn btn-success">
				<a href="create" class="btn btn-success">Create New Account</a>
			</form>


</div> <!--  End Container -->

		<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>



		</html>
		