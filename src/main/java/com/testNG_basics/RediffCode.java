package com.testNG_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffCode {
	public static WebDriver driver;
	
	@BeforeClass
	public static void inializeWebdriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void launchRediff() {
		driver.manage().window().maximize();
		//get title & url
		/*System.out.println(driver.getTitle());
		String expectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping" ;
		String actualTitle = driver.getTitle();
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("My rediff title is correct");
		}
		
		System.out.println(driver.getCurrentUrl());
		String expectedCurrentUrl = "https://www.rediff.com/";
		String actualCurrentUrl = driver.getCurrentUrl();
		
		if (expectedCurrentUrl.equals(actualCurrentUrl)) {
			System.out.println("My rediff url is correct");
			
		}*/
		//                OR
		
		driver.get("https://www.rediff.com/");
		System.out.println("My rediff title is correct");
		driver.findElement(By.className("signin")).click();
		System.out.println("We are currently on the following URL" +driver.getCurrentUrl());
		
		
	}
	
	@Test(description="This method validates the sign in functionality")
	public void SignInLink() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	
	}
	
	@AfterMethod
	public void postSignUp()
	{
	System.out.println(driver.getCurrentUrl());

	}
	
	@AfterClass
	public void tierdown() {
		driver.quit();//or driver.close();
	}
	
	

}
