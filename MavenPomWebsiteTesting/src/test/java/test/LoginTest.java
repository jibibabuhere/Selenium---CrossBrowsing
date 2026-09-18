package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Base;
import pages.Home_Page;
import pages.Invalid_Credential;
import pages.Login_Page;

public class LoginTest extends Base{

	
	@Test (priority = 0)
	
	public void loginTestFn() {
		Login_Page r = new Login_Page(driver); // object for Login page
//		Home_Page s = new Home_Page(driver); // object for Login page
	
		r.enterUserName("student");
		r.enterPassword("Password123");
		r.clickLogin();
	}
	
	@Test (priority = 1)
	
	public void homeTestFn() {
		
		Home_Page s = new Home_Page(driver); // object for Login page
		
		
		String textValue = s.getTxt();  // do calling and comparison in this Test class other in Page class
		Assert.assertEquals(textValue, "Log out"); ////1. b getting and checking text values of button 
		
		String urlValue = s.url(); // do calling and comparison in this Test class other in Page class
		Assert.assertTrue(urlValue.contains("successfully"));//2. b checking the url contains the value "successfully"
		
		s.clickLogout();// click Logout button
		
	}
	
	@Test (priority = 2)
	
	public void invalidUsernameFn() { // invalid username and valid password
		
		Invalid_Credential t = new Invalid_Credential(driver); // object for invalidCredential class
		
		t.enterUserName("jibi");// invalid username
		t.enterPassword("Password123"); //valid password
		t.clickLoginButton();
		
	    Assert.assertTrue(t.isErrorMessageDisplayed());  // verify error message is displayed
	  
	    Assert.assertEquals(t.getErrorMessageText(), "Your username is invalid!");  // verify username error message text
		
	}
	
	
@Test (priority = 3)
	
	public void invalidPasswordFn() {
	Invalid_Credential t = new Invalid_Credential(driver); // object for invalidCredential class
	
	t.enterUserName("student");// valid username
	t.enterPassword("123"); //invalid password
	t.clickLoginButton();
	
	 Assert.assertTrue(t.isErrorMessageDisplayed()); // verify error message is displayed
	    Assert.assertEquals(t.getErrorMessageText(), "Your password is invalid!");// verify password error message text
}

	

}
