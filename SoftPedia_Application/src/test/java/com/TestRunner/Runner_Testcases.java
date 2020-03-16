package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions
(
	features = "C:\\Users\\BLTuser.BLT215\\Desktop\\SoftPedia_Application\\src\\main\\resources\\feature\\TestScenario.feature",
	plugin = {"pretty", "html:reports/cucumber-html-report"},
	tags = {"@tc_01_reg, @tc_02_login, @tc_03_search, @tc_04_contactus"},
	glue = {"com.StepDefinition"},
	monochrome = true
) 
public class Runner_Testcases 
{
	
}

