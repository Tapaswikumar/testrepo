package operations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.Constants;
import utilities.Excelutil;

public class PageLaunch {
	public static int i=1;
	public static WebDriver mydriver;
	public void launch(String browser) throws IOException {
		if(browser.equalsIgnoreCase("firefox")) {
		String path= System.getProperty("user.dir") + "\\geckodriver.exe";
	    System.setProperty("webdriver.gecko.driver", path);
	    mydriver=new FirefoxDriver();
	    
	    mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    mydriver.get(Constants.url);
	    Excelutil.setExcelFile(Constants.ExcelPath+Constants.Filename, Constants.Sheetname);
	    
	}
		else if (browser.equalsIgnoreCase("chrome")) { 
			String path= System.getProperty("user.dir") + "\\chromedriver.exe";
		    System.setProperty("webdriver.chrome.driver", path);
		    mydriver=new ChromeDriver();
		    mydriver.manage().window().maximize();
		    mydriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    mydriver.get(Constants.url);
		}
	}
}
