package pagecomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import operations.PageLaunch;

public class IdPage {
	WebDriver driver;
	public IdPage() {
		driver=PageLaunch.mydriver;
	}
	
	public WebElement txtId() {
		 return driver.findElement(By.id("ap_email"));
	}
	
	public WebElement btnContinue() {
		 return driver.findElement(By.id("continue"));
	}
	
	public WebElement errormsg() {
		 return driver.findElement(By.id("auth-error-message-box"));
	}
	
}
