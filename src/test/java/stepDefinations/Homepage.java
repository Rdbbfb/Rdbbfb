package stepDefinations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BTLA.base;
import PageObject.HomePagexpath;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Homepage extends base {

	WebDriver driver = null;
	

	@Given("Any browser")
	public void Verify_in_any_browser() throws IOException {
		driver = initialiseDriver();

	}

	@And("^give LA url$")
	public void Verify_la_url() {

		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {

		}

		System.out.println("Give LA url");
		//driver= passURLS();
		driver.get("https://www.lordabbett.com");
		/*HomePagexpath fts = new HomePagexpath(driver);
		fts.cookie.click();
		fts.advisor.click();
		driver.manage().window().maximize();
		System.out.println("Now in LA HomePage");
		// fts.loginLink_Header.click();*/

	}

	@When("I open the page")
	public void Verify_When_open_the_page() {
		System.out.println("Page loads and opens");

	}

	@Then("we should able to see Lordabbett homepage")
	public void Verify_lordabbett_homepage() {
		System.out.println("We could see LA homepage");
	}

}
