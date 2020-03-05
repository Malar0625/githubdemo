package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class TestRunner 
{
/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(features="features/testcase.feature", glue="StepDefinition")
	public class Testrunner_googlehomepage
	{
		
	}

	
}

