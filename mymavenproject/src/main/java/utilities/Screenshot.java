package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import operations.PageLaunch;

public class Screenshot {
	
	static int img=1;
	WebDriver driver;
	public Screenshot() {
		 
		driver=PageLaunch.mydriver;
	}
	
	public void screen() throws IOException {
    
	 String q=Integer.toString(img);
     String image= System.getProperty("user.dir")+"\\Screenshots\\capture-" + q +".jpg";
    		
	File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f, new File(image));
	img++;
}
}
