package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CookieObj {

		WebDriver driver = null;
		
		By adm_pref = By.xpath("//button[contains(text(),'Administrează preferințele')]");
		By accept_all_pref = By.xpath("//body/div[11]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");
		By accept_all = By.xpath("//button[contains(text(),'Accept toate')]");
	    By cooAnalyze = By.cssSelector("body.EOSMKP-101806-show-tomorrow.modal-open:nth-child(2) div.ph-modal.modal.fade.ph-modal-fullscreen.cookie-policy-modal.in:nth-child(40) div.modal-dialog.modal-lg div.modal-content div.modal-body.pad-sep-none.pad-hrz-none form.panel.mrg-sep-none.mrg-hrz-none.border-none.clearfix.cookie-preferences-form.js-cookie-preferences-form div.cookie-tabs-content ul.ph-widget.ph-tabs.nav.nav-pills.nav-stacked.ph-tabs.cookie-category-tabs.pull-left li.active:nth-child(3) > a.text-gray-dark.gtm_c554qhu6");
		
		//constructor	
		public CookieObj(WebDriver driver)
		{
			this.driver = driver;
		}
		
		public void adm_pref()
		{
			driver.findElement(adm_pref).click();
		}
		
		public void accept_all_pref()
		{
			driver.findElement(accept_all_pref).click();
		}
		
		public void accept_all()
		{
			driver.findElement(accept_all).click();
		}
		
		public void clickcookie_analyze() throws InterruptedException
		{
			{
				WebElement clickcookieanalyz = driver.findElement(cooAnalyze);
				Actions actionscookieanalyz = new Actions(driver);
				actionscookieanalyz.moveToElement(clickcookieanalyz).click().perform();
				Thread.sleep(2000);
			}
		}
		
		


	

}
