package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class LogInPage {
	
		
	WebDriver driver;
	
	public LogInPage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	@FindBy(xpath="(//span[@class='hidden-xs'])[5]")
	@CacheLookup
	WebElement Login;
	
		
	@FindBy(xpath="//span[text()=' Log Out']")
	@CacheLookup
	WebElement LogOut;
	
	@FindBy(how=How.ID,using="account_sign_in_form_email_id")
	@CacheLookup
	WebElement EmailId;
	
	@FindBy(how=How.ID,using="account_sign_in_form_passwd_id")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath="//input[@value='Log In']")
	@CacheLookup
	WebElement LogInbutton;
	
	
	
	
	public void Loginclick(String uid,String pass)
	//public void Loginclick()
	{
	System.out.print("executed");
	Login.click();
	EmailId.sendKeys(uid);
	Password.sendKeys(pass);
	LogInbutton.click();
	
	}
	
	public String Logoutvalue()
	{

	String textname = LogOut.getText();
		return textname;
		
	}
	
	public void Logoutclick()
	{
	
	LogOut.click();
	
}
}
	
