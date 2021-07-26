package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	WebDriver driver= null;
	@FindBy(id = "email") // FindBy annotation used to pass element with below syntx
	private WebElement emailTextBox; // it is private variable emailTextBox
	@FindBy(id="pass")
	private WebElement passwordTextBox;
	@Given("facebook homepage")
	public void facebook_homepage() {

		String path= System.getProperty("user.dir");
		System.out.println("project path: "+path);

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\BT\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@When("^I check for the login in step with (.*) and (.*)$")
	public void i_check_for_the_login(String name,String password) {
		System.out.println("Give LA url");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		Login  fts= PageFactory.initElements(driver,Login.class);
		fts.emailTextBox.sendKeys(name);
		fts.passwordTextBox.sendKeys(password);
		//fts.emailTextBox.sendKeys(name);//After sending it will append in textbox abc@gmail.comtest1234	

	}

	@Then("Login successfull")
	public void login_successfull() {
		System.out.println("Login successful");
	}

}
