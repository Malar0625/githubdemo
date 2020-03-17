package com.StepDefinition;

import com.Pages.Page_Calendar;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Calendar 
{
	Page_Calendar pcal=new Page_Calendar();
	
	@Given("^Launch the browser for calendar$")
	public void launch_the_browser_for_calendar() 
	{
		pcal.LaunchBrowser();
	}

	@Then("^Select month and year$")
	public void select_month_and_year() 
	{
		pcal.select_mon_year();
	}

	@Then("^Select the date$")
	public void select_the_date() 
	{
		pcal.select_date();
	}

	@And("^Scroll and click any news$")
	public void scroll_and_click_any_news() 
	{
		pcal.Scroll_click();
	}
}
