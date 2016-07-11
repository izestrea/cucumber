package com.cucumber.concepts.pageObject;

import com.cucumber.concepts.CucumberConcepts.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created on 0011, July, 11.
 */
public class ContactPage extends AbstractPage {

    public ContactPage(WebDriver driver) {
        super(driver);
    }

    public ContactPage setNameField(String value) {
        driver.findElement(By.name("name_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactPage setAddressField(String value) {
        driver.findElement(By.name("address_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactPage setPostcodeField(String value) {
        driver.findElement(By.name("postcode_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactPage setEmailField(String value) {
        driver.findElement(By.name("email_field")).sendKeys(value);
        return new ContactPage(driver);
    }

    public ContactConfirmPage submitForm() {
        driver.findElement(By.id("submit_message")).click();
        return new ContactConfirmPage(driver);
    }
}
