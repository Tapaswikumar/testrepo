package operations;

import pagecomponents.IdPage;
import pagecomponents.PasswordPage;
import utilities.GeneralOps;

public class SignInOp {

	IdPage ipage;
	PasswordPage ppage;
	GeneralOps gen;
	
	public SignInOp() {
		 
		ipage=new IdPage();
		ppage=new PasswordPage();
		gen=new GeneralOps();
	}
	
	public void signIn(String mail) {
		
		gen.setdata(ipage.txtId(),mail);
		gen.click(ipage.btnContinue());
		
	}
	
	public void Password(String pass) {
		
		gen.setdata(ppage.txtPassword(),pass);
		gen.click(ppage.btnlogin());		
	}
	
	public void ValidIdCheck() {
		
		if(gen.objExist(ppage.btnloginList()))
		{
			gen.click(ppage.lnkchange());
		}
	}
	
}
