package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EmagSearchPageObject;

public class EmagSearchPageTest {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emagSearchTest();

	}
	
	public static void emagSearchTest()
	{
		
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
       
        
        EmagSearchPageObject searchPageObj = new EmagSearchPageObject(driver);
        driver.get("https://emag.ro");
        driver.manage().window().maximize();
        
        searchPageObj.setTextInSearchBox("motocoasa");
        searchPageObj.clickSearchButton();
        
        driver.close();
        
	
	}
}
