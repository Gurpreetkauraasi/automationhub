package com.Automation_basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Upload_file {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();//always write wait after this
	//	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);// for page load
		driver.get("http://demo.guru99.com/test/upload/");//testing Webpage
		Thread.sleep(1000);
		
	
		//Uploading File
		driver.findElement(By.cssSelector("//input[starts-with(@id,'uploadfile_')]")).sendKeys("C:\\Users\\User-Pc\\Desktop\\SELENIUM\\cv.txt");
		System.out.println("File is Uploaded successfully");
	}
}
		
		

	


