package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {
	@FindBy(id="name")
	private WebElement nametb;
	
	@FindBy(id="submitWishlist")
	private WebElement savetb;
	
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void nametxtbox(String name)
	{
		nametb.sendKeys(name);
	}
	
	public void savebtn()
	{
		savetb.click();
	}

}
