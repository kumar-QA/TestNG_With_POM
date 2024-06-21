package TestsPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.LoginPageClass;

public class LoginTestPage extends BaseTestPage{
	
	WebDriver driver;
	LoginPageClass lp; 
			
			
	@Test(priority = 2)
	public void VerifyLoginfunction() {
		driver=driverinitilization();
		lp=new LoginPageClass(driver);
		lp.performLogin("admin@yourstore.com", "admin");
		
		
	}

	
	@Test(priority = 1)
	public void VerifyWeAreLoginPage() {
		driver=driverinitilization();
		lp=new LoginPageClass(driver);
String actualValue =lp.getPageTitle();
String ExpecetedValue="Welcome, please sign in!";

Assert.assertEquals(actualValue, ExpecetedValue);
	}
}



