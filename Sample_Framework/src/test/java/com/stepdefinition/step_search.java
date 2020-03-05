package com.stepdefinition;

import com.pages.Search;
import com.pages.mainclass;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class step_search 
{
	Search search1= new Search();

	@Given("^the user launched the chrome $")
	public void the_user_launched_the_chrome() 
	{
		search1.launch_url();
	}
	@When("^the user enter the search product$")
	public void the_user_enter_the_search_product () throws InterruptedException 
	{
		search1.select_car();
	}

	@Then("^select the car from dropdown list$")
	public void select_the_car_from_dropdown_list() throws InterruptedException 
	{
		search1.dropdown();
	}
	@Then("^the user select the version$")
	public void the_user_select_the_version() throws InterruptedException
	{
		search1.select_version();
	}
	@Then("^the user select the city$")
	public void the_user_select_the_city() throws InterruptedException
	{
		search1.select_city();
	}
	@Then("^click the offer button $")
	public void click_the_offer_button () throws InterruptedException
	{
		search1.click_offer();
	}
	
}
