package tests;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SearchObj;


public class EmagSearchTest {
	
	private static WebDriver driver = null;

	@BeforeTest
	
    public void setUpTTest() {
	
	WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
	
}
	@Test
	public static void emagSearchTest()
	{

        
		SearchObj searchPageObj = new SearchObj(driver);
		
        driver.get("https://emag.ro");
        driver.manage().window().maximize();
        
        searchPageObj.setTextInSearchBox("motocoasa");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        
        
        searchPageObj.clickSearchButton();
        //searchPageObj.clickIconHomeButton();
       
        
	}
        @AfterTest
        public void tearDownTest() 
        {
        	driver.close();
        	driver.quit();
        	System.out.println("Test completed succesfully!");
        	
        }
        
	
	
}
