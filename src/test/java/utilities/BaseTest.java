package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public  WebDriver driver;
	
	@BeforeMethod
	public void SetUp() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://practicetestautomation.com/practice/");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void TearDown () {
		
		if  (driver != null) {
			 driver.quit();
		}
		
		
		
	}
	
}
