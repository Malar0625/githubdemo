package com.StepDefinition;

import com.Pages.Page_Login;
import com.Pages.Page_Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Login 
{
	Page_Login pl=new Page_Login();
	
	@Given("^launch application$")
	public void launch_application() 
	{
		pl.LaunchBrowser();
	}
	@Then("^click the user icon and enter username password$")
	public void click_the_user_icon_and_enter_username_password()
	{
		pl.icon_credential();
	}

	@And("^click login button$")
	public void click_login_button() throws InterruptedException  
	{
		pl.login_button();
		Thread.sleep(3000);
		pl.Quit();
	}
}
