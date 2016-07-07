package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created on 0006, July, 6.
 */
public class PageTitleStepDefinitions {

    WebDriver driver = null;
//Old code, that was improve
    @Given("^I am on Ubuntu website$")
    public void iAmOnUbuntuWebsite() throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\apps\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.ubuntu.ro/");
    }
// code improved by scenario outline data table
   /* @When("^I navigate to Descopera Ubuntu$")
    public void iNavigateToDescoperaUbuntu() throws Throwable {
        driver.findElement(By.id("menu-item-24")).click();
    }

    @Then("^I check page title is Descopera Ubuntu$")
    public void iCheckPageTitleIsDescoperaUbuntu() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Ubuntu România | Descoperă Ubuntu"));
    }

    @When("^I navigate to Obtine$")
    public void iNavigateToObtine() throws Throwable {
        driver.findElement(By.id("menu-item-35")).click();
    }

    @Then("^I check page title is Obtine$")
    public void iCheckPageTitleIsObtine() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Ubuntu România | Obține"));
    }

    @When("^I navigate to Stiri$")
    public void iNavigateToStiri() throws Throwable {
        driver.findElement(By.id("menu-item-31")).click();
    }

    @Then("^I check page title is Stiri$")
    public void iCheckPageTitleIsStiri() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Ubuntu România | Știri"));
    } */
    @When("^I navigate to ([^\"]*)$")
    public void iNavigateToLink(String link) throws Throwable {
        driver.findElement(By.id(link)).click();
    }
    @Then("^I check page title is ([^\"]*)$")
    public void iCheckPageTitleIsTitle(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }
    @Then("^I close the browser$")
    public void iCloseTheBrowser() throws Throwable {
        driver.close();
    }
//    code for testing scenario with parameters
    /*@Given("^I am on Ubuntu website$")
    public void I_am_on_Ubuntu_website() throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\sk_down\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.ubuntu.ro/");
    }

    @When("^I navigate to \"([^\"]*)\"$")
    public void I_navigate_to(String link) throws Throwable {
        driver.findElement(By.id(link)).click();
    }

    @Then("^I check page title is \"([^\"]*)\"$")
    public void I_check_page_title_is(String title) throws Throwable {
        Assert.assertTrue(driver.getTitle().contains(title));
    }

    @And("^I close the browser$")
    public void I_close_the_browser() throws Throwable {
        driver.close();
    }*/
}
