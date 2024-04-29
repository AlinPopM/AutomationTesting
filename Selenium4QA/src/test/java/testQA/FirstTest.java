package testQA;

//librarii//
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class FirstTest {
	public static void main(String[] args) {
		
		//am adaugat asta pentru WebDriverManager//
		WebDriverManager.chromedriver().setup();
		
		//ca sa adaugi o versiune specifica de chrome//
		//WebDriverManager.chromedriver().driverVersion("93.01.02").setup();//
		
		//Deschide browser-ul + creat un obiect de tip driver//
		WebDriver driver = new ChromeDriver();
		driver.get("https://emag.ro");
		
		//aici am pus timeout//
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		 driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));	
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 
		//inchidem browser-ul//
		driver.close();
	}

}
