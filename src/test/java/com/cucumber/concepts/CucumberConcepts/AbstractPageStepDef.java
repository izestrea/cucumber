package com.cucumber.concepts.CucumberConcepts;

import com.cucumber.concepts.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created on 0008, July, 8.
 */
public class AbstractPageStepDef {
    protected static WebDriver driver;

    protected WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver","D:\\apps\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }
}
