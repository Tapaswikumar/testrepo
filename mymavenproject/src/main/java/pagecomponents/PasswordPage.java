package pagecomponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import operations.PageLaunch;

public class PasswordPage {
	 WebDriver driver;
	 
	 public PasswordPage() {
		 driver=PageLaunch.mydriver;
	 }
	 
	 public WebElement lnkchange() {
		 return driver.findElement(By.id("ap_change_login_claim"));
	 }

	 public WebElement txtPassword() {
		 return driver.findElement(By.id("ap_password"));
	 }
	 public WebElement btnlogin() {
		 return driver.findElement(By.id("signInSubmit"));
	 }
	 
	 public List<WebElement> btnloginList() {
		 
		 return driver.findElements(By.id("ap_password"));
	 }
	
}
