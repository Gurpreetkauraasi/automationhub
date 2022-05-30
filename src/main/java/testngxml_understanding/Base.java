package testngxml_understanding;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver driver;
	
	@BeforeTest
	public void initialize() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		//options.setHeadless(true);
		//options.addArguments("headless");
		options.addArguments("star-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.rediff.com/");
		
	}

}

//all classes are created as 1 testngsuite and named as testngtrial1.xml
