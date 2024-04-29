package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
	
	WebDriver driver = null;
	
	
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	 By menu_hover = By.xpath("//body/div[4]/div[1]/div[1]/div[1]/ul[1]/li[2]");
	 By Laptop = By.linkText("Laptopuri");
    
		
	public void hover() throws InterruptedException
	{
		WebElement elementMenu = driver.findElement(menu_hover);
		Actions actions = new Actions(driver);
		actions.moveToElement(elementMenu).perform();
		Thread.sleep(5000);		
	}
	
	public void clickLaptop() throws InterruptedException
	{
		WebElement clickLpt = driver.findElement(Laptop);
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(clickLpt).click().perform();
		Thread.sleep(5000);
	}
}
