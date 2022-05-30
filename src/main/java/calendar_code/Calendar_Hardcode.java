package calendar_code;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calendar_Hardcode {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skyscanner.com/flights-from/ca/cheap-flights-from-canada.html");
		driver.findElement(By.className("DateRangeSelector_form-item__YjE0N DateRangeSelector_form-item-oneline__NTc5N")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("FlightDatepicker_fsc-datepicker__calendar-wrapper__YzUwY")));
	}

}
