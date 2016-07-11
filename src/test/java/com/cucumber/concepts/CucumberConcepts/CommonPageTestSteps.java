package com.cucumber.concepts.CucumberConcepts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created on 0008, July, 8.
 */
public class CommonPageTestSteps extends AbstractPageStepDef{

    WebDriver driver = getDriver();

    @Given("^I am on test site$")
    public void I_am_on_test_site() throws Throwable {
        driver.navigate().to("http://www.thetestroom.com/webapp");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void I_click_on(String link) throws Throwable {
        driver.findElement(By.id(link.toLowerCase() + "_link")).click();
    }

    @Then("^I close the browser$")
    public void I_close_the_browser() throws Throwable {
        driver.quit();
    }


}
