package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import operations.PageLaunch;
import operations.SignInOp;

import utilities.Excelutil;
import utilities.Screenshot;
//initial project
public class Test1_IdCheck {
	PageLaunch load;
	SignInOp login;
	Screenshot scr;
	public static int i=1;
	@BeforeTest
	public void launch() throws IOException {
		load=new PageLaunch();	
		load.launch("firefox");
		scr=new Screenshot();
		scr.screen();
		login=new SignInOp();
	}	
	
	@Test(dataProvider="testdata")
	public void TC01_IdValidity(String text) throws IOException, InvalidFormatException {
		
		
		login.signIn(text);
		scr.screen();
	}
	
	@DataProvider
	public Object[] testdata() throws InvalidFormatException, IOException {
		 int icol=0;
		 Object data[]=new Object[4];
		 for(int irow=0;irow<4;irow++) 
		 	{
			 data[irow]=Excelutil.getCellData(irow+1,icol);
			 
		 	}
		 return data;		
	}
	
	@AfterTest
	public void StatusCheck() throws IOException {
		login.ValidIdCheck();
		int j=2;
		
		Excelutil.setCellData("passed", i, j);
		i++;
		
	}

}
