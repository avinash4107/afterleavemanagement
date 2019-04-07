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
<link href="/styles.css" rel="stylesheet">

<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css"
	rel="stylesheet" />
<script src="/javascript/2.1.1.jquery.min.js"></script>

<!-- Custom Theme Style -->
<link href="/css/styles.css" rel="stylesheet">

<script>
	var stateObject = {
		"India" : {
			"Andhrapradesh" : [ "Anantapur", "Chittur", "East Godavari",
					"Guntur", "Krishna", "Kurnool", "Prakasam", "Srikakulam",
					"Nellore", "Visakapatnam", "Vijayanagaram",
					"West Godavari", "Cudappah" ],
			"Arunachal Pradesh" : [ "Anjaw", "Changlang", "Dibang Valley",
					"East Kameng", "East Siang", "Kamle", "Kra Daadi",
					"Kurung Kumey", "Lepa Rada", "Lohit", "Longding",
					"Lower Dibang Valley", "Lower Siang", "Lower Subansiri",
					"Namsai", "Pakke Kessang", "Papum Pare", "Shi Yomi",
					"Siang", "Tawang", "Tirap", "Upper Siang",
					"Upper Subansiri", "West Kameng", "West Siang" ],
			"Assam" : [ "Baksa", "Barpeta", "Biswanath", "Bongaigaon",
					"Cachar", "Charaideo", "Chirang", "Darrang", "Dhemaji",
					"Dhubri", "Dibrugarh", "Dima Hasao (North Cachar Hills)",
					"Goalpara", "Golaghat", "Hailakandi", "Hojai", "Jorhat",
					"Kamrup", "Kamrup Metropolitan", "Karbi Anglong",
					"Karimganj", "Kokrajhar", "Lakhimpur", "Majuli",
					"Morigaon", "Nagaon", "Nalbari", "Sivasagar", "Sonitpur",
					"South Salamara-Mankachar", "Tinsukia", "Udalguri",
					"West Karbi Anglong" ],
			"Bihar" : [ "Araria", "Arwal", "Aurangabad", "Banka", "Begusarai",
					"Bhabhua", "Bhagalpur", "Bhojpur", "Buxar", "Darbhanga",
					"East Champaran", "Gaya", "Gopalganj", "Jamui",
					"Jehanabad", "Katihar", "Khagaria", "Kishanganj",
					"Lakhisarai", "Madhepura", "Madhubani", "Monghyr",
					"Muzaffarpur", "Nalanda", "Nawada", "Patna", "Purnea",
					"Rohtas", "Saharsa", "Samastipur", "Saran", "Sheikhpura",
					"Sheohar", "Sitamarhi", "Siwan", "Supaul", "Vaishali",
					"West Champaran" ],
			"chhattisgarh" : [ "Bastar", "Bemetara", 'Bijapur', "Bilaspur",
					"Dantewada (South Bastar)", "Dhamtari", "Durg",
					"Gariyaband", "Janjgir-Champa", "Jashpur",
					"Kabirdham (Kawardha)", "Kanker (North Bastar)",
					"Kondagaon", "Korba", "Korea (Koriya)", "Mahasamund",
					"Mungeli", "Narayanpur", "Raigarh", "Raipur",
					"Rajnandgaon", "Sukma", "Surajpur", "Surguja" ],
			"Dadra and Nagar Haweli" : [ "Amal", "Silvassa" ],
			"Daman and Diu" : [ "Daman", "Diu" ],
			"Delhi" : [ "new Delhi", "North Delhi", "Noida", "Patparganj",
					"Sonabarsa", "Tughlakabad" ],
			"Goa" : [ "North Goa", "South Goa" ],
			"Gujarat" : [ "Ahmedabad", "Amreli", "Anand", "Aravalli",
					"Banaskantha", "Bharuch", "Bhavnagar", "Botad",
					"Chhota Udaipur", "Dahod", "Dang", "Devbhoomi Dwarka",
					"Gandhinagar", "Gir Somnath", "	Jamnagar", "Junagadh",
					"Kutch", "Kheda", "Mahisagar", "Mehsana", "Morbi",
					"Narmada", "Navsari", "Panchmahal", "Patan", "Porbandar",
					"Rajkot", "Sabarkantha", "Surat", "Surendranagar", "Tapi",
					"Vadodara", "Valsad" ],
			"Haryana" : [ "Ambala", "Bhiwani", "Charkhi Dadri", "Faridabad",
					"Fatehabad", "Gurugram", "Hisar", "Jhajjar", "Jind",
					"Kaithal", "Karnal", "Kurukshetra", "Mahendragarh", "Nuh",
					"Palwal", "Panchkula", "Panipat", "Rewari", "Rohtak",
					"Sirsa", "Sonipat", "Yamunanagar" ],
			"Himachal Pradesh" : [ "Bilaspur", "Chamba", "Hamirpur", "Kangra",
					"Kinnaur", "Kullu", "Lahaul and Spiti", "Mandi", "Shimla",
					"Sirmaur", "Solan", "Una" ],
			"Jammu and Kashmir" : [ "Jammu", "Leh", "Rajouri", "Srinagar" ],
			"Jharkhand" : [ "Garhwa", "Palamu", "Latehar.", "Chatra",
					"Hazaribagh", "Koderma", "Giridih", "Ramgarh", "Bokaro",
					"Dhanbad district", "Lohardaga", "Gumla", "Simdega",
					"Ranchi", "Khunti", "West Singhbhum",
					"Saraikela Kharsawan", "East Singhbhum", "Jamtara",
					"Deoghar", "Dumka", "Pakur", "Godda", "Sahebganj" ],
			"Karnataka" : [ "Bagalkot", "Ballari (Bellary)",
					"Belagavi (Belgaum)", "Bengaluru ",
					"Bengaluru (Bangalore) Urban", "Bidar", "Chamarajanagar",
					"Chikballapur", "Chikkamagaluru (Chikmagalur)",
					"Chitradurga", "Dakshina Kannada", "Davangere", "Dharwad",
					"Gadag", "Hassan", "Haveri", "Kalaburagi (Gulbarga)",
					"Kodagu", "Kolar", "Koppal", "Mandya", "Mysuru (Mysore)",
					"Raichur", "Ramanagara", "Shivamogga (Shimoga)",
					"Tumakuru (Tumkur)", "Udupi", "Uttara Kannada (Karwar)",
					"Vijayapura (Bijapur)", "Yadgir" ],

			"Kerala" : [ "Alappuza", "Ernakulam", "Idukki", "Kannur",
					"Kasaragod", "Kollam", "Kottayam", "Kozikkode",
					"Malappuram", "Palakkad", "Patanamthitta", "Trissur",
					"Thiruvananthapuram", "Wayanad" ],
			"Madhya Pradesh" : [ "Agar Malwa", "Alirajpur", "Anuppur",
					"Ashoknagar", "Balaghat", "Barwani", "Betul", "Bhind",
					"Bhopal", "Burhanpur", "Chhatarpur", "Chhindwara", "Damoh",
					"Datia", "Dewas", "Dhar", "Dindori", "Guna", "Gwalior",
					"Harda", "Hoshangabad", "Indore", "Jabalpur", "Jhabua",
					"Katni", "Khandwa", "Khargone", "Mandla", "Mandsaur",
					"Morena", "Narsinghpur", "Neemuch", "Panna", "Raisen",
					"Rajgarh", "Ratlam", "Rewa", "Sagar", "Satna", "Sehore",
					"Seoni", "Shahdol", "Shajapur", "Sheopur", "Shivpuri",
					"Sidhi", "Singrauli", "Tikamgarh", "Ujjain", "Umaria",
					"Vidisha" ],
			"Sikkim" : [ "Chamurci", "Gangtok" ],
			"Tamilnadu" : [ "Ariyalur", "Chennai", "Coimbatore", "Cuddalore",
					"Dharmapuri", "Dindigul", "Erode", "Kancheepuram", "Karur",
					"Krishnagiri", "Madurai", "Nagapattinam", "Kanyakumari",
					"Namakkal", "Perambalur", "Pudukottai", "Ramanathapuram",
					"Salem", "Sivagangai", "Thanjavur", "Theni", "Thiruvallur",
					"Thiruvarur", "Tuticorin", "Trichirappalli",
					"Thirunelveli", "Tiruppur", "Thiruvannamalai",
					"The Nilgiris", "Vellore", "Viluppuram", "Virudhunagar" ],
			"Telangana" : [ "Hyderabad", "Karimnagar", "Medak", "Nalgonda",
					"Nizamabad", "Rangareddy", "Warangal" ],
			"Tripura" : [ "Dhalai", "Gomati", "Khowai", "North Tripura",
					"Sepahijala", "South Tripura", "Unakoti", "West Tripura" ],
			"Uttar Pradesh" : [ "Agra", "Aligarh", "Allahabad",
					"Ambedkar Nagar", "Amethi", "Amroha", "Auraiya",
					"Azamgarh", "Baghpat", "Bahraich", "Ballia", "Balrampur",
					"Banda", "Barabanki", "Bareilly", "Basti", "Bijnor",
					"Budaun", "Bulandshahr", "Chandauli", "	Chitrakoot",
					"Deoria", "Etah", "Etawah", "Faizabad", "Farrukhabad",
					"Fatehpur", "Firozabad", "Gautam Buddha Nagar",
					"Ghaziabad", "Ghazipur", "Gonda", "Gorakhpur", "Hamirpur",
					"Hardoi", "Hathras", "Jalaun", "Jaunpur", "Jhansi",
					"Jyotiba Phule Nagar", "Kannauj", "Kanpur Dehat",
					"Kanpur Nagar", "Kanshiram Nagar", "Kaushambi", "Kheri",
					"	Kushinagar", "Lalitpur", "Lucknow", "Maharajganj",
					"Mahoba", "Mainpuri", "Mathura", "Mau", "Meerut", "Meerut",
					"Moradabad", "Muzaffarnagar", "Pilibhit", "Pratapgarh",
					"RaeBareli", "Rampur", "Saharanpur",
					"Sambhal (Bhim Nagar)", "Sant Kabir Nagar", "Shahjahanpur",
					"Shamali (Prabuddh Nagar)", "Shravasti", "Siddharth Nagar",
					"Sitapur", "Sonbhadra", "Sultanpur", "Unnao", "Varanasi" ],
			"Uttarakhand" : [ "Almora", "Bageshwar", "Chamoli", "Champawat",
					"Dehradun", "Haridwar", "Nainital", "Pauri Garhwal",
					"Pithoragarh", "Rudraprayag", "Tehri Garhwal",
					"Udham Singh Nagar", "Uttarkashi" ],

		},
		"Australia" : {
			"South Australia" : [ "Dunstan", "Mitchell" ],
			"Victoria" : [ "Altona", "Euroa" ]
		},
		"Canada" : {
			"Alberta" : [ "Acadia", "Bighorn" ],
			"Columbia" : [ "Washington", "" ]
		},
		"United States (US)" : {
			"Texas" : [ "Northern", "Southern", "Eastern", "Western" ],
			"Virginia" : [ "Eastern", "Western" ]
		},
	}
	window.onload = function() {
		var countySel = document.getElementById("countySel"), stateSel = document
				.getElementById("stateSel"), districtSel = document
				.getElementById("districtSel");
		for ( var country in stateObject) {
			countySel.options[countySel.options.length] = new Option(country,
					country);
		}
		countySel.onchange = function() {
			stateSel.length = 1; // remove all options bar first
			districtSel.length = 1; // remove all options bar first
			if (this.selectedIndex < 1)
				return; // done 
			for ( var state in stateObject[this.value]) {
				stateSel.options[stateSel.options.length] = new Option(state,
						state);
			}
		}
		countySel.onchange(); // reset in case page is reloaded
		stateSel.onchange = function() {
			districtSel.length = 1; // remove all options bar first
			if (this.selectedIndex < 1)
				return; // done 
			var district = stateObject[countySel.value][this.value];
			for (var i = 0; i < district.length; i++) {
				districtSel.options[districtSel.options.length] = new Option(
						district[i], district[i]);
			}
		}
	}
