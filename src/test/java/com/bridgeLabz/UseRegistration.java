package com.bridgeLabz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class UseRegistration {

	@Before
	public void displayMethod(){
		System.out.println("Welcome to user Registration to junit");
	}
	@After
	public void afterDisplayMethod(){
		System.out.println("Test is Passed");
	}
	@Test
	public void given_first_name_should_returnTrue(){
		UserValidation validation = new UserValidation();
		Boolean result =validation.checkFirstName("Tushar");
		Assertions.assertEquals(result,true);

	}@Test
	public void given_last_name_should_returnTrue(){
		UserValidation validation= new UserValidation();
		Boolean result1 = validation.checkLastName("Patil");
		Assertions.assertEquals(result1,true);

	}
	@Test
	public void given_email_id_should_returnTrue(){
		UserValidation validation= new UserValidation();
		Boolean result2 = validation.checkEmail("Mumbacity@gmail.com");
		Assertions.assertEquals(result2,true);
	}
	@Test
	public void given_phone_number_should_returnTrue(){
		UserValidation validation = new UserValidation();
		Boolean result3 = validation.checkPhoneNumber("91 7066854089");
		Assertions.assertEquals(result3,true);
	}
	@Test
	public void given_password_should_returnTrue(){
		UserValidation validation = new UserValidation();
		Boolean passrule1 = validation.checkPassword("nashikcity");
		Assertions.assertEquals(passrule1, true);
	}
	@Test
	public void given_password2_should_returnTrue(){
		UserValidation validation = new UserValidation();
		Boolean passrule2 = validation.checkPassword2("Nashik123");
		Assertions.assertEquals(passrule2,true);
	}

}
