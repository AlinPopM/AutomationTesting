package testQA;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		//ia ultima versiune de chrome
		WebDriverManager.chromedriver().setup();

		//ca sa adaugi o versiune specifica de chrome//
		//WebDriverManager.chromedriver().driverVersion("93.01.02").setup();//

		//Deschide browser-ul + creat un obiect de tip driver//
		WebDriver driver = new ChromeDriver();
		driver.get("https://emag.ro");
		/*
		//aici am pus timeout//
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		 driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));	
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		 //ia url-ul curent
		 System.out.println(driver.getCurrentUrl()); 

		 //ia titlul site-ului
		 System.out.println(driver.getTitle());

		 //Face back
		 //driver.navigate().back();

		 //Face forward//
		 //driver.navigate().forward();

		 //Face refresh
		 //driver.navigate().refresh();


		 //deschide un nou TAB
		 //driver.switchTo().newWindow(WindowType.TAB);

		 //deschide un now browser
		 //driver.switchTo().newWindow(WindowType.WINDOW);

		 Dimension size = driver.manage().window().getSize();

		 //luam height-ul si width-ul paginii
		 System.out.println(size.getHeight());
		 System.out.println(size.getWidth());

		 driver.manage().window().setSize(new Dimension(800,600));

		 //marirea browser-ului
		 driver.manage().window().maximize();
		 */

		Thread.sleep(3000);

		//luam screenshot-uri
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("./ImageFirstTest/image1.png")); //"./ImageFirstTest/image1.png" locatia si numele imaginii



		//inchidem browser-ul curent
		driver.close();

		//inchidem sesiunea browser-ului
		//driver.quit();

	}

}
