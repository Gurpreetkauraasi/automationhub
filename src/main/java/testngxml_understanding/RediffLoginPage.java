package testngxml_understanding;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class RediffLoginPage extends Base {
	
	@Test
	public static void loginCredentials() {
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		
	}
	

}
