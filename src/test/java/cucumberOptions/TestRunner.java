package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\admin\\eclipse-workspace\\BT\\src\\test\\resources\\Features\\Homepage.feature"},glue = {"stepDefinations"}, monochrome = true, plugin = {"pretty","html:target/HtmlReports"} )
public class TestRunner {

}
