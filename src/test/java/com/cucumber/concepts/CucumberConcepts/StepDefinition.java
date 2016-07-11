package com.cucumber.concepts.CucumberConcepts;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created on 0011, July, 11.
 */
public class StepDefinition extends AbstractPageStepDef{
    WebDriver driver = getDriver();

    @Given("^I am on the web site$")
    public void I_am_on_the_web_site() throws Throwable {
//        driver.navigate().to("http://www.thetestroom.com/webapp/");
    }

    @When("^I click on the \"([^\"]*)\"$")
    public void I_click_on_the(String link) throws Throwable {
//        driver.findElement(By.id(link.toLowerCase() + "_link")).click();
    }

    @And("^I enter \"([^\"]*)\" into the name field$")
    public void I_enter_into_the_name_field(String value) throws Throwable {
//        driver.findElement(By.name("name_field")).sendKeys(value);
    }

    @And("^I enter \"([^\"]*)\" into the address field$")
    public void I_enter_into_the_address_field(String value) throws Throwable {
//        driver.findElement(By.name("address_field")).sendKeys(value);
    }

    @And("^I enter \"([^\"]*)\" into the poscode field$")
    public void I_enter_into_the_poscode_field(String value) throws Throwable {
//        driver.findElement(By.name("postcode_field")).sendKeys(value);
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void I_enter_into_the_email_field(String value) throws Throwable {
//        driver.findElement(By.name("email_field")).sendKeys(value);
    }

    @And("^I submit the contact form$")
    public void I_submit_the_contact_form() throws Throwable {
//        driver.findElement(By.id("submit_message")).click();
    }

    @Then("^I check I am on the confirmation page$")
    public void I_check_I_am_on_the_confirmation_page() throws Throwable {
//        Assert.assertTrue(driver.findElement(By.cssSelector(".content h1")).getText().contains("We have your message"));
    }

    @Then("^I close browser$")
    public void I_close_browser() throws Throwable {
        driver.quit();
    }
}
