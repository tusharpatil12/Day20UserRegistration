package com.bridgeLabz;

import java.util.regex.Pattern;

public class UserValidation {

	public static final String Validate_Name = "^[A-Z]+[a-z]{2,}$";

	public Boolean checkFirstName(String firstName) {
		return (Pattern.matches(Validate_Name, firstName));
	}
	public boolean checkLastName(String lastname) {
		return (Pattern.matches(Validate_Name,lastname));
	}
    public Boolean checkEmail(String email_id) {
		return (Pattern.matches(email_id, email_id));
	}

}
