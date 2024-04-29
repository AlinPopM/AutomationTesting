package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {
	
	private static WebDriver driver = null;

	public void setUpTTest() {
		
		WebDriverManager.chromedriver().setup();
	    setDriver(new ChromeDriver());
		
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		Utils.driver = driver;
	}

}
