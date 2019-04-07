<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<head>
<title>Centraprise</title>
<link rel="icon" href="/images/logo.gif">
<link href="/css/bootstrap.min.css" rel="stylesheet" />
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" />
<link href="/styles.css" rel="stylesheet">
<style type="text/css">
.errormsg {
	color: red;
}
</style>
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
		var countySel = document.getElementById("country"), stateSel = document
				.getElementById("state"), districtSel = document
				.getElementById("district");
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
						<div class="text-left-grp">Employee Details</div>

						<div class="form-fields">
							<form:form enctype="multipart/form-data" name="validation"
								role="form" modelAttribute="employeeForm" action="/addemployee"
								method="post" onsubmit="return validate();">
								<div class="sidehead">Personal Information</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Employee Number * </label> <input
											type="text" class="input-name" id="employeenumber"
											name="employeenumber" value="" required="" /> <small><form:errors
												path="employeenumber" cssClass="errormsg" /></small>
									</div>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Employee Name * </label> <input
											type="text" class="input-name" id="name" name="name" value=""
											required="" /> <small><form:errors path="name"
												cssClass="errormsg" /></small>
									</div>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Gender * </label> Men:
										<form:radiobutton path="gender" value="M" />
										Women:
										<form:radiobutton path="gender" value="F" />
										Transgender:
										<form:radiobutton path="gender" value="T" />
									</div>
									<small><form:errors path="gender" cssClass="errormsg" /></small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Date of Birth * </label> <input
											type="date" class="input-name" id="bday" name="bday">
									</div>
									<small><form:errors path="bday" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">PAN Number * </label> <input
											type="text" class="input-name" id="pan" name="pan" value=""
											required="" />
									</div>
									<small> <form:errors path="pan" cssClass="errormsg" />
									</small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Marital Status * </label> Married:
										<form:radiobutton path="maritalstatus" value="M" />
										Single:
										<form:radiobutton path="maritalstatus" value="S" />
									</div>
									<small><form:errors path="maritalstatus"
											cssClass="errormsg" /></small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Email Address * </label> <input
											type="text" class="input-name" id="email" name="email"
											value="" required="" />
									</div>
									<small> <form:errors path="email" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Phone Number * </label> <input
											type="text" class="input-name" id="phone" name="phone"
											value="" required="" />
									</div>
									<small> <form:errors path="phone" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Password * </label> <input
											type="password" class="input-name" id="password"
											name="password" value="" required="" />
									</div>
									<small> <form:errors path="password"
											cssClass="errormsg" /></small>
								</div>

								<div class="sidehead">Addresss</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Flat/Door/Block Num * </label> <input
											type="text" class="input-name" id="doornum" name="doornum"
											value="" required="" />
									</div>
									<small> <form:errors path="doornum" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Village * </label> <input
											type="text" class="input-name" id="vlg" name="vlg" value=""
											required="" />
									</div>
									<small> <form:errors path="vlg" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Mandal * </label> <input type="text"
											class="input-name" id="mandal" name="mandal" value=""
											required="" />
									</div>
									<small> <form:errors path="mandal" cssClass="errormsg" /></small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Country * </label> <select
											class="input-name" name="country" id="country" size="1">
											<option value="" selected="selected">Select Country</option>
										</select>
									</div>
									<small> <form:errors path="country" cssClass="errormsg" /></small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">State * </label> <select
											class="input-name" name="state" id="state" size="1">
											<option value="" selected="selected">Please select
												Country first</option>
										</select>
									</div>
									<small> <form:errors path="state" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">District * </label> <select
											class="input-name" name="district" id="district" size="1">
											<option value="" selected="selected">Please select
												State first</option>
										</select>
									</div>
									<small> <form:errors path="district"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Pincode * </label> <input
											type="text" class="input-name" id="pin" name="pin" value=""
											required="" />
									</div>
									<small><form:errors path="pin" cssClass="errormsg" /></small>
								</div>

								<div class="sidehead">Assignment Information</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Asignment Start Date * </label> <input
											type="date" class="input-name" id="startdate"
											name="startdate">
									</div>
									<small> <form:errors path="startdate"
											cssClass="errormsg" /></small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Asignment End Date * </label> <input
											type="date" class="input-name" name="endDate" id="endDate">
									</div>
									<small> <form:errors path="endDate" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Jon (Designation) * </label> <input
											type="text" class="input-name" id="job" name="job" value=""
											required="" />
									</div>
									<small> <form:errors path="job" cssClass="errormsg" /></small>
								</div>

								<div class="form-group">
									<div>
										<label class="lable-name">Date of Joining * </label> <input
											type="date" class="input-name" name="joindate">
									</div>
									<small> <form:errors path="joindate"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Years of Serice * </label> <input
											type="text" class="input-name" id="service" name="service"
											value="" required="" />
									</div>
									<small> <form:errors path="service" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Manager * </label> <input
											type="text" class="input-name" id="manager" name="manager"
											value="" required="" />
									</div>
									<small> <form:errors path="manager" cssClass="errormsg" /></small>
								</div>
								<div class="sidehead">Bank Information:</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Bank Name * </label> <input
											type="text" class="input-name" id="bankname" name="bankname"
											value="" required="" />
									</div>
									<small> <form:errors path="bankname"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Account Number * </label> <input
											type="text" class="input-name" id="accountnumber"
											name="accountnumber" value="" required="" />
									</div>
									<small> <form:errors path="accountnumber"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">IFSC Code * </label> <input
											type="text" class="input-name" id="ifsc" name="ifsc" value=""
											required="" />
									</div>
									<small> <form:errors path="ifsc" cssClass="errormsg" /></small>
								</div>
								<div class="sidehead">Provident Fund Information:</div>
								<div class="form-group">
									<div>
										<label class="lable-name">UAN * </label> <input type="text"
											class="input-name" id="uan" name="uan" value="" required="" />
									</div>
									<small> <form:errors path="uan" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Adhar Number * </label> <input
											type="text" class="input-name" id="adhar" name="adhar"
											value="" required="" />
									</div>
									<small> <form:errors path="adhar" cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Previous Employer * </label> <input
											type="text" class="input-name" id="previousemp"
											name="previousemp" value="" required="" />
									</div>
									<small> <form:errors path="previousemp"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Date of Previous Employee
											Leaving * </label> <input type="date" class="input-name"
											name="previousempleavingdate">
									</div>
									<small> <form:errors path="previousempleavingdate"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">Start Date* </label> <input
											type="date" class="input-name" name="previousempstartdate">
									</div>
									<small> <form:errors path="previousempstartdate"
											cssClass="errormsg" /></small>
								</div>
								<div class="form-group">
									<div>
										<label class="lable-name">End Date* </label> <input
											type="date" class="input-name" name="previousempenddate">
									</div>
									<small> <form:errors path="previousempenddate"
											cssClass="errormsg" /></small>
								</div>
								<div class="ln_solid"></div>
								<div class="buttons col-md-6 col-md-offset-3">
									<input class="btn btn-info" id="submit" name="submit"
										type="submit" value="Add Employee"> <input
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

