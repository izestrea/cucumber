package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StepDefinitions {
//    @Given("^I navigated to zoo website$")
//    public void shouldNavigateToZoo() throws Throwable {
//        System.out.println("executed navigate to zoo method");
//    }
//
//    @When("^I click on adoption link$")
//    public void shouldClickOnAdoption() throws Throwable {
//        System.out.println("executed the click on adoption link");
//    }
//
//    @When("^I click on check button$")
//    public void shouldClickOnCheckButton() throws Throwable {
//        System.out.println("executed the check button");
//    }
//
//    @Then("^I check to see that no animals are available$")
//    public void checkAnimalStringVisible() throws Throwable {
//        System.out.println("checked that the no animal string was visible or not");
//    }

    WebDriver driver = null;

    @Given("^I am on my zoo website$")
    public void shouldNavigateTooZooSite() throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\sk_down\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://ubuntu.ro/");
    }

    @When("^I click on the contact link$")
    public void shouldClickOnContactLink() throws Throwable {
        driver.findElement(By.id("menu-item-25")).click();
    }

    @When("^populate the contact form$")
    public void shouldPopulateContactForm() throws Throwable {
        driver.findElement(By.name("22-nume")).sendKeys("John Doe");
        driver.findElement(By.name("22-email")).sendKeys("john@doe.com");
        driver.findElement(By.name("22-pagin%c4%83-web")).sendKeys("www.johndoe.com");
        driver.findElement(By.className("pushbutton-wide")).click();
    }

    @Then("^I should be on the contact confirmation page$")
    public void checkOnContactConfirmationPage() throws Throwable {
        Assert.assertTrue("Not on contact confirmation page", driver.getTitle().equals("Ubuntu România | Contacte"));
    }
}
