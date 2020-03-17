package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions
(
	features = "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\main\\resources\\feature\\TestScenario.feature",
	plugin = {"pretty", "html:reports/cucumber-html-report"},
	tags = {"@tc_01_reg, @tc_02_login, @tc_03_search, @tc_04_contactus, @tc_05_SubmitApplication, @tc_06_PhoneFinder, @tc_07_PrizeClaim, @tc_08_Games, @tc_09_Calender"},
	glue = {"com.StepDefinition"},
	monochrome = true
) 
public class TestRunner_softpedia 
{

}
