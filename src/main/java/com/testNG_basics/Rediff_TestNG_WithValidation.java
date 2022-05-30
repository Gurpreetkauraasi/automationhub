    package com.testNG_basics;

    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Rediff_TestNG_WithValidation {
	public static WebDriver driver;
	//@BeforeMethod and @AfterMethod
	
	//to fail deleberately we can use assert.fail("failing")
	//@Test(enabled=false)
	//Dependancies on methods(dependsOnMethods={""})
	//alwaysRun= true is used when we dont want to make the test case skip.Incase, it is skipping then also it will run
    //Assertions in TestNG- special validation within TestNg which will make TestNG adhere to automation testers validation technique alongside tester's logic
	@BeforeTest
	public void initialize() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rediff.com");

	}

	@Test(priority = 1)
	public void validateLandingPage() {
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
	if (ActualTitle.equals(ExpectedTitle)) {
	System.out.println("Test Case with Priority 1 is PASS");
	} else {
	System.out.println("Test Case with Priority 1 is FAIL");
	}
	//Assert.fail("m failing it deliberately");

	}

    @Test(priority=2, enabled=true, dependsOnMethods= {"validateLandingPage"}, alwaysRun= true)//failing
	public void validateSignInLink() {
	WebElement signinLink = driver.findElement(By.className("signin"));
	if(signinLink.isDisplayed() && signinLink.isEnabled()) {
	signinLink.click();
	System.out.println("Test Case with Priority 2 is PASS");
	}
	else {
	System.out.println("Test Case with Priority 2 is FAIL");
	}
	}

	@Test(priority = 3, enabled=true, dependsOnMethods= {"validateSignInLink","validateLandingPage"}, alwaysRun= true)
	public void validateLoginPage() throws Exception {
	//validateSignInLink();
	//driver.findElement(By.className("signin")).click();
	Thread.sleep(2000);
	String ActualTitle = driver.getTitle();
	String ExpectedTitle = "Rediffmail";
	if (ActualTitle.equals(ExpectedTitle)) {
	System.out.println("Test Case with Priority 3 is PASS");
	} else {
	System.out.println("Test Case with Priority 3 is FAIL");
	}
	}

	@AfterClass
	public void tierDown() {
	driver.close();
	}

	}
