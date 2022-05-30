package com.testNG_basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstCode {
	public static WebDriver driver;
	
	//@BeforeSuite>@BeforeTest>@BeforeClass>@BeforeMethod>@Test>@AfterMethod>@AfterClass>@AfterTest>@AfterSuite
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("this will executed first");
	}
	
	@BeforeTest
	public void beforetest() {
		System.out.println("this will executed second");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("this will executed third");
	}
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("this will executed fourth");
	}
	
	@Test
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
	}
	
	@AfterMethod
	public void aftermethod(){
		System.out.println("this will executed fifth");
		}
	
	@AfterClass
	public void afterclass(){
		System.out.println("this will executed sixth");
		
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("this will executed seventh");
		
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("this will executed fifth");
		
	}
	

}
