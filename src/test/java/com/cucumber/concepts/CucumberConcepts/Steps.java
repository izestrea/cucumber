package com.cucumber.concepts.CucumberConcepts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

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
}
