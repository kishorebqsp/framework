package scripts;

import org.testng.annotations.Test;

import POM.Loginpage;
import generic.Basetest;
import generic.Excel;

public class Invalidlogin extends Basetest{
	@Test
	public void testcase3()
	{

		String email = Excel.excelsheet("Sheet3",1,1);
		String pass = Excel.excelsheet("Sheet3",1,2);
	
		
		Loginpage l=new Loginpage(driver);
		l.signinbtn();
		l.emailaddress(email);
		l.passwordtb(pass);
		l.loginbtn();
	}

}
