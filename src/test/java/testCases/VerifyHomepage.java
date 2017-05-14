package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Factory.BrowserFactory;
import Factory.DataProviderFactory;
import POM.Home;

public class VerifyHomepage {
	
	WebDriver driver=BrowserFactory.getApplication("chrome");

@BeforeMethod
public void Openbrowser()
{
	String url = DataProviderFactory.getConfig().getApplicationUrl();
	driver.get(url);
}
	

@Test
	public void Homepage()
	{
	Home page = PageFactory.initElements(driver, Home.class); 		
	String title1= page.Browsertitle();
	Assert.assertEquals(title1, "Avactis Demo Store","Not Matched" );
	driver.close();
}

}
