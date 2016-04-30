<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="Auth" class="helper.Authenticator"></jsp:useBean>
    <%
    	String user = request.getParameter("username");
    	String pass = request.getParameter("password");
    	Auth.setUser(user);   
    	Auth.setPass(pass);
    	if(!Auth.getAuth()){
    		out.println("Invalid Credentials");
    	}
    	else{
    	
    %>
<!DOCTYPE html>
<html lang="en">

<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" media="screen" href="css/bootstrap.min.css">

	<title>Income Tax Calculator</title>

	<!--  -->

	<style>

	</style>

</head>

<body>

	<div class="container">
        <div class="jumbotron">
	<div class="container">
		<form class="form-horizontal">
            <fieldset>

            <!-- Form Name -->
            <legend>Fill In Details</legend>

            <!-- Text input-->
            <div class="form-group">
              <label class="col-md-4 control-label" for="name">Name</label>  
              <div class="col-md-4">
              <input id="name" name="name" type="text" placeholder="Will Smith" class="form-control input-md" required="">

              </div>
            </div>

            <!-- Multiple Radios (inline) -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="gender">Gender</label>
              <div class="col-md-4"> 
                <label class="radio-inline" for="gender-0">
                  <input type="radio" name="gender" id="gender-0" value="male" checked="checked">
                  Male
                </label> 
                <label class="radio-inline" for="gender-1">
                  <input type="radio" name="gender" id="gender-1" value="female">
                  Female
                </label>
              </div>
            </div>

            <!-- Select Basic -->
            <div class="form-group">
              <label class="col-md-4 control-label" for="org">Organization</label>
              <div class="col-md-4">
                <select id="org" name="org" class="form-control">
                  <option value="google">Google</option>
                  <option value="apple">Apple</option>
                  <option value="ms">Microsoft</option>
                  <option value="tcs">TCS</option>
                  <option value="wipro">Wipro</option>
                  <option value="cog">Cognizant</option>
                  <option value="dell">Dell</option>
                  <option value="hp">HP</option>
                  <option value="infy">Infosys</option>
                </select>
              </div>
            </div>

            </fieldset>
        </form>

	</div>
</div>

	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

	<script>
	</script>

</body>

</html>
<% 
}
%>