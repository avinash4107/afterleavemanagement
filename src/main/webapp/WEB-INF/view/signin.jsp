<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Centraprise</title>
<link rel="icon" href="<spring:url value="/images/logo.gif"/>">
<link rel="stylesheet" type="text/css" href="/css/styles.css">
<link href="/css/bootstrap.min.css" rel="stylesheet" />
<!-- <link href="bootstrap.min.js" /> -->

<link rel="icon" href="<spring:url value="/images/logo.gif"/>">
<link rel="stylesheet" type="text/css"
	href='<spring:url value="/css/style.css"/>'>
<link href='<spring:url value="/css/bootstrap.min.css"/>'
	rel="stylesheet" />
</head>
<body>
	<div class="centraprise-logo">
		<img src="/images/logo.gif" /><br>
	</div>

	<div class="container">
		<div class="row">
			<div class="Absolute-Center is-Responsive">
				<div class="col-sm-12 col-md-12">
					<h4 class="text-center">Super Admin Login</h4>
					<br /> <br />
					<c:if test="${not empty error}">user name or password are invalid
	                </c:if>
					<form action="/signin" id="loginForm" role="form" method="post">
						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-envelope"></i></span>
							<input class="form-control" type="text" name='username'
								placeholder="Admin Name" required="" />
						</div>

						<div class="form-group input-group">
							<span class="input-group-addon"><i class="fa fa-lock"></i></span>
							<input class="form-control" type="password" name='password'
								placeholder="Password" required="" />
						</div>

						<div class="form-group text-center">
							<input type="submit" class="btn btn-def login-btn" id="login"
								name="login" value="Login">

						</div>

						<div class="clearfix"></div>
						<div class="form-group text-center">
							<!-- <a href="forgotPassword.php">Forgot password?</a>	-->
						</div>
					</form>
					<div class="text-center">
						<p>
							Copyright &copy;
							<script>
								document.write(new Date().getFullYear())
							</script>
							All Rights Reserved.
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>