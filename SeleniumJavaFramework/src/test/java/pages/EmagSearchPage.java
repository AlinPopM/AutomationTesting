package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmagSearchPage {

		
	 static WebElement element = null;
	
		public static WebElement textbox_search(WebDriver driver) {
			
			//String cautare = "motocoasa";
			
			element = driver.findElement(By.cssSelector("#searchboxTrigger"));
			return element;
			}
		
		public static WebElement button_search(WebDriver driver) {
			element = driver.findElement(By.cssSelector("body.megamenu-always-visible:nth-child(2) div.main-container-outer:nth-child(16) nav.navbar.navbar-main.adjust-on-modal.navbar-has-searchbar.has-opened-searchbox:nth-child(2) div.container div.navbar-inner div.navbar-searchbox div.searchbox-wrapper.searchbox-dropdown-open form:nth-child(1) div.input-group.searchbox-input div.input-group-btn button.searchbox-close.btn.btn-default > i.em.em-close"));
			return element;
			
		}
	

	}


