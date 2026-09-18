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
		Login_Page r = new Login_Page(driver);
//		Home_Page s = new Home_Page(driver); 
	
		r.enterUserName("student");
		r.enterPassword("Password123");
		r.clickLogin();
	}
	
	@Test (priority = 1)
	
	public void homeTestFn() {
		
		Home_Page s = new Home_Page(driver);
		
		
		String textValue = s.getTxt(); 
		Assert.assertEquals(textValue, "Log out");
		
		String urlValue = s.url();
		Assert.assertTrue(urlValue.contains("successfully"));
		
		s.clickLogout();// click Logout button
		
	}
	
	@Test (priority = 2)
	
	public void invalidUsernameFn() {
		
		Invalid_Credential t = new Invalid_Credential(driver);
		
		t.enterUserName("jibi");// invalid username
		t.enterPassword("Password123"); //valid password
		t.clickLoginButton();
		
	    Assert.assertTrue(t.isErrorMessageDisplayed());  
	  
	    Assert.assertEquals(t.getErrorMessageText(), "Your username is invalid!");  
		
	}
	
	
@Test (priority = 3)
	
	public void invalidPasswordFn() {
	Invalid_Credential t = new Invalid_Credential(driver);
	
	t.enterUserName("student");// valid username
	t.enterPassword("123"); //invalid password
	t.clickLoginButton();
	
	 Assert.assertTrue(t.isErrorMessageDisplayed());
	    Assert.assertEquals(t.getErrorMessageText(), "Your password is invalid!");
}

	

}
