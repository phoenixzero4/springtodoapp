

	<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
 
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

	<%@ include file="common/header.jspf" %>
		