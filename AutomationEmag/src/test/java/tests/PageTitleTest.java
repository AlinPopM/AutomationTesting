package tests;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class PageTitleTest {
	
	private static WebDriver driver = null;

	@BeforeTest
	public void setUpTTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@Test
	public static void PageTitleTest() throws InterruptedException
	{


		driver.get("https://emag.ro");
		driver.manage().window().maximize();
		String actualresults = driver.getTitle();
		String expectedTitle = "eMAG.ro - Căutarea nu se oprește niciodată";
		Thread.sleep(5000);


        Assert.assertEquals(expectedTitle,actualresults );
	
	}
	@AfterTest
	public void tearDownTest() 
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfully!");

	}

}



