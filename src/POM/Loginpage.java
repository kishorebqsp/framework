package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(linkText="Sign in")
	private WebElement sign;
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement signbtn;
	
	

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void signinbtn()
	{
		sign.click();
}
	
	public void emailaddress(String username)
	{
		 email.sendKeys(username);
	}
	
	public void passwordtb(String passwordq)
	{
		password.sendKeys(passwordq);
	}
	public void loginbtn()
	{
		signbtn.click();
	}}
