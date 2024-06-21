package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageClass {
  WebDriver driver;
  //declare webdriver driver without initilization 
  //why because driver is getting from testpage to this page
  
  public LoginPageClass(WebDriver driver){
	  this.driver=driver;//assigning local varible to global variable
	  PageFactory.initElements(driver, this);
	  //pageFactor is predefined class which is used to recogning objectrepsiotry
  } 
  //inside constructor on parameter should be passed that is webdriver 
  //getting form LoginTestPage
  
	@FindBy(id="Email")
	 WebElement usernameFiled;
	//@FindBy is annotation which is used to find the element 
	
	@FindBy(name="Password")
	WebElement  passwordFiled;
	
	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	@FindBy(xpath = "//strong[contains(text(),'Welcome, please sign in!')]")
	WebElement pageTitle;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	WebElement rembermeCheckbox;
	
	public String getPageTitle() {
		return pageTitle.getText();
	}
		
	public void performLogin(String uname,String pwd) {
		usernameFiled.clear();
		usernameFiled.sendKeys(uname);
		passwordFiled.clear();
	     passwordFiled.sendKeys(pwd);
	     loginBtn.click();
	     
	}
	
	public void clickoncheckBox() {
		rembermeCheckbox.click();
	}
}









