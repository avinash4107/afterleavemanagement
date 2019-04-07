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

	<!--For for adding deduction  -->
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
								<div class="count_center">
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
						<div class="text-left-grp">Deductions</div>
						<div class="form-fields">
							<form:form name="validation" role="form"
								modelAttribute="deductionInfoForm" action="/saveDeductionInfo"
								method="post" onsubmit="return validate();">
								<div class="form-group">
									<label for="employee number" class="lable-name">Employee
										Number *</label>
									<form:select class="input-name" name="employeeNumber"
										id="employeeNumber" path="employeeNumber" size="1">
										<form:option value="" />
										<form:options items="${employeeNum}" />
									</form:select>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Payment
											of Life Insurance Premium (For self, spouse & children) * </label> <input
											type="text" class="input-name" id="lifeInsurance"
											name="lifeInsurance" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C -
											Contribution to Unit Linked Insurance Scheme - ULIP (For
											self, spouse & children) * </label> <input type="text"
											class="input-name" id="Insurance" name="Insurance"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80CCC -
											Contribution to Pension Plans (Self) * </label> <input type="text"
											class="input-name" id="pension" name="pension" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Deposit
											in Public Provident Fund-PPF (For self, spouse & children) *
										</label> <input type="text" class="input-name" id="ppf" name="ppf"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Purchase
											of National Saving Certificates - NSC (Self) * </label> <input
											type="text" class="input-name" id="nsc" name="nsc"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C -
											Contribution to Equity Linked Savings Scheme - ELSS - TAX
											SAVER-MF (Self) * </label> <input type="text" class="input-name"
											id="elss" name="elss" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Payment
											of tuition fees for children to any School, College,
											University or Educational Institution * </label> <input type="text"
											class="input-name" id="tutionfee" name="tutionfee"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Fixed
											Deposit for 5 years with a Scheduled Bank (Tax Saver) * </label> <input
											type="text" class="input-name" id="taxsaver" name="taxsaver"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Housing
											Loan - Repayment of Principal * </label> <input type="text"
											class="input-name" id="housingloan" name="housingloan"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80C - Sukanaya
											Samriddhi Scheme * </label> <input type="text" class="input-name"
											id="sss" name="sss" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80CCD -
											Contribution to National Pension Scheme U/s 80CCD * </label> <input
											type="text" class="input-name" id="80ccd" name="80ccd"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80D -
											Mediclaim Policy Premium (For Self, spouse, children) * </label> <input
											type="text" class="input-name" id="mediclaim"
											name="mediclaim" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80DP -
											Mediclaim Policy Premium (For Dependent parents) * </label> <input
											type="text" class="input-name" id="parents" name="parents"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80DS -
											Mediclaim Policy Premium (For Senior Citizens) * </label> <input
											type="text" class="input-name" id="srcitizens"
											name="srcitizens" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80CCG -
											Investment made under notified equity savings scheme * </label> <input
											type="text" class="input-name" id="investment"
											name="investment" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80DDB -
											Treatment of specified diseases for self/dependent * </label> <input
											type="text" class="input-name" id="treatment"
											name="treatment" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80DD - Medical
											treatment of handicapped dependent * </label> <input type="text"
											class="input-name" id="handicapped" name="handicapped"
											required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80U -
											Deduction in case of self being totally blind or physically
											handicapped * </label> <input type="text" class="input-name"
											id="physicallyhandi" name="physicallyhandi" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80E - Payment
											of interest on loan taken for higher education for a full
											time course * </label> <input type="text" class="input-name"
											id="higheredu" name="higheredu" required="" />

									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="emailid" class="lable-name">80EE -
											Additional deduction in respect of interest of housing loan *
										</label> <input type="text" class="input-name" id="loan" name="loan"
											required="" />

									</div>
								</div>

								<div class="ln_solid"></div>
								<div class="buttons">
									<input class="btn btn-info" id="submit" name="submit"
										type="submit" value="Deduct" onclick="return submit();">
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
					</div>
				</div>
			</div>
		</div>
</body>
</html>