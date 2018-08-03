package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basetest implements constant{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(key,value);
		 driver=new ChromeDriver();
		String url = Excel.excelsheet("Sheet2",1,0);
		driver.get(url);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
