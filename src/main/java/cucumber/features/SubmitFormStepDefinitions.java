package cucumber.features;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created on 0006, July, 6.
 */
public class SubmitFormStepDefinitions {

    WebDriver driver = null;

    @Given("^I am on the Ubuntu site$")
    public void iAmOnTheUbuntuSite() throws Throwable {
        System.setProperty("webdriver.chrome.driver","D:\\sk_down\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.ubuntu.ro/");
    }

    @When("^I navigate to contact$")
    public void iNavigateToContact() throws Throwable {
        driver.findElement(By.id("menu-item-25")).click();
    }

    @And("^I submit the form with valid data$")
    public void iSubmitTheFormWithValidData(DataTable table) throws Throwable {
// test to output datatable
//        System.out.println(table);

        List<List<String>> data = table.raw();
//        test if list is populated
        System.out.println(data.get(1).get(1));

        driver.findElement(By.name("22-nume")).sendKeys("John Doe");
        driver.findElement(By.name("22-email")).sendKeys("john@doe.com");
        driver.findElement(By.name("22-pagin%c4%83-web")).sendKeys("www.johndoe.com");
        driver.findElement(By.className("pushbutton-wide")).click();
    }

    @Then("^I check the the form has been submitted$")
    public void iCheckTheTheFormHasBeenSubmitted() throws Throwable {
        Assert.assertTrue(driver.getTitle().equals("Ubuntu România | Contacte"));
    }
}
