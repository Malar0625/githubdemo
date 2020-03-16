package com.StepDefinition;

import com.Pages.Page_PhoneFinder;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_phoneFinder {
	Page_PhoneFinder pf=new Page_PhoneFinder();
	@Given("^launch the Softpedia application in browser$")
	public void launch_the_Softpedia_application_in_browser()
	{
		pf.LaunchBrowser();
	}

	@Then("^scroll down to the page and click on find your phone$")
	public void scroll_down_to_the_page_and_click_on_find_your_phone() throws InterruptedException 
	{
		pf.phoneFinder();
	}
	@Then("^select brand flatform battery and availability$")
	public void select_brand_flatform_battery_and_availability() 
	{
		pf.filtering();
	}

	@And("^click go button$")
	public void click_go_button() 
	{
		pf.go();
		//pf.Quit();
	}


}