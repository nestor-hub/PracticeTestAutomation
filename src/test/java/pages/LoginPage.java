package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage  {
	WebDriver driver;
	
	     //locators 
	By TestLoginPageLink = By.linkText("Test Login Page");
	By usernameField = By.id("username");
	By PasswordField = By.id("password");
    By submitButton = By.xpath("//button[@id='submit']");
    By SuccessMessage = By.xpath("//h1[normalize-space()='Logged In Successfully']");
    By LogoutButton = By.xpath("//a[normalize-space()='Log out']");
    By errorMessage = By.xpath("//div[@id='error']");
    By errorMsg = By.id("error");
    
          //Constructor
    public LoginPage(WebDriver driver){
    	this.driver = driver; 			
    }
    
    
           //Actions
   public void clickTestLoginPageLink() {
        driver.findElement(TestLoginPageLink).click();
    }
   
    public void enterUsername(String username) {
    	driver.findElement(usernameField).sendKeys(username);
    }
    
    public void enterPassword(String Password) {
    	driver.findElement(PasswordField).sendKeys(Password);
    }
    
    public void clicksubmitButton() {
    	driver.findElement(submitButton).click();
    	
    }
    
         // Verify new page URL contains practicetestautomation.com/logged-in-successfully/
    public String getCurrentUrl() {
    	return driver.getCurrentUrl();
    }
         //Verify new page contains expected text ('Congratulations' or 'successfully logged in')
    public String getSuccessMessage(){
    	return driver.findElement(SuccessMessage).getText();
    }
         //Verify button Log out is displayed on the new page
    public boolean isLogoutButtonDisplayed() {
        return driver.findElement(LogoutButton).isDisplayed();
    
    }
    
    public String getErrorMessage() {
    	return driver.findElement(errorMessage).getText();
    	 	
    }
    
    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorMessage).isDisplayed();
        
    }
    
    public boolean isErrorMsgDisplayed() {
        return driver.findElement(errorMsg).isDisplayed();     
    }
    
    public String getErrorMsg() {
		return driver.findElement(errorMsg).getText();
		
    }	
		
    public void login(String username,String Password){
    	clickTestLoginPageLink();
    	enterUsername(username);
    	enterPassword(Password);
    	clicksubmitButton();
    


	
	}
}
