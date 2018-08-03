package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {
	@FindBy(name="Submit")
	private WebElement cart;
	
	
	
	
	
	
	
	@FindBy(xpath="//span[@title='Close window']")
	private WebElement close;
	
	public Cartpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	
	public void addtocart()
	{
		cart.click();
	}
	
	public void closebtn()
	{
		close.click();
	}
}


