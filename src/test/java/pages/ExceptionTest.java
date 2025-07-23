package pages;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

import utilities.BaseTest;

public class ExceptionTest extends BaseTest {
	
	@Test 
	
	public void TestNoSuchElementException() {
		
		ExceptionPage Page = new ExceptionPage(driver);
		
	try {
			Page.triggerNoSuchElementException();
		}
	catch (NoSuchElementException e) {	
		
            System.out.println(" Caught NoSuchElementException: " + e.getMessage());
        }
		
		
		//Page.ClickTestExceptionPageLink();
		//Page.ClickAddButton();
		//Page.WaitforRow2AndType("Shirt");
		//Page.ClickSaveButton();
		}
		
		
	
	

}
