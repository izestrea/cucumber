package com.cucumber.concepts.pageObject;

import com.cucumber.concepts.CucumberConcepts.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created on 0011, July, 11.
 */
public class LandingPage extends AbstractPage{

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public ContactPage navigateToContactPage (String link ) {
        driver.findElement(By.id(link.toLowerCase() + "_link")).click();
        return new ContactPage (driver);
    }
}
