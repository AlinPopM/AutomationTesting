package test;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmagSearchPage;

public class EmagSearchTest {
	
    private static WebDriver driver = null;

	public static void main(String[] args)
	{
		
		EmagSearch();
		
		
	}
		
		public static void EmagSearch() {
			
			WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://emag.ro");
            driver.manage().window().maximize();
			
			
			EmagSearchPage.textbox_search(driver).sendKeys("motocoasa");
			EmagSearchPage.button_search(driver).click();
			
		
			System.out.println("Test completed succsesfully");
			
			//close browser
			driver.close();
			
		}
		


	}
