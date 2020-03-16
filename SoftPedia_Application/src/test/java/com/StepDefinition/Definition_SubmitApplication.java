package com.StepDefinition;

import com.Pages.Page_ContactUs;
import com.Pages.Page_SubmitApplication;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_SubmitApplication 
{
	Page_SubmitApplication ps=new Page_SubmitApplication();

	@Given("^launch browser$")
	public void launch_browser()
	{
		ps.LaunchBrowser();
	}

	@Then("^click i named icon and submit application$")
	public void click_i_named_icon_and_submit_application() 
	{
		ps.SubmitApplication();
	}

	@Then("^click submit form$")
	public void click_submit_form() 
	{
		ps.submit_form();
	}

	@And("^Handle the alert message$")
	public void handle_the_alert_message() throws InterruptedException 
	{
	ps.alert_handle();	
	}



}

