<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Centraprise</title>
<link rel="icon" href="/images/logo.gif">
<link href="/css/bootstrap.min.css" rel="stylesheet" />
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" />
<link href="/css/styles.css" rel="stylesheet">

<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet" />
<script src="/javascript/2.1.1.jquery.min.js"></script>

<!-- Custom Theme Style -->
<link href="/css/styles.css" rel="stylesheet">


</head>
<body lang="en">
	<!-- script to check empty fields and valid input on form submission  -->

	<script language="javascript" type="text/javascript">
		function submit() {
			document.getElementById('submit').submit();
		}
		function validate() {
			if (!/^[a-z]*$/g.test(document.validation.username.value)) {
				alert("Name must be characters with lower case!");
				document.validation.name.focus();
				return false;
			}
			if (/^[a-z]*$/g.test(document.validation.username.value)) {
				var num = document.getElementById("username").value;
				if (num.length <= 4) {
					alert("length must be minimum 5 characters");
					document.validation.username1.focus();
					return false;
				}
			}

			if ((isNaN(document.validation.phone.value))) {
				alert("Phone Number has numeric only!");
				return false;
			}
			if (!(isNaN(document.validation.phone.value))) {
				var num = document.getElementById("phone").value;
				var num1 = phone.value.replace(/[^0-9]/, '');
				var len = num.length;
				var len1 = num1.length;
				if (len != 10 || len1 != 10) {
					alert("Phone Number Must be Numeric with 10 Digits!");
					return false;
				}

			}
			var emailPat = /^([\w-]+(?:\.[\w-]+)*)@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$/i
			var emailid = document.getElementById("email").value;
			var matchArray = emailid.match(emailPat);
			if (matchArray == null) {
				alert("Your email address is wrong. Please try again.");
				document.getElementById("email").focus();
				return false;
			}
			if (document.getElementById("password").value != "") {
				var pw = document.getElementById("password").value;
				var paswd = /^(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$_%^&*])[a-zA-Z0-9!@#$_%^&*]{8,15}$/;
				if (!pw.match(paswd)) {
					alert("The password must be 8 to 15 char with atleast 1 numeric and special charecter..!!");
					document.getElementById("password").focus();
					return false;
				}
			}

			return true;
		}
	</script>

	<!--For for adding user -->
	<div class="container">
		<div class="wrapper">
			<div class="row row-offcanvas row-offcanvas-left">

				<div class="add-group" id="user_list">

					<div class="user-table">
						<div class="text-left-grp">Sign Up</div>
						<br> <br> <br>

						<div class="form-fields">
							<form:form action="/signup" modelAttribute="userForm"
								name="validation" role="form" method="post"
								onsubmit="return validate();">
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">Email * </label>
										<form:input type="text" path="email" class="input-name"
											id="email" name="email" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="username" class="lable-name">Name * </label>
										<form:input onblur="checkLength(this)" path="username"
											type="text" class="input-name" id="username" name="username"
											required="" />
									</div>
								</div>

								<div class="form-group">
									<div>
										<label for="password" class="lable-name">Password * </label>
										<form:input type="password" path="password" class="input-name"
											id="password" name="password" required="" />
									</div>
								</div>

								<div class="form-group">
									<div>
										<label for="username" class="lable-name">Phoner Number
											* </label>
										<form:input type="text" path="phone" class="input-name"
											id="phone" name="phone" required="" />
									</div>
								</div>
								<div class="ln_solid"></div>
								<div class="buttons">
									<input class="btn btn-info" id="submit" name="submit"
										type="submit" value="Sign Up" onclick="return submit();">
								</div>
							</form:form>
							<div class="footer">
								<p>
									Copyright &copy;
									<script>
										document
												.write(new Date().getFullYear())
									</script>
									All Rights Reserved.
								</p>
							</div>
						</div>
						s
					</div>
				</div>
			</div>
		</div>
</body>
</html>