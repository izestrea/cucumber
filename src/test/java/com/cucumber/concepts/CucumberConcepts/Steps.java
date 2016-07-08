package com.cucumber.concepts.CucumberConcepts;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

/**
 * Created on 0007, July, 7.
 */
public class Steps {
    @Given("^This is my first dummy given step$")
    public void This_is_my_first_dummy_given_step() throws Throwable {
        System.out.println("Executed the first given step");
    }

    @When("^This is my second dummy given step$")
    public void This_is_my_second_dummy_given_step() throws Throwable {
        System.out.println("Executed the second when step");
    }

    @Then("^This is my third dummy given step$")
    public void This_is_my_third_dummy_given_step() throws Throwable {
        System.out.println("Executed the third then step");
    }
    @Then("^This is my third dummy given step2$")
    public void This_is_my_third_dummy_given_step2() throws Throwable {
        Assert.assertFalse(true);
    }

    @Given("^I have opened a \"([^\"]*)\" window$")
    public void openAWindow(String window) throws Throwable {
        System.out.println("Opened a window for " + window);
    }

    @When("^I click on some link$")
    public void clickOnLink() throws Throwable {
        System.out.println("Click on link");
    }

    @Then("^A new window opens$")
    public void checkWindowOpens() throws Throwable {
        System.out.println("Window should be open");
    }
}
