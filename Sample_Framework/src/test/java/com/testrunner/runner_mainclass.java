package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runner_mainclass 
{


@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/main/resources/features/testscenario.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc_01_reg"},
		glue = {"com.StepDefinition"},
		monochrome = true
)
public class mainclass
{
	
}

}
