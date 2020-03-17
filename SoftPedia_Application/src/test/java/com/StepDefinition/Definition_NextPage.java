package com.StepDefinition;

import com.Pages.Page_NextPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_NextPage 
{
	Page_NextPage next=new Page_NextPage();
	@Given("^Launch the application for nextpage$")
	public void launch_the_application_for_nextpage()
	{
		next.LaunchBrowser();
	}
	@Then("^Scroll Down and click next page$")
	public void scroll_Down_and_click_next_page()
	{
		next.Scroll_clicknext();
	}
}
