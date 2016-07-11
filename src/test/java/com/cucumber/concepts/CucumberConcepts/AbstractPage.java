package com.cucumber.concepts.CucumberConcepts;

import com.cucumber.concepts.pageObject.LandingPage;
import org.openqa.selenium.WebDriver;

/**
 * Created on 0011, July, 11.
 */
public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage (WebDriver driver){
        this.driver = driver;
    }

    public LandingPage navigateToWebApp(){
        driver.navigate().to("http://www.thetestroom.com/webapp/");
        return new LandingPage(driver);
    }

    public void closeDriver(){
        driver.quit();
    }
}
