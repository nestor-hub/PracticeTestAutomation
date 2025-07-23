package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionPage {
	WebDriver driver;
   WebDriverWait wait;
	
	// Locators
	By TestExceptionPageLink = By.xpath("//a[normalize-space()='Test Exceptions']");
	By AddButton = By.id("add_btn");
	By Row2inputField = By.cssSelector("div[id='row2'] input[type='text']");
	By SaveButton = By.name("Save");
	By ConfirmationMsg = By.id("confirmation");
			
	// Constructor
	public ExceptionPage(WebDriver driver){
    	this.driver = driver; 		
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	// Actions
	public void ClickTestExceptionPageLink() {
		driver.findElement(TestExceptionPageLink).click();	
	}
	
	public void  ClickAddButton() {
		driver.findElement(AddButton).click();
	}
	public void WaitforRow2AndType (String text) {
		WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(Row2inputField));
		inputField.sendKeys(text);
	}
	public void ClickSaveButton() {
	   driver.findElement(SaveButton).click();
	}
	
	public  String getconfirmationMsg() {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(ConfirmationMsg)).getText();
	}
	
	    // Method to trigger the Exceptions
	
	public void triggerNoSuchElementException() {
       // driver.findElement(By.
        
	}
}




