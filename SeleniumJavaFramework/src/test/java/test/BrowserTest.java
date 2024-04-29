package test;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//ia ultima versiune de chrome
		WebDriverManager.chromedriver().setup();

//		String projectPath = System.getProperty("user.dir");
//		System.out.println(projectPath);
		
		//Deschide browser-ul + creat un obiect de tip driver - chrome
//		System.setProperty("webdriver. chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://emag.ro");
		driver.manage().window().maximize();
		
		//WebElement AcceptConsent  = driver.findElement(By.cssSelector("#btn btn-primary js-accept gtm_h76e8zjgoo btn-block"));
		//AcceptConsent.click();
		
		Thread.sleep(3000);
		
		WebElement searchBox = driver.findElement(By.cssSelector("#searchboxTrigger"));
		searchBox.sendKeys("motocoasa", Keys.ENTER);
		
		
		//creat sa se deschida Firefox
//		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://emag.ro"); 
//		
		Thread.sleep(3000);

		//inchidem browser-ul curent
		driver.close();

		//inchidem sesiunea browser-ului
		driver.quit();

	}

}
