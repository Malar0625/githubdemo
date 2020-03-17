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
	public void close_the_browser() throws Exception 
	{
		Thread.sleep(3000);
		pr.takeSnapShot("C:\\Users\\BLTuser.BLT215\\git\\githubdemo\\SoftPedia_Application\\src\\test\\resources\\Screenshot\\register.png");
		pr.quit();
	}
	

	
}
