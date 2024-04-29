package test;
import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmagSearch_Base {

	public static void main(String[] args)
	{
		
		EmagSearch();
		
		
	}
		
		public static void EmagSearch() {
			
			WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            
            //goto Emag.ro
			driver.get("https://emag.ro");
			
			//max the window
			driver.manage().window().maximize();
			
			//enter text in search textbox + Enter
			driver.findElement(By.cssSelector("#searchboxTrigger")).sendKeys("motocoasa");
			
			//click on search button
			driver.findElement(By.cssSelector("body.megamenu-always-visible:nth-child(2) div.main-container-outer:nth-child(16) nav.navbar.navbar-main.adjust-on-modal.navbar-has-searchbar.has-opened-searchbox:nth-child(2) div.container div.navbar-inner div.navbar-searchbox div.searchbox-wrapper.searchbox-dropdown-open form:nth-child(1) div.input-group.searchbox-input div.input-group-btn button.searchbox-close.btn.btn-default > i.em.em-close")).click();
			
			
			//close browser
			driver.close();
			
			System.out.println("Test completed succsesfully");
			
			
		}
		


	}
