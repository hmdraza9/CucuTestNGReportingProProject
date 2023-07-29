package com.app.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@tag1", features = {"src/test/resources/features"}, glue = {"com.app.stepDefs","com.app.Hooks"},
plugin = {"pretty"
		,"html:target/cucumber-reports.html"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		},
monochrome=true)
public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
	
}
// add in readme, what files added for extent reporting xml, props etc, same for logging also, log4j