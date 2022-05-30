package waitconditions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait_Concepts {
	
	//implicit wait period of 10 secs
	//from 0.00sec till 9.99 secs WebDriver will wait for that WebElement
	//WebDriver will throw an exception
	//what if it shows up in 2secs so what will happen to the remaining 8 secs?
	//WebDriver will proceed
	
	public static WebDriver driver;

	public static void main(String[] args) {
		ChromeOptions options =new ChromeOptions();
		//options.setPageLoadStrategy(PageLoadStrategy.NONE);//SLOWEST MODE
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);//FASTEST MODE
		//options.setPageLoadStrategy(PageLoadStrategy.NORMAL);//NORMAL SPEED
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	    //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.get("https://www.rediff.com/");
		
		WebElement footer=driver.findElement(By.xpath("//div[@class='footer alignC']"));
		System.out.println(footer.isDisplayed());
		
			

	}

}
