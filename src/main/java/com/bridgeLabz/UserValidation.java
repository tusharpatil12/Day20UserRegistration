package com.bridgeLabz;

import java.util.regex.Pattern;

public class UserValidation {

	public static final String Validate_Name = "^[A-Z]+[a-z]{2,}$";
	public static final String EMAIL_ID = "^[A-Z]{1,}[a-z]{5,}[@]{1}[a-z]{2,}[.]?[a-z]{2,}$";
        public static final String PHONE_NUMBER="^[0-9]+\t[0-9]{10}$";



	public Boolean checkFirstName(String firstName) {
		return (Pattern.matches(Validate_Name, firstName));
	}
	public boolean checkLastName(String lastname) {
		return (Pattern.matches(Validate_Name,lastname));
	}
	public Boolean checkEmail(String email_id) {
		return (Pattern.matches(email_id, email_id));
	}
	public Boolean checkPhoneNumber(String phone_Number) {
		return (Pattern.matches(phone_Number,phone_Number));
	}


}
