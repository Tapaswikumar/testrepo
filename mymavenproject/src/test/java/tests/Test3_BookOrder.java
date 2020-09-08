package tests;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import operations.HomeOp;
import operations.PageLaunch;
import operations.SignInOp;
import utilities.Screenshot;

public class Test3_BookOrder {

	PageLaunch load;
	SignInOp login;
	HomeOp Order;
	Screenshot scr;
	
	@BeforeTest
	public void launch() throws IOException {
		load=new PageLaunch();	
		load.launch("firefox");
		scr=new Screenshot();
		scr.screen();
		login=new SignInOp();
		Order=new HomeOp();
	}	
	
	@Test
	public void TC01_Book() {
		login.signIn("tapaswi.kr@gmail.com");
		login.Password("boxal7ad");
		Order.BuyBook();
		Order.SignOut();
		
		
	}
}
