package tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import pages.Homepage;


@Test
public class ExpandMegaMenu {

	ExtentHtmlReporter htmlReporter = null;
	static ExtentReports extent;
	private static WebDriver driver = null;
	
	@BeforeSuite

	public void setUp() 
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setUpTTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		

	}

	public static void hover_Menu() throws InterruptedException
	{
		ExtentTest test = extent.createTest("HoverMegaMenuTest","Validate hover&click functionality");

		Homepage hoverLaptop = new Homepage(driver);
		String url = "https://www.emag.ro";
		driver.get(url);
		

//		if (driver.getCurrentUrl().equals(url)) {
//			test.log(Status.PASS, "Pagina s-a deschis cu succes");
//		} else {
//			test.log(Status.FAIL, "Pagina nu s-a deschis corect");
//		}
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);

		hoverLaptop.hover();
		
		hoverLaptop.clickLaptop();
		

	}

	@AfterTest
	public void tearDownTest() 
	{
		driver.close();
		driver.quit();
		System.out.println("Test completed succesfully!");

	}

	@AfterSuite
	public void tearDown() 
	{
		extent.flush();
	}

}


