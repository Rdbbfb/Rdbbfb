package stepDefinations;

import java.io.IOException;
import java.util.Properties;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import BTLA.base;
import PageObject.HomePagexpath;
import PageObject.LoginPagexpath;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LALogin extends base {

	WebDriver driver = null;
	HomePagexpath home_Links;
	LoginPagexpath login_Links;

	@Given("I click on LA homepage")
	public void i_click_on_la_homepage() throws IOException {
		driver = initialiseDriver();
		driver.get("https://www.lordabbett.com/content/lordabbett/institutional/geo-selector.html");
	}

	@And("click on login button from homepage")
	public void click_on_login_button_from_homepage() {
		home_Links = new HomePagexpath(driver);
		home_Links.cookie.click();
		home_Links.advisor.click();
		login_Links = new LoginPagexpath(driver);
		login_Links.loginLink_Header.click();
		

	}

	@When("^I Enter (.*)in Finacial professional first text box$")
	public void ente_Username(String emailAddress) {

		login_Links.first_Username_field.sendKeys(emailAddress);
	}

	@And("^enter (.*) on second text field$")
	public void enter_Password(String Password) {
		login_Links.password_Field.sendKeys(Password);

	}

	@And("click on Login CTA button")
	public void click_on_login_cta_button() {
		login_Links.login_CTA_Btn.click();

	}

	@Then("I should be successfully able to login to the page")
	public void i_should_be_successfully_able_to_login_to_the_page() {

	}
}
