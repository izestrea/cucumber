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
public class AdoptionPageTestSteps extends AbstractPageStepDef{

    WebDriver driver = getDriver();

   @Then("^I set the start date to \"([^\"]*)\"$")
    public void iSetTheStartDateTo(String dropItem) throws Throwable {
        Select dropDown = new Select(driver.findElement(By.id("start_select")));
        dropDown.selectByVisibleText(dropItem);
    }
}
