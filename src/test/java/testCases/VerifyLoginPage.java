package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import POM.LogInPage;



public class VerifyLoginPage {
	
	WebDriver driver=BrowserFactory.getApplication("chrome");

@BeforeMethod
public void Openbrowser()
{
	String url = DataProviderFactory.getConfig().getApplicationUrl();
	driver.get(url);
}

@Test
public void Loginpage()
{
	
LogInPage login = PageFactory.initElements(driver, LogInPage.class); 

String Id = DataProviderFactory.getexcel().getData(1,0);
String pass = DataProviderFactory.getexcel().getData(1,1);
//System.out.println("Value of Id" +Id);
//System.out.println("Value of password" +pass);

//login.Loginclick("sona.3012@gmail.com","sonal123");
login.Loginclick(Id,pass);

Assert.assertEquals(login.Logoutvalue(),"LOG OUT","Not matched");
login.Logoutclick();
}

@AfterMethod

public void closebrowser()
{
	driver.close();
	
}
}
