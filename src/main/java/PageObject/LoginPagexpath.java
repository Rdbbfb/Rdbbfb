package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagexpath {
	
	WebDriver driver;
	@FindBy(xpath ="//ul[@id='searchNav']/li[@id='registerLoginLink']")
	public WebElement loginLink_Header;
	
	@FindBy(xpath = "//dd/input[contains(@name,'username')]")
	public WebElement first_Username_field;
	
	@FindBy(xpath = "//input[@id='password']")
	public WebElement password_Field;
	
	@FindBy(id="loginButton")
	public WebElement login_CTA_Btn;
	
	public LoginPagexpath(WebDriver driver) {
		
		this.driver=driver;
	   // PageFactory.initElements(driver, LoginPagexpath.class);
		 PageFactory.initElements(driver, this);
	}

}
