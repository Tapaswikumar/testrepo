package utilities;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import operations.PageLaunch;

public class GeneralOps {
	
	public void setdata(WebElement element,String data) {
		element.clear();
		element.sendKeys(data);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public boolean objExist(List<WebElement> we)
	{
		if(we.isEmpty())
		{
			return false;
		}
		else 
			return true;
	}
	
	public void Mousehover(WebElement element) {
		Actions act = new Actions(PageLaunch.mydriver);
		act.moveToElement(element).build().perform();
		
	}
	
}
