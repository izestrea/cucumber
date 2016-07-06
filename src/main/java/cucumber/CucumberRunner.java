package cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty", "json:target/cucumber.json"},
		features = {"src/cucumber/"}
		)
public class CucumberRunner {

}
