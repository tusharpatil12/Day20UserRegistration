package com.bridgeLabz;

import java.util.regex.Pattern;

public class UserValidation {
	
	public static final String Validate_Name = "^[A-Z]+[a-z]{2,}$";
	public Boolean checkFirstName(String firstName) {
		return (Pattern.matches(Validate_Name, firstName));
	}

}
