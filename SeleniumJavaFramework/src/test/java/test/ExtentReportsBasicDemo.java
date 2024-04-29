package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		 // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("EmagSearchTest1","Validate search functionality");
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        
        // log(Status, details)
        test1.log(Status.INFO, "Starting TestCase");
        
        driver.get("https://emag.ro");
        
        test1.pass("Navigated to Emag.ro");
        driver.manage().window().maximize();
        
    	//enter text in search textbox + Enter
		driver.findElement(By.cssSelector("#searchboxTrigger")).sendKeys("motocoasa");
		test1.pass("Entered text in search box");
		
		//click on search button
		driver.findElement(By.cssSelector("body.megamenu-always-visible:nth-child(2) div.main-container-outer:nth-child(16) nav.navbar.navbar-main.adjust-on-modal.navbar-has-searchbar.has-opened-searchbox:nth-child(2) div.container div.navbar-inner div.navbar-searchbox div.searchbox-wrapper.searchbox-dropdown-open form:nth-child(1) div.input-group.searchbox-input div.input-group-btn button.searchbox-close.btn.btn-default > i.em.em-close")).click();
		test1.pass("Pressed the search button");
		
		driver.close();
		driver.quit();
		test1.pass("Close the browser");
		test1.info("Test Completed");
		
		extent.flush();
		
		System.out.println("The test is passed");

	}

}
