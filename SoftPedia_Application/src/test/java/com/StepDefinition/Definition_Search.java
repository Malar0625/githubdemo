package com.StepDefinition;

import java.io.File;

import org.junit.Assert;

import com.Pages.Page_Search;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Search 
{
	Page_Search ps=new Page_Search();
	
	@Given("^launch the softpedia application$")
	public void launch_the_softpedia_application() 
	{
		ps.LaunchBrowser();
	}

	@Then("^Enter the word for search$")
	public void enter_the_word_for_search() throws Throwable 
	{
		ps.Search();
	}

	@Then("^Click go button$")
	public void click_go_button() throws Throwable 
	{
		ps.gobutton();
	}

	@Then("^download the application$")
	public void download_the_application() throws InterruptedException 
	{
		
		ps.download();
		Thread.sleep(5000);
		//ps.Quit();
	}
	@And("^Check file is exist or not$")
	public void Check_file_is_exist_or_not() throws InterruptedException
	{
		ps.check_file();
		Thread.sleep(3000);
		ps.Quit();
	}
	
}
