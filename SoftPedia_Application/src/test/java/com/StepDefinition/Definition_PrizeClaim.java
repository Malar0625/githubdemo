package com.StepDefinition;

import com.Pages.Page_PrizeClaim;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_PrizeClaim {
	Page_PrizeClaim pp=new Page_PrizeClaim();
	@Given("^launch the softpedia website in browser$")
	public void launch_the_softpedia_website_in_browser() 
	{
		pp.LaunchBrowser();
	}

	@Then("^click i named icon and Discounts and Giveaways$")
	public void click_i_named_icon_and_Discounts_and_Giveaways() 
	{
	pp.Discount_Giveaways();	
	}
	
	@And("^click submit & get license button$")
	public void click_submit_get_license_button() throws InterruptedException 
	{
		pp.submit_license();
	}


}

