package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CookieObj;


public class CookieAdmPrefTest {

	
	private static WebDriver driver = null;

		@BeforeTest
	public void setUpTTest() {
		
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		
	}
		@Test
		public static void emagCookieAdmPref() throws InterruptedException
		{

	        
			CookieObj cookieAdmPrefObj = new CookieObj(driver);
			
	        driver.get("https://emag.ro");
	        driver.manage().window().maximize();
	        
	        Thread.sleep(2000);
	        
	        cookieAdmPrefObj.adm_pref();
	        
	        
	        
	    
	        Thread.sleep(10000);
	        cookieAdmPrefObj.clickcookie_analyze();
		}
	        @AfterTest
	        public void tearDownTest() 
	        {
	        	driver.close();
	        	driver.quit();
	        	System.out.println("Test completed succesfully!");
	        	
	        }

	}


