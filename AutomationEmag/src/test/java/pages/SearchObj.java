package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchObj {
	
	WebDriver driver = null;
	
	By textbox_search_emagSearch = By.cssSelector("#searchboxTrigger");
	By button_search = By.cssSelector("body.megamenu-always-visible:nth-child(2) div.main-container-outer:nth-child(16) nav.navbar.navbar-main.adjust-on-modal.navbar-has-searchbar.has-opened-searchbox:nth-child(2) div.container div.navbar-inner div.navbar-searchbox div.searchbox-wrapper.searchbox-dropdown-open form:nth-child(1) div.input-group.searchbox-input div.input-group-btn button.searchbox-close.btn.btn-default > i.em.em-close");
	//By home_icon_button = By.className("navbar-branding");
			//constructor	
	public SearchObj(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setTextInSearchBox(String text) {
		
		driver.findElement(textbox_search_emagSearch).sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		driver.findElement(button_search).click();
	}
	
//	public void clickIconHomeButton() {
//
//		driver.findElement(home_icon_button).click();
//
//
//	}
}
