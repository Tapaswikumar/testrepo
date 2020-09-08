package operations;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pagecomponents.HomePage;
import utilities.GeneralOps;

public class HomeOp {

	GeneralOps gen;
	HomePage hpage;
	public HomeOp() {
		gen=new GeneralOps();
		hpage=new HomePage();
	}
	
	public void BuyBook() {
		gen.Mousehover(hpage.LnkNavigate());
		WebDriverWait wait=new WebDriverWait(PageLaunch.mydriver, 10);
		wait.until(ExpectedConditions.visibilityOf(hpage.LnkBooks()));
		
		gen.Mousehover(hpage.LnkBooks());
		
		wait.until(ExpectedConditions.visibilityOf(hpage.LnkFiction()));
		gen.click(hpage.LnkFiction());
	}
	public void SignOut() {
		gen.Mousehover(hpage.LnkAccount());
		WebDriverWait wait=new WebDriverWait(PageLaunch.mydriver, 10);
		wait.until(ExpectedConditions.visibilityOf(hpage.LnkSignOut()));
		gen.click(hpage.LnkSignOut());
	}
}
