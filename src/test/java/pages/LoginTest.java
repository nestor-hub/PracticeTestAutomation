package pages;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseTest;

public class LoginTest extends BaseTest{
	
	@Test
	public void positiveLogin() throws InterruptedException{
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("student", "Password123");
		Thread.sleep(3000);
		
		Assert.assertTrue(loginPage.getCurrentUrl().contains("logged-in-successfully"), "URL is incorrect");
        Assert.assertTrue(loginPage.getSuccessMessage().toLowerCase().contains("congratulations") 
                          || loginPage.getSuccessMessage().toLowerCase().contains("successfully"), 
                          "Success message is not as expected");
        Assert.assertTrue(loginPage.isLogoutButtonDisplayed(), "Logout button not displayed");
	}
	
	@Test
	public void NegativeUserName() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("incorrectUser", "Password123");
		Thread.sleep(2000);
		
		Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message is not displayed");
        Assert.assertEquals(loginPage.getErrorMessage(), "Your username is invalid!", "Error message text mismatch");
	}
	
	@Test
	public void NegativePassword() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("student", "incorrectPassword");
		Thread.sleep(2000);
	    
		Assert.assertTrue(loginPage.isErrorMsgDisplayed(), "Error message is not displayed");
		Assert.assertEquals(loginPage.getErrorMsg(), "Your password is invalid!", "Error message text mismatch");
		
	
	}

}
