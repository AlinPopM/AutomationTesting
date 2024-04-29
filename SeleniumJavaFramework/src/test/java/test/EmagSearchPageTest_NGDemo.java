package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmagSearchPageObject;

public class EmagSearchPageTest_NGDemo {
	
	private static WebDriver driver = null;

	@BeforeTest
public void setUpTTest() {
	
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	
}
	@Test
	public static void emagSearchTest()
	{

        
        EmagSearchPageObject searchPageObj = new EmagSearchPageObject(driver);
        driver.get("https://emag.ro");
        driver.manage().window().maximize();
        
        searchPageObj.setTextInSearchBox("motocoasa");
        searchPageObj.clickSearchButton();
        
	}
        @AfterTest
        public void tearDownTest() 
        {
        	driver.close();
        	driver.quit();
        	System.out.println("Test completed succesfully!");
        	
        }
        
	
	
}
