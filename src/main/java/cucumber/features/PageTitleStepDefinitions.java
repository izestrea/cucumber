package cucumber.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageTitleStepDefinitions {

    WebDriver driver = null;

    @Given("^I am on Ubuntu website$")
    public void I_am_on_Ubuntu_website() throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\sk_down\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://ubuntu.ro/");
    }

    @When("^I navigate to Descopera Ubuntu$")
    public void I_navigate_to_Descopera_Ubuntu() throws Throwable {
        driver.findElement(By.id("menu-item-24")).click();
    }

    @Then("^I check page title is Descopera Ubuntu$")
    public void I_check_page_title_is_Descopera_Ubuntu() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Ubuntu România | Descoperă Ubuntu"));
    }

    @When("^I navigate to Obtine$")
    public void I_navigate_to_Obtine() throws Throwable {
        driver.findElement(By.id("menu-item-35")).click();
    }

    @Then("^I check page title is Obtine$")
    public void I_check_page_title_is_Obtine() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Ubuntu România | Obține"));
    }

    @When("^I navigate to Stiri$")
    public void I_navigate_to_Stiri() throws Throwable {
        driver.findElement(By.id("menu-item-31")).click();
    }

    @Then("^I check page title is Stiri$")
    public void I_check_page_title_is_Stiri() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Ubuntu România | Știri"));
    }

    @Then("^I close the browser$")
    public void I_close_the_browser() throws Throwable {
        driver.close();
    }
}
