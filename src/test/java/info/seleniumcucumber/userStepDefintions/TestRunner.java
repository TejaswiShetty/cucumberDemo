package info.seleniumcucumber.userStepDefintions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Regression",
        features = "src/main/java/com/cucumber/features",
        glue = "com.cucumber.stepdef",
        plugin = { "html:target/cucumberHtmlReport","json:target/cucumber.json",
                    "pretty:target/cucumberpretty.txt","junit:target/results.txt"
                } 

        )
public class TestRunner {
}