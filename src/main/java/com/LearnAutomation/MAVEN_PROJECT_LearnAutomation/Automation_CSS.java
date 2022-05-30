package com.LearnAutomation.MAVEN_PROJECT_LearnAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_CSS {
	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.cssSelector(".signin")).click();
		

	}

}
