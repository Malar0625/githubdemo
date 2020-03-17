package com.StepDefinition;

import com.Pages.Page_Games;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_Games 
{
	Page_Games pg=new Page_Games();
	@Given("^launch the softpedia website$")
	public void launch_the_softpedia_website() 
	{
		pg.LaunchBrowser();
	}
	@Then("^click games tab$")
	public void click_games_tab() throws InterruptedException 
	{
		pg.GameTab();
	}
	@Then("^click side bar$")
	public void click_side_bar() 
	{
		pg.sidebar();
	}
	@And("^click the required game$")
	public void click_the_required_game() 
	{
		pg.SelectGame();
	}
}
