package scripts;

import org.testng.annotations.Test;

import POM.Homepage;
import POM.Loginpage;
import POM.Wishlist;
import generic.Basetest;
import generic.Excel;

public class Selectthedressfromwhislist extends Basetest {
	
	@Test
	public void testcase2()
	{

		String email = Excel.excelsheet("Sheet2",1,1);
		String pass = Excel.excelsheet("Sheet2",1,2);
		String dress = Excel.excelsheet("Sheet2",1,3);
		String name = Excel.excelsheet("Sheet2",1,4);
		
		Loginpage l=new Loginpage(driver);
		l.signinbtn();
		l.emailaddress(email);
		l.passwordtb(pass);
		l.loginbtn();
		Homepage h=new Homepage(driver);
		h.wishlistbtn();
		Wishlist w=new Wishlist(driver);
		w.nametxtbox(name);
		w.savebtn();
	}

}
