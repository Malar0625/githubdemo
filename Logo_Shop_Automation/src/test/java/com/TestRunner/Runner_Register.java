package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Runner_Register 
{

@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src/main/resources/features/testscenario.feature",
		plugin = {"pretty", "html:reports/cucumber-html-report"},
		tags = {"@tc_01_reg"},
		glue = {"com.stepdefinition"},
		monochrome = true
)
public class Page_Register
{
	
}

}


