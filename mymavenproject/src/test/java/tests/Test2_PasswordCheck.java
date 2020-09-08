package tests;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import operations.PageLaunch;
import operations.SignInOp;
import utilities.Constants;
import utilities.Excelutil;
import utilities.Screenshot;

public class Test2_PasswordCheck {
	PageLaunch load;
	SignInOp login;
	Screenshot scr;
	
	@BeforeTest
	public void launch() throws IOException {
		load=new PageLaunch();	
		load.launch("firefox");
		scr=new Screenshot();
		scr.screen();
		Excelutil.setExcelFile(Constants.ExcelPath+Constants.Filename, Constants.Sheetname);
		login=new SignInOp();
		login.signIn("tapaswi.kr@gmail.com");
	}	

	@Test(dataProvider="passdata")
	public void TC02_passwordCheck(String pass) {
		
		
		login.Password(pass);
	}
	
	@DataProvider
	public Object[] passdata() throws InvalidFormatException, IOException {
		int icol=1;
		 Object data[]=new Object[4];
		 for(int irow=0;irow<4;irow++) 
		 	{
			 data[irow]=Excelutil.getCellData(irow+1,icol);
			 
		 	}
		 return data;
	}
}
