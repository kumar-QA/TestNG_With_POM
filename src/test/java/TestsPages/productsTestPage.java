package TestsPages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pageobjects.DashboardPageclass;
import pageobjects.LoginPageClass;
import pageobjects.ProductPageclass;

public class productsTestPage extends BaseTestPage {
WebDriver driver;
LoginPageClass lp;
DashboardPageclass dp;
ProductPageclass pp;
	
@BeforeMethod
public void start() throws InterruptedException {
	driver=driverinitilization();
    lp=new LoginPageClass(driver);
    dp=new DashboardPageclass(driver);
    pp=new ProductPageclass(driver);
    lp.performLogin("admin@yourstore.com", "admin");
    Thread.sleep(2000);
    dp.clickOnCatalogLink();
    Thread.sleep(2000);
    dp.clickOnproductLink();
}

@AfterMethod
public void close() {
	driver.close();
}

	@Test
	public void verifySearchProduct() throws InterruptedException {
		  pp.searchProduct("Build your own computer");   
	}
	
	
	@Test
	public void verifyProductPage() throws InterruptedException {
		      pp.verifyproductsPageTitle();  
	}
}
