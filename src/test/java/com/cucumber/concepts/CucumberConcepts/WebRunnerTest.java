package com.cucumber.concepts.CucumberConcepts;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created on 0007, July, 8.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html/", "json:target/json/output.json"},
        features = "src/test/resource",
        tags = {"@WebDriver"}
)
public class WebRunnerTest {
}
