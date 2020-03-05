package com.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runner_search 
{

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/main/resources/features/testcase.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc_02_search"},
		glue = {"com.stepdefinition"},
		monochrome = true
)
public class search
{
	
}
}
