package com.testNG_basics;

import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  Dropdown_Testng {
	
	public class HoverableDropdownTest {

	    private WebDriver driver;
	    private Actions action;

	    //Edit: there may have been a typo in the '- >' expression (I don't really want to add this comment but SO insist on ">6 chars edit"...
	    Consumer < By > hover = (By by) -> {
	        action.moveToElement(driver.findElement(by))
	              .perform();
	    };

	    @Test
	    public void hoverTest() {
	        driver.get("https://www.bootply.com/render/6FC76YQ4Nh");

	        hover.accept(By.linkText("Dropdown"));
	        hover.accept(By.linkText("Dropdown Link 5"));
	        hover.accept(By.linkText("Dropdown Submenu Link 5.4"));
	        hover.accept(By.linkText("Dropdown Submenu Link 5.4.1"));
	    }

	    @BeforeTest
	    public void setupDriver() {
	        driver = new FirefoxDriver();
	        action = new Actions(driver);
	    }

	    @AfterTest
	    public void teardownDriver() {
	        driver.quit();
	    }

	}

}