</script>
</head>

<body lang="en">
	<!-- script to check empty fields and valid input on form submission  -->

	<!--For for adding user -->
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
						<div class="text-left-grp">Update Details</div>

						<div class="form-fields">
							<form:form action="/updateEmployee" name="validation" role="form"
								method="post" onsubmit="return validate();">
								<div class="sidehead">Personal Information</div>

								<div class="form-group">
									<div>
										<input hidden class="input-name" id="empId" name="empId"
											value="${command.empId}" required="" />
									</div>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Employee Number * </label> <input
											class="input-name" id="employeenumber" name="employeenumber"
											value="${command.employeenumber}" required="" />
									</div>
									<form:errors path="employeenumber" cssClass="errormsg" />
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Employee Name * </label> <input
											class="input-name" id="name" name="name"
											value="${command.name}" required="" />
									</div>
									<form:errors path="name" cssClass="errormsg" />
								</div>

								<%-- <div class="form-group">
									<div>
										<label class="lable-name">Gender * </label>
										<form:radiobutton input class="input-name" path="gender"
											name="gender" value="" required="" />
									</div>
								</div>
 --%>

								<div class="form-group">
									<div>
										<c:set var="gender" value="${command.gender}" />
										<label class="lable-name">Gender * </label> Men: <input
											type="radio" id="gender" name="gender" value="M"
											<c:if test="${gender=='M'}">Checked</c:if> /> Women: <input
											type="radio" id="gender" name="gender" value="F"
											<c:if test="${gender=='F'}">Checked</c:if> /> Transgender: <input
											type="radio" id="gender" name="gender" value="T"
											<c:if test="${gender=='T'}">Checked</c:if> />
									</div>
									<form:errors path="gender" cssClass="errormsg" />
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Date of Birth * </label> <input
											class="input-name" id="bday" name="bday"
											value="${command.bday}" required="" />
									</div>
									<form:errors path="bday" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">PAN Number * </label> <input
											class="input-name" id="pan" name="pan" value="${command.pan}"
											required="" />
									</div>
									<form:errors path="pan" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<c:set var="status" value="${command.maritalstatus}" />
										<label class="lable-name">Marital Status * </label> Married: <input
											type="radio" id="maritalstatus" name="maritalstatus"
											value="M" <c:if test="${status=='M'}">Checked</c:if> />
										Single: <input type="radio" id="maritalstatus"
											name="maritalstatus" value="S"
											<c:if test="${status=='S'}">Checked</c:if> />
									</div>
									<form:errors path="maritalstatus" cssClass="errormsg" />
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Email Address * </label> <input
											class="input-name" id="email" name="email"
											value="${command.email}" required="" />
									</div>
									<form:errors path="email" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Phone Number * </label> <input
											class="input-name" id="phone" name="phone"
											value="${command.phone}" required="" />
									</div>
									<form:errors path="phone" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Password * </label> <input
											class="input-name" id="password" name="password"
											value="${command.password}" required="" />
									</div>
									<form:errors path="password" cssClass="errormsg" />
								</div>

								<div class="sidehead">Addresss</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Flat/Door/Block Num * </label> <input
											class="input-name" id="doornum" name="doornum"
											value="${command.doornum}" required="" />
									</div>
									<form:errors path="phone" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Village * </label> <input
											class="input-name" id="vlg" name="vlg" value="${command.vlg}"
											required="" />
										<form:errors path="vlg" cssClass="errormsg" />
									</div>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Mandal * </label> <input
											class="input-name" id="mandal" name="mandal"
											value="${command.mandal}" required="" />
									</div>
									<form:errors path="mandal" cssClass="errormsg" />
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Country * </label> <input
											class="input-name" id="country" name="country"
											value="${command.country}" size="1" />
										<form:errors path="country" cssClass="errormsg" />
									</div>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">State * </label> <input
											class="input-name" id="state" name="state"
											value="${command.state}" size="1" />
									</div>
									<form:errors path="state" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">District * </label> <input
											class="input-name" id="district" name="district"
											value="${command.district}" size="1" />
									</div>
									<form:errors path="district" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Pincode * </label> <input
											class="input-name" id="pin" name="pin" value="${command.pin}"
											required="" />
									</div>
									<form:errors path="pin" cssClass="errormsg" />
								</div>

								<div class="sidehead">Assignment Information</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Asignment Start Date * </label> <input
											class="input-name" id="startdate" name="startdate"
											value="${command.startdate}" />
									</div>
									<form:errors path="startdate" cssClass="errormsg" />
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Asignment End Date * </label> <input
											class="input-name" name="endDate" id="endDate"
											value="${command.endDate}">
									</div>
									<form:errors path="endDate" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Jon (Designation) * </label> <input
											class="input-name" id="job" name="job" value="${command.job}"
											required="" />
									</div>
									<form:errors path="job" cssClass="errormsg" />
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Date of Joining * </label> <input
											class="input-name" name="joindate" id="joindate"
											value="${command.joindate}">
									</div>
									<form:errors path="joindate" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Years of Serice * </label> <input
											class="input-name" id="service" name="service"
											value="${command.service}" required="" />
									</div>
									<form:errors path="service" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Manager * </label> <input
											class="input-name" id="manager" name="manager"
											value="${command.manager}" required="" />
									</div>
									<form:errors path="manager" cssClass="errormsg" />
								</div>
								<div class="sidehead">Bank Information:</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Bank Name * </label> <input
											class="input-name" id="bankname" name="bankname"
											value="${command.bankname}" required="" />
									</div>
									<form:errors path="bankname" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Account Number * </label> <input
											class="input-name" id="accountnumber" name="accountnumber"
											value="${command.accountnumber}" required="" />
									</div>
									<form:errors path="accountnumber" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">IFSC Code * </label> <input
											class="input-name" id="ifsc" name="ifsc"
											value="${command.ifsc}" required="" />
									</div>
									<form:errors path="ifsc" cssClass="errormsg" />
								</div>
								<div class="sidehead">Provident Fund Information:</div>
								<div class="form-group">
									<div>
										<label class="lable-name">UAN * </label> <input
											class="input-name" id="uan" name="uan" value="${command.uan}"
											required="" />
									</div>
									<form:errors path="uan" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Adhar Number * </label> <input
											class="input-name" id="adhar" name="adhar"
											value="${command.adhar}" required="" />
									</div>
									<form:errors path="adhar" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Previous Employer * </label> <input
											class="input-name" id="previousemp" name="previousemp"
											value="${command.previousemp}" required="" />
									</div>
									<form:errors path="previousemp" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Date of Previous Employee
											Leaving * </label> <input class="input-name"
											id="previousempleavingdate" name="previousempleavingdate"
											value="${command.previousempleavingdate}">
									</div>
									<form:errors path="previousempleavingdate" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Start Date* </label> <input
											class="input-name" name="previousempstartdate"
											id="previousempstartdate"
											value="${command.previousempstartdate}">
									</div>
									<form:errors path="previousempstartdate" cssClass="errormsg" />
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">End Date* </label> <input
											class="input-name" name="previousempenddate"
											id="previousempenddate" value="${command.previousempenddate}">
									</div>
									<form:errors path="previousempenddate" cssClass="errormsg" />
								</div>
								<div class="ln_solid"></div>
								<div class="buttons col-md-6 col-md-offset-3">
									<input class="btn btn-info" id="submit" name="submit"
										type="submit" value="Update"> <input
										class="btn btn-cancel" id="submit" name="submit"
										value="Cancel" onclick="window.location.href='employee.html'">
								</div>
							</form:form>

							<div class="footer">
								<p>
									Copyright &copy;
									<script>
										document
												.write(new Date().getFullYear())
									</script>
									Centraprise, LLC. All Rights Reserved.
								</p>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
</body>
</html>

