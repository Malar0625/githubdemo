package com.stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.pages.mainclass;
public class step_mainclass
{
	mainclass main = new mainclass();

	@Given("^the user launched the chrome browser$")
	public void launch_an_chrome_browser() 
	{
		main.launch_url();
	}
	
	@Then("^click the user login icon$")
	public void click_the_user_login_icon() throws InterruptedException 
	{
		main.login_icon();
	}
	@Then("^enter username and password then click login$")
	public void enter_username_and_password_then_click_login() throws InterruptedException
	{
		main.user_pass();
	}

	
}
