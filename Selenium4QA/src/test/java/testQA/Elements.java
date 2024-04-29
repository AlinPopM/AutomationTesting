package testQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ia ultima versiune de chrome
				WebDriverManager.chromedriver().setup();

				//ca sa adaugi o versiune specifica de chrome//
				//WebDriverManager.chromedriver().driverVersion("93.01.02").setup();//

				//Deschide browser-ul + creat un obiect de tip driver//
				WebDriver driver = new ChromeDriver();
				driver.get("https://emag.ro");
				
				driver.manage().window().maximize();
			
				
				
				
				//WebElement AcceptConsent  = driver.findElement(By.cssSelector("#btn btn-primary js-accept gtm_h76e8zjgoo btn-block"));
				//AcceptConsent.click();
				
				Thread.sleep(3000);
				
				WebElement searchBox = driver.findElement(By.cssSelector("#searchboxTrigger"));
				searchBox.sendKeys("motocoasa", Keys.ENTER);
				
				
				Thread.sleep(3000);
				
				driver.close();
				driver.quit();
	}

}
