package com.StepDefinition;

import com.Pages.Page_ContactUs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_ContactUs 
{
	Page_ContactUs pc=new Page_ContactUs();
	
	@Given("^launch the browser$")
	public void launch_the_browser() 
	{
		pc.LaunchBrowser();
	}

	@Then("^click i named icon and contact us$")
	public void click_i_named_icon_and_contact_us() 
	{
		pc.contactus();
	}

	@Then("^click radio button from the list$")
	public void click_radio_button_from_the_list() 
	{
		pc.radiobutton();
	}

	@Then("^enter a message and mail id$")
	public void enter_a_message_and_mail_id() 
	{
		pc.message_email();
	}

	@And("^click send button$")
	public void click_send_button() throws InterruptedException 
	{
		pc.send_button();
		Thread.sleep(3000);
		pc.Quit();
	}
}
