package com.StepDefinition;

import java.io.IOException;

import com.Pages.Page_Register;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Register 
{
	Page_Register pr=new Page_Register();
	
	@Given("^launch and registration$")
	public void launch_and_registration() throws IOException 
	{
		pr.registeration();
	}
	@And("^close the browser$")
	public void close_the_browser() throws IOException, InterruptedException 
	{
		Thread.sleep(3000);
		pr.quit();
	}

	
}
