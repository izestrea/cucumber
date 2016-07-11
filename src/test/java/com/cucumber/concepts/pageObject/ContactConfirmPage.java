package com.cucumber.concepts.pageObject;

import com.cucumber.concepts.CucumberConcepts.AbstractPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created on 0011, July, 11.
 */
public class ContactConfirmPage extends AbstractPage{
    public ContactConfirmPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle(){
        return driver.findElement(By.cssSelector(".content h1")).getText();
    }
}
