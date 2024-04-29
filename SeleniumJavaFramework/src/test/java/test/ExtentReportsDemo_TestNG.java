package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemo_TestNG {
	ExtentHtmlReporter htmlReporter = null;
	ExtentReports extent;
	WebDriver driver = null;

	@BeforeSuite
	public void setUp() 
	{
		htmlReporter = new ExtentHtmlReporter("extent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeTest
	public void setUpTTest() 
	{

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void test1() throws IOException 
	{

		ExtentTest test = extent.createTest("EmagSearchTest1","Validate search functionality");

		driver.get("https://emag.ro");
		test.pass("Navigated to Emag.ro");

		driver.manage().window().maximize();
		test.pass("The window is maximize");

		// log(Status, details)
		test.log(Status.INFO, "This step shows usage of log(status, details)");

		// info(details)
		test.info("This step shows usage of info(details)");

		// log with snapshot
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

		// test with snapshot
		test.addScreenCaptureFromPath("screenshot.png");

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
