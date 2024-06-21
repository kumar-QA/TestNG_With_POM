package TestsPages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.DashboardPageclass;
import pageobjects.LoginPageClass;

public class DashboardTestPage extends BaseTestPage{
	WebDriver driver;
	LoginPageClass lp;
	DashboardPageclass dp;
		
	@Test
	public void VerifyDashboardPage() {
		driver=driverinitilization();
		lp=new LoginPageClass(driver);
		dp=new DashboardPageclass(driver);
	String ActualValue=lp.getPageTitle();
	String ExpectedValue="Welcome, please sign in!";
	Assert.assertEquals(ActualValue, ExpectedValue);
	lp.performLogin("admin@yourstore.com", "admin");
	String Expected="Dashboard / nopCommerce administration";
	String Actual=  dp.getPageTitleOfDashboard();
	Assert.assertEquals(Actual, Expected);	
	}
	
	@Test
	public void verifyLogoutFunction() {
		driver=driverinitilization();
		lp=new LoginPageClass(driver);
		dp=new DashboardPageclass(driver);
		lp.performLogin("admin@yourstore.com", "admin");
		dp.performLogout();
		String ActualValue=lp.getPageTitle();
		String ExpectedValue="Welcome, please sign in!";
		Assert.assertEquals(ActualValue, ExpectedValue);
		
	}
	
	
}
