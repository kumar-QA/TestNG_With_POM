package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPageclass {
	
	WebDriver driver;
	public DashboardPageclass(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath = "(//p[contains(text(),'Catalog')])[1]")
	WebElement catalogLink;
	
	@FindBy(xpath = "//a[@href=\"/Admin/Product/List\"]")
	WebElement productLink;
	
	@FindBy(xpath = "//a[@href=\"/Admin/Category/List\"]")
	WebElement categoryLink;
		
	@FindBy(xpath = "//a[@href=\"/Admin/Manufacturer/List\"]")
	WebElement ManufacturerLink;
	
	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
	WebElement logoutBtn;
	
	
	public void performLogout() {
		logoutBtn.click();
		
	}
	
	public void clickOnCatalogLink() {
		catalogLink.click();
	}
	
	public void clickOncategoryLink() {
		categoryLink.click();
	}
	public void clickOnproductLink() {
		productLink.click();
	}
	public void clickOnManufacturerLink() {
		ManufacturerLink.click();
	}
	
	public String getPageTitleOfDashboard() {
		  return driver.getTitle();
	}

	
	

}
