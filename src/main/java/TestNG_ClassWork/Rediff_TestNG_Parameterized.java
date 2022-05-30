package TestNG_ClassWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Rediff_TestNG_Parameterized {
	 public static WebDriver driver;
	 public static ChromeOptions options;
	 

	@Test
	 @Parameters({"Browser","url","username","password","signinbBtn","logoutLink"})
	 public void launchRediffWithChrome(String Browser, String url, String username, String password, String Xpath, String logoutLink ) {
		 WebDriverManager.chromedriver().setup();
		 options = new ChromeOptions();
		 options.addArguments("start-maximized");
		 
		 driver = new ChromeDriver(options);
		 driver.get("url");
		 driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		 driver.findElement(By.id("password")).sendKeys("Selenium@123");
		 driver.findElement(By.className("signinbtn")).click();
	}
	

}


