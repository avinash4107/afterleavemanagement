<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<title>Centraprise</title>
<link rel="icon" href="/images/logo.gif">
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

<!-- Datepicker -->
<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.bootstrapvalidator/0.5.3/js/bootstrapValidator.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.10.2/moment.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datetimepicker/3.1.3/js/bootstrap-datetimepicker.min.js"></script>
<script>
    var bindDateRangeValidation = function (f, s, e) {
    if(!(f instanceof jQuery)){
			console.log("Not passing a jQuery object");
    }
  
    var jqForm = f,
        startDateId = s,
        endDateId = e;
  
    var checkDateRange = function (startDate, endDate) {
        var isValid = (startDate != "" && endDate != "") ? startDate <= endDate : true;
        return isValid;
    }

    var bindValidator = function () {
        var bstpValidate = jqForm.data('bootstrapValidator');
        var validateFields = {
            startDate: {
                validators: {
                    notEmpty: { message: 'This field is required.' },
                    callback: {
                        message: 'Start Date must less than or equal to End Date.',
                        callback: function (startDate, validator, $field) {
                            return checkDateRange(startDate, $('#' + endDateId).val())
                        }
                    }
                }
            },
            endDate: {
                validators: {
                    notEmpty: { message: 'This field is required.' },
                    callback: {
                        message: 'End Date must greater than or equal to Start Date.',
                        callback: function (endDate, validator, $field) {
                            return checkDateRange($('#' + startDateId).val(), endDate);
                        }
                    }
                }
            },
          	customize: {
                validators: {
                    customize: { message: 'customize.' }
                }
            }
        }
        if (!bstpValidate) {
            jqForm.bootstrapValidator({
                excluded: [':disabled'], 
            })
        }
      
        jqForm.bootstrapValidator('addField', startDateId, validateFields.startDate);
        jqForm.bootstrapValidator('addField', endDateId, validateFields.endDate);
      
    };

    var hookValidatorEvt = function () {
        var dateBlur = function (e, bundleDateId, action) {
            jqForm.bootstrapValidator('revalidateField', e.target.id);
        }

        $('#' + startDateId).on("dp.change dp.update blur", function (e) {
            $('#' + endDateId).data("DateTimePicker").setMinDate(e.date);
            dateBlur(e, endDateId);
        });

        $('#' + endDateId).on("dp.change dp.update blur", function (e) {
            $('#' + startDateId).data("DateTimePicker").setMaxDate(e.date);
            dateBlur(e, startDateId);
        });
    }

    bindValidator();
    hookValidatorEvt();
};


$(function () {
    var sd = new Date(), ed = new Date();
  
    $('#startDate').datetimepicker({ 
      pickTime: false, 
      format: "YYYY/MM/DD", 
      defaultDate: sd, 
      minDate: ed 
    });
  
    $('#endDate').datetimepicker({ 
      pickTime: false, 
      format: "YYYY/MM/DD", 
      defaultDate: ed, 
      minDate: ed 
    });

    //passing 1.jquery form object, 2.start date dom Id, 3.end date dom Id
    bindDateRangeValidation($("#form"), 'startDate', 'endDate');
});
</script>
<!-- Datepicker -->



<!-- Custom Theme Style -->
<link href="/css/styles.css" rel="stylesheet">
<META NAME="DESCRIPTION" CONTENT=" ">
<META NAME="KEYWORDS" CONTENT="">

<script type="text/javascript"> 
var dt_obj= new Date();
function addOption(selectbox,text,value )
{
var optn = document.createElement("OPTION");
optn.text = text;
optn.value = value;
selectbox.options.add(optn);
}
///////////// date //////////////////
var today_date= dt_obj.getDate();
function addOption_list1(){
for (var i=1; i < 32;++i){
addOption(document.drop_list.dt_list, i, i);
if(i== today_date){document.drop_list.dt_list.options[i].selected=true;}
}
addOption_list2();
}
//////////////End of Date //////////


///////////// Month //////////////////
var current_month=dt_obj.getMonth() +1;
function addOption_list2(){
var month = new Array("January","February","March","April","May","June","July","August","September","October","November","December");
for (var i=0; i < month.length;++i){
addOption(document.drop_list.Month_list, month[i], month[i]);
if(i== current_month){document.drop_list.Month_list.options[i].selected=true;}
}
addOption_list3();

}
//////////////End of Month //////////


</script>

</head>
<body lang="en" onload=addOption_list1();>
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
						<div class="text-left-grp">Monthly Leaves</div>

						<div class="form-fields">

							<form:form name="drop_list" role="form" action="/applyLeave"
								modelAttribute="leaveForm" method="post"
								onsubmit="return validate();">

								<div class="form-group">
									<label for="employee number" class="lable-name">Employee
										Number *</label>
									<form:select class="input-name" name="employeenumber"
										id="employeenumber" path="employeenumber" size="1">
										<form:option value="" />
										<form:options items="${employeeNum}" />
									</form:select>
								</div>
								<div class="form-group">
									<div>
										<label for="basic salary" class="lable-name">Month * </label>
										<SELECT NAME="dt_list">
											<Option value="">Date</option>
										</SELECT> <SELECT NAME="Month_list" id="Month_list">
											<Option value="">Month</option>
										</SELECT>
									</div>
								</div>

								<div class="form-group">
									<div>
										<label for="basic salary" class="lable-name">Type of
											Leave * </label> <select class="input-name" id="leaveType"
											name="leaveType" style="height: 30px;">
											<option>Casual</option>
											<option>Sick</option>
											<option>LOP</option>
										</select>
									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="basic salary" class="lable-name">Start
											Date * </label> <input type="text" class="input-name" id="startDate"
											name="startDate" />
									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="basic salary" class="lable-name">End Date
											* </label> <input type="text" class="input-name" id="endDate"
											name="endDate" />
									</div>
								</div>
								<div class="form-group">
									<div>
										<label for="basic salary" class="lable-name">Days * </label> <input
											type="text" class="input-name" id="numberofdays"
											name="numberofdays" />
									</div>
								</div>

								<div class="ln_solid"></div>
								<div class="buttons">
									<input class="btn btn-info" id="submit" name="submit"
										type="submit" value="Add Leaves" onclick="return submit();">
								</div>
							</form:form>
							<div class="footer">
								<p>
									Copyright &copy;
									<script>document.write(new Date().getFullYear())</script>
									All Rights Reserved.
								</p>
							</div>
						</div>
					</div>

				</div>
			</div>
</body>
</html>