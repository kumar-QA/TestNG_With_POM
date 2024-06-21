package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPageclass {

	WebDriver driver;
	public ProductPageclass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="SearchProductName")
	WebElement productNameFiled;
	
	@FindBy(id="search-products")
	WebElement searchBtn;
	public void searchProduct(String pname) {
		productNameFiled.sendKeys(pname);
		searchBtn.click();
		
	}
	public String verifyproductsPageTitle() {
		return driver.getTitle();
	}
}
