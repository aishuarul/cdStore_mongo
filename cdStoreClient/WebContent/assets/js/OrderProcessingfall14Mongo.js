/**
 * created by : Aishvarya Arul Nambi
 * 
 * Contains the functions for the order processing
 */

$(function() {
	var totalItems = 0;
	// Function to update the shopping table
	$.ajax({
		async : false,
		url : 'MongoShopCart?method=get',
		type : 'get',
		data : {},
		dataType : 'json'
	}).done(function(data) {
		if (data) {
			$.each(data.cds, function() {
				totalItems = totalItems + this.quantity;
			});
			$('#total-price').html('$' + data.total.toFixed(2));
			$('#total-products').html(totalItems);
		}
	});
});

function processingOrder() {
	// Validating user input
	var inputValidation = true;

	if (inputValidation) {
		document.getElementById("processCDOrderFrom").submit();
	}
}

function validateInput() {
	var userFirstName = $.trim($("#InputFirstName").val());
	if (!validateUsername(userFirstName)) {
		bootbox.alert("Please enter a valid First Name");
		return false;
	}

	var userLastName = $.trim($("#InputLastName").val());
	if (!validateUsername(userLastName)) {
		bootbox.alert("Please enter a valid Last Name");
		return false;
	}

	var zipCode = $.trim($("#InputZip").val());
	if (!validateZipPostalCode(zipCode)) {
		bootbox.alert("Please enter a valid ZIP Code");
		return false;
	}

	var iCountry = $("#InputCountry option:selected").val();
	if (iCountry.length == 0) {
		bootbox.alert("Please select a Country from drop down.");
		return false;
	}

	var email = $.trim($("#InputEmail").val());
	if (!validateEmail(email)) {
		bootbox.alert("Please enter a valid email address.");
		return false;
	}
	var mobile = $.trim($("#InputMobile").val());
	if (!validatePhoneNumber(mobile)) {
		bootbox.alert("Please enter a valid phone number.");
		return false;
	}

	if ($("#InputAddress").val().length == 0) {
		bootbox.alert("Please enter a valid address");
		return false;
	}

	if ($("#InputCity").val().length == 0) {
		bootbox.alert("Please enter a valid City.");
		return false;
	}

	if ($("#InputCity").val().length == 0) {
		bootbox.alert("Please enter a valid City.");
		return false;
	}

	var state_province = $("#InputState option:selected").val();
	if (state_province.length == 0) {
		bootbox.alert("Please select a State/province from the drop down.");
		return false;
	}

	// Check CreditCard information
	var card_number = $.trim($("#InputCCNumber").val());
	if (card_number.length == 0 || !validateIntegerValue(card_number)) {
		bootbox.alert("Credit card number is required and must only contain numeric values");
		return false;
	}

	var CCUsername = $.trim($("#CCUsername").val());
	if (!validateUsername(CCUsername)) {
		bootbox.alert("Please enter a valid name for the credit card");
		return false;
	}
	var iCCexp = $("#InputCCEXPDate option:selected").val();
	if (iCCexp.length == 0) {
		bootbox.alert("Please select a Credit Card Expiry date from drop down.");
		return false;
	}

	var iCCexpYr = $("#InputCCEXPYr option:selected").val();
	if (iCCexpYr.length == 0) {
		bootbox.alert("Please select a Credit Card Expiry year from drop down.");
		return false;
	}

	return true;
}

function validateUsername(username) {
	var userRegex = /^[A-Za-z0-9!@#$_.-]{3,75}$/;
	var valid = username.match(userRegex);
	if (valid == null) {
		return false;
	}
	return true;
}

function validateEmail(email) {
	var emailRegex = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
	var valid = email.match(emailRegex);
	if (valid == null) {
		return false;
	}
	return true;
}

function validateDollarAmt(amt) {
	var dollarRegex = /^-?\d+\.\d{2,2}$/;
	var valid = amt.match(dollarRegex);
	if (valid == null) {
		return false;
	}
	return true;
}

function alphanumericValue(val) {
	var alphaRegex = /^[a-zA-Z0-9]+$/;
	var valid = val.match(alphaRegex);
	if (valid == null) {
		return false;
	}
	return true;
}

function validateZipPostalCode(code) {
	var zipPostalRegex = /^((\d{5}-\d{4})|(\d{5})|([A-Z]\d[A-Z]\s\d[A-Z]\d))$/;
	var valid = code.match(zipPostalRegex);
	if (valid == null) {
		return false;
	}
	return true;

}

function validatePhoneNumber(val) {
	var phoneRegex = /^[2-9]\d{2}-\d{3}-\d{4}$/;
	var valid = val.match(phoneRegex);
	if (valid == null) {
		return false;
	}
	return true;
}

function validateIntegerValue(num) {
	var intRegex = /^\d+$/;
	var valid = num.match(intRegex);
	if (valid == null) {
		return false;
	}
	return true;
}