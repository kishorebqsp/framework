package scripts;

import org.testng.annotations.Test;

import POM.Cartpage;
import POM.Dresspage;
import POM.Homepage;
import POM.Loginpage;
import generic.Basetest;
import generic.Excel;

public class Validlogin extends Basetest {
	@Test
	public void testcase1()
	{
		String email = Excel.excelsheet("Sheet2",1,1);
		String pass = Excel.excelsheet("Sheet2",1,2);
		String dress = Excel.excelsheet("Sheet2",1,3);
		
		Loginpage l=new Loginpage(driver);
		l.signinbtn();
		l.emailaddress(email);
		l.passwordtb(pass);
		l.loginbtn();
Homepage h=new Homepage(driver);
h.searchbtn(dress);
h.serachbtnclick();
Dresspage d=new Dresspage(driver);
d.dressselected();
Cartpage c=new Cartpage(driver);
c.addtocart();


	
	}
}
