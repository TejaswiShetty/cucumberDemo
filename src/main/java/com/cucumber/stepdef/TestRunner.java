package com.cucumber.stepdef;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags = "@Regression",
        features = "src/main/java/com/cucumber/features",
        glue = "com.cucumber.stepdef",
        plugin = { "html:target/cucumberHtmlReport",
                    "pretty",
                } 

        )
public class TestRunner {
}