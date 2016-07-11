package com.cucumber.concepts.CucumberConcepts;

import com.cucumber.concepts.pageObject.ContactConfirmPage;
import com.cucumber.concepts.pageObject.ContactPage;
import com.cucumber.concepts.pageObject.LandingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * Created on 0011, July, 11.
 */
public class StepDefinition extends AbstractPageStepDef {
    WebDriver driver = getDriver();
    LandingPage landingPage;
    ContactPage contactPage;
    ContactConfirmPage contactConfirmPage;

    @Given("^I am on the web site$")
    public void I_am_on_the_web_site() throws Throwable {
        landingPage = new LandingPage(driver);
        landingPage.navigateToWebApp();
    }

    @When("^I click on the \"([^\"]*)\"$")
    public void I_click_on_the(String link) throws Throwable {
        contactPage = landingPage.navigateToContactPage(link);
    }

    @And("^I enter \"([^\"]*)\" into the name field$")
    public void I_enter_into_the_name_field(String value) throws Throwable {
        contactPage.setNameField(value);
    }

    @And("^I enter \"([^\"]*)\" into the address field$")
    public void I_enter_into_the_address_field(String value) throws Throwable {
        contactPage.setAddressField(value);
    }

    @And("^I enter \"([^\"]*)\" into the poscode field$")
    public void I_enter_into_the_poscode_field(String value) throws Throwable {
        contactPage.setPostcodeField(value);
    }

    @And("^I enter \"([^\"]*)\" into the email field$")
    public void I_enter_into_the_email_field(String value) throws Throwable {
        contactPage.setEmailField(value);
    }

    @And("^I submit the contact form$")
    public void I_submit_the_contact_form() throws Throwable {
        contactConfirmPage = contactPage.submitForm();
    }

    @Then("^I check I am on the confirmation page$")
    public void I_check_I_am_on_the_confirmation_page() throws Throwable {
        Assert.assertTrue(contactConfirmPage.getPageTitle().contains("We have your message"));
    }

    @Then("^I close browser$")
    public void I_close_browser() throws Throwable {
        contactConfirmPage.closeDriver();
    }

    @And("^I populate the entire form$")
    public void iPopulateTheEntireForm() throws Throwable {
       contactPage
               .setNameField("name")
               .setAddressField("address")
               .setPostcodeField("postcode")
               .setEmailField("mail");
    }
}
