package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="search_query_top")
	private WebElement search;
	
	@FindBy(name="submit_search")
	private WebElement searchbtn;
	
	
	@FindBy(xpath="//span[.='My wishlists']")
	private WebElement wishlist;
	

	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	

	public void searchbtn(String dress)
	{
		search.sendKeys(dress);
	}
	
	public void serachbtnclick()
	{
		searchbtn.click();
	}
	public void wishlistbtn()
	{
		 wishlist.click();
	}
}
