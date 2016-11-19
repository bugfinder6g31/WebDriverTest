package example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	private WebDriver driver;	
	@Test
	public void testEasy() {
		driver.get("http://www.google.com");  
		String title = driver.getTitle();				 
		System.out.println(title);
	}
	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver(); 
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
