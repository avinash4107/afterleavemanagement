<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Centraprise</title>
<link rel="icon" href="/images/logo.gif">
<meta charset="utf-8" />
<meta http-equiv="Content-type" content="text/html" />
<meta name="viewport"
	content="user-scalable=no, initial-scale=1, minimal-ui, maximum-scale=1, minimum-scale=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link href="/css/bootstrap.min.css" rel="stylesheet">
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet" />
<script src="/javascript/2.1.1.jquery.min.js"></script>

<!-- Custom Theme Style -->
<link href="/css/styles.css" rel="stylesheet">

<script type="text/javascript" language="javascript">
	$('[data-toggle=offcanvas]').click(
			function() {
				$('.row-offcanvas').toggleClass('active');
				$('.collapse').toggleClass('in').toggleClass('hidden-xs')
						.toggleClass('visible-xs');
			});
</script>
</head>
<body lang="en">

	<div class="container">
		<div class="wrapper">
			<div class="row row-offcanvas row-offcanvas-left">

				<!-- sidebar -->
				<div class="sidebar-offcanvas" id="sidebar">
					<a href="">
						<div class="logo">
							<img src="/images/logo.gif" />
						</div>
					</a>
					<ul class="nav" id="myMenu">
						<li id="item2"><a href="/emp"><i class="fa fa-home"></i>
								<span class="collapse in hidden-xs">Home</span></a></li>
						<li id="item3"><a href="/emp"><i class="fa fa-users"></i>
								<span class="collapse in hidden-xs">Employee Details</span></a></li>
						<li id="item4"><a href="/salarystructure"><i
								class="fa fa-calendar"></i> <span class="collapse in hidden-xs">Month
									End Process</span></a></li>
						<li id="item5"><a href="/salarystructure"><i
								class="fa fa-money"></i> <span class="collapse in hidden-xs">IT
									Benefit</span></a></li>
						<li id="item5"><a href="/finalsalaryinfo"><i
								class="fa fa-money"></i> <span class="collapse in hidden-xs">Salary
									Structure</span></a></li>
						<li id="item5"><a href="/leaveInfo"><i
								class="fa fa-minus"></i> <span class="collapse in hidden-xs">Leave
									Management</span></a></li>
						<li id="item1"><a href="/logout"><i
								class="fa fa-sign-out"></i><span class="collapse in hidden-xs">
									Log Out</span></a></li>
					</ul>

				</div>
				<!-- sidebar -->

				<div class="user-list" id="user_list">
					<!-- Header -->
					<div class="top-nav">
						<!-- top tiles -->
						<div class="tile_count">

							<div class="col-md-2 col-sm-4 col-xs-6 title_stats_count">
								<div class="count_bottom">
									<i class="fa fa-user"></i> Total Employees
								</div>
								<a href=""><div class="count green"></div> </a>
							</div>
							<div class="col-md-2 col-sm-4 col-xs-6 title_stats_count">
								<div class="count_center" color="#fff">
									<i class="fa fa-user"></i> Managers
								</div>
								<a href=""><div class="count green"></div></a>
							</div>
							<div
								class="col-md-2 col-sm-4 col-xs-6 title_stats_count noborder">
								<div class="count_bottom">
									<i class="fa fa-users"></i> Total Project Groups
								</div>
								<a href="">
									<div class="count green"></div>
								</a>

							</div>
						</div>
					</div>
					<!-- Header -->

					<div class="user-table">

						<div class="text-left">Employee Details</div>
						<div class="text-right">
							<form action="" method="post">
								<input class="btn-src" type="text" name="valueToSearch"
									placeholder="Search" /> <input class="btn btn-info"
									type="submit" name="search" value="search"><br> <br>
							</form>
						</div>

						<form class="form-horizontal" action="" method="post"
							name="upload-excel" enctype="multipart/form-data">
							<br>
							<div class="add-user-btn">
								<a type="button" class="btn btn-info" href="/addemployee">Add
									Employee</a>
							</div>

						</form>

						<div class="form-field">
							<table class='table table-hover table-bordered size'>
								<thead>
									<tr>
										<th><center>
												<strong>ID</strong>
											</center></th>
										<th><center>
												<strong>Emploee Name</strong>
											</center></th>
										<th><center>
												<strong>Employee Number</strong>
											</center></th>
										<th><center>
												<strong>PAN</strong>
											</center></th>
										<th><center>
												<strong>Date of Joining</strong>
											</center></th>
										<th><center>
												<strong>More Info</strong>
											</center></th>
										<th><center>
												<strong>Delete</strong>
											</center></th>

									</tr>
								</thead>
								<tbody>
									<c:forEach items="${employees}" var="employee">
										<tr>
											<td>${employee.id}</td>
											<td>${employee.name}</td>
											<td>${employee.employeeId}</td>
											<td>${employee.panNumber}</td>
											<td>${employee.joiningDate}</td>
											<td><a
												href="/employeeInfo/${employee.primaryEmployeeId}">More
													Info</a></td>
											<td><a href="/delete/${employee.primaryEmployeeId}">Delete</a></td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
						</div>
						<div class="footer">
							<p>
								Copyright &copy;
								<script>
									document.write(new Date().getFullYear())
								</script>
								Centraprise. All Rights Reserved.
							</p>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
