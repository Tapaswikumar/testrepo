package pagecomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import operations.PageLaunch;

public class HomePage {

	WebDriver driver;
	
	public HomePage() {
		driver=PageLaunch.mydriver;
	}
	
	public WebElement LnkNavigate() {
		return driver.findElement(By.id("nav-link-shopall"));
	}
	
	public WebElement LnkBooks() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[2]/span[15]"));
	}
	public WebElement LnkFiction() {
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		return driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[4]/div[3]/div[15]/div/a[2]"));
	}
	public WebElement LnkAccount() {
		return driver.findElement(By.id("nav-link-yourAccount"));
	}
	public WebElement LnkSignOut() {
		return driver.findElement(By.id("nav-item-signout-sa"));
	}
	
}
