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
	 
	    }

}
