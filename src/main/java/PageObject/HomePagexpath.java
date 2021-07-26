package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePagexpath {

	WebDriver driver;
	@FindBy(xpath = "//div[@id='onetrust-button-group']/button[contains(text(),'Accept Cookies')]")
	public WebElement cookie;

	@FindBy(xpath = "//div[contains(text(),'RIA')]")
	public WebElement advisor;
	
	/*@FindBy(xpath ="//ul[@id='searchNav']/li[@id='registerLoginLink']")
	public WebElement loginLink_Header;*/
	
	/*
	 * @FindBy(xpath ="//ul[@id='searchNav']/li[@id='registerLoginLink']") public
	 * WebElement loginLink_Header;
	 * 
	 * @FindBy(xpath = "//dd/input[contains(@name,'username')]") public WebElement
	 * first_Username_field;
	 */

	public HomePagexpath(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver, HomePagexpath.class);
		PageFactory.initElements(driver, this);

	}

}
