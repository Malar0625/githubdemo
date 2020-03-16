package com.StepDefinition;

import com.pages.Page_Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition_Register 
{
	Page_Register register=new Page_Register();
	
	@Given("^launch the chrome browser$")
	public void launch_the_chrome_browser()
	{
		register.launchurl();
	}
	@Then("^click the sign in option and enter mailid$")
	public void click_the_sign_in_option_and_enter_mailid()
	{
		register.signin();
	}
	@And("^click create an account$")
	public void click_create_an_account()
	{
		register.create();
	}
}
