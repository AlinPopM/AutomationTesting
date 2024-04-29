package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CookieObj;


public class CookieAccAll {


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

		Thread.sleep(5000);

		cookieAdmPrefObj.accept_all();


		Thread.sleep(5000);
	}
	@AfterTest
	public void tearDownTest() 
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfully!");

	}

}


