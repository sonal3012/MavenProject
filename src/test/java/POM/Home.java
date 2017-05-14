package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class Home {
	
		
	WebDriver driver;
	
	public Home(WebDriver driver)
	{
	this.driver=driver;
	}
	
		
	@FindBy(xpath="//span[text()='Home'][1]")
	@CacheLookup
	WebElement Homepath;
	
	@FindBy(xpath="//span[text()='My Account'][1]")
	@CacheLookup
	WebElement MyAccount;
	
	@FindBy(xpath="//span[text()='My Cart'][1]")
	@CacheLookup
	WebElement MyCart;
	
	@FindBy(xpath="//span[text()='Wishlist'][1]")
	@CacheLookup
	WebElement Wishlist;
	
	@FindBy(xpath="//span[text()='Log In'][1]")
	@CacheLookup
	WebElement Login;
	
	public void Homeclick()
	{
		Homepath.click();
	}
	
	public void MyAccountclick()
	{
		MyAccount.click();
		
	}

    public void MyCartclick()
    {
	
	MyCart.click();
	
	}
	
	public void Wishlistclick()
	{
		Wishlist.click();
	}
	
	public void Loginclick()
	{
	Login.click();
	}
	
	public String Browsertitle()
	{
	String title=driver.getTitle();
	
	return title;	
	}

	
	
	
	
}