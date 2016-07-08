package com.cucumber.concepts.CucumberConcepts;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created on 0008, July, 8.
 */
public class PageTestSteps {

    WebDriver driver = null;

    @Given("^I am on test site$")
    public void I_am_on_test_site() throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\apps\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.thetestroom.com/webapp");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void I_click_on(String link) throws Throwable {
        driver.findElement(By.id(link.toLowerCase() + "_link")).click();
    }

    @Then("^I populate the contact form$")
    public void I_populate_the_contact_form() throws Throwable {
        driver.findElement(By.name("name_field")).sendKeys("name test");
        driver.findElement(By.id("rdona")).click();
        driver.findElement(By.id("cadop")).click();
    }

    @Then("^I set the start date to \"([^\"]*)\"$")
    public void iSetTheStartDateTo(String dropItem) throws Throwable {
        Select dropDown = new Select(driver.findElement(By.id("start_select")));
        dropDown.selectByVisibleText(dropItem);
    }

    @Then("^I close the browser$")
    public void I_close_the_browser() throws Throwable {
        driver.quit();
    }


}
