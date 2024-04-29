package testQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ia ultima versiune de chrome
		WebDriverManager.chromedriver().setup();

		//ca sa adaugi o versiune specifica de chrome//
		//WebDriverManager.chromedriver().driverVersion("93.01.02").setup();//

		//Deschide browser-ul + creat un obiect de tip driver//
		WebDriver driver = new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://emag.ro");
		
		driver.manage().window().maximize();
		
		WebElement searchField = driver.findElement(By.cssSelector("#searchboxTrigger"));
		searchField.sendKeys("motocoasa", Keys.ENTER);
		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Motocoasa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Motocoasa Steinhaus PRO-BC62, motor 2 timpi, benzi')]")));
		Motocoasa.click();
		
		driver.close();
		driver.quit();
		
	}

}
