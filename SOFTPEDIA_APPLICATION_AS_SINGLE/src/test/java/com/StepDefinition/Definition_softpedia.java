package com.StepDefinition;

import java.io.IOException;

import com.Pages.Page_softpedia;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Definition_softpedia 
{
	Page_softpedia soft=new Page_softpedia();
	
	//REGISTER
	@Given("^launch and registration$")
	public void launch_and_registration() throws IOException 
	{
		soft.registeration();
	}
	@And("^close the browser$")
	public void close_the_browser() throws Exception 
	{
		Thread.sleep(3000);
		soft.quit();
	}
	
	//LOGIN
	@Given("^launch application$")
	public void launch_application() 
	{
		soft.Login_Launch_Browser();
	}
	@Then("^click the user icon and enter username password$")
	public void click_the_user_icon_and_enter_username_password()
	{
		soft.icon_credential();
	}

	@And("^click login button$")
	public void click_login_button() throws InterruptedException  
	{
		soft.login_button();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//SEARCHING
	@Given("^launch the softpedia application$")
	public void launch_the_softpedia_application() 
	{
		soft.Search_Launch_Browser();
	}

	@Then("^Enter the word for search$")
	public void enter_the_word_for_search() throws Throwable 
	{
		soft.Search();
	}

	@Then("^Click go button$")
	public void clickgo_button() throws Throwable 
	{
		soft.gobutton();
	}

	@Then("^download the application$")
	public void download_the_application() throws InterruptedException 
	{
		
		soft.download();
		Thread.sleep(5000);
		
	}
	@And("^Check file is exist or not$")
	public void Check_file_is_exist_or_not() throws InterruptedException
	{
		soft.check_file();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//CONTACT US
	@Given("^launch the browser$")
	public void launch_the_browser() 
	{
		soft.Contactus_Launch_Browser();
	}

	@Then("^click i named icon and contact us$")
	public void click_i_named_icon_and_contact_us() 
	{
		soft.contactus();
	}

	@Then("^click radio button from the list$")
	public void click_radio_button_from_the_list() 
	{
		soft.radiobutton();
	}

	@Then("^enter a message and mail id$")
	public void enter_a_message_and_mail_id() 
	{
		soft.message_email();
	}

	@And("^click send button$")
	public void click_send_button() throws InterruptedException 
	{
		soft.send_button();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//SUBMIT APPLICATION
	@Given("^launch browser$")
	public void launch_browser()
	{
		soft.Submitapp_Launch_Browser();
	}

	@Then("^click i named icon and submit application$")
	public void click_i_named_icon_and_submit_application() 
	{
		soft.SubmitApplication();
	}

	@Then("^click submit form$")
	public void click_submit_form() 
	{
		soft.submit_form();
	}

	@And("^Handle the alert message$")
	public void handle_the_alert_message() throws InterruptedException 
	{
		soft.alert_handle();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//PHONE FINDER
	@Given("^launch the Softpedia application in browser$")
	public void launch_the_Softpedia_application_in_browser()
	{
		soft.Phonefinder_Launch_Browser();
	}

	@Then("^scroll down to the page and click on find your phone$")
	public void scroll_down_to_the_page_and_click_on_find_your_phone() throws InterruptedException 
	{
		soft.phoneFinder();
	}
	@Then("^select brand flatform battery and availability$")
	public void select_brand_flatform_battery_and_availability() 
	{
		soft.filtering();
	}

	@And("^click go button$")
	public void click_go_button() throws InterruptedException 
	{
		soft.go();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//PRIZE CLAIM
	@Given("^launch the softpedia website in browser$")
	public void launch_the_softpedia_website_in_browser() 
	{
		soft.Prize_claim_Launch_Browser();
	}

	@Then("^click i named icon and Discounts and Giveaways$")
	public void click_i_named_icon_and_Discounts_and_Giveaways() 
	{
		soft.Discount_Giveaways();	
	}
	
	@And("^click submit & get license button$")
	public void click_submit_get_license_button() throws InterruptedException 
	{
		soft.submit_license();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//GAME
	@Given("^launch the softpedia website$")
	public void launch_the_softpedia_website() 
	{
		soft.Game_Launch_Browser();
	}
	@Then("^click games tab$")
	public void click_games_tab() throws InterruptedException 
	{
		soft.GameTab();
	}
	@Then("^click side bar$")
	public void click_side_bar() 
	{
		soft.sidebar();
	}
	@And("^click the required game$")
	public void click_the_required_game() throws InterruptedException 
	{
		soft.SelectGame();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//CALENDAR
	@Given("^Launch the browser for calendar$")
	public void launch_the_browser_for_calendar() 
	{
		soft.Calendar_Launch_Browser();
	}

	@Then("^Select month and year$")
	public void select_month_and_year() 
	{
		soft.select_mon_year();
	}

	@Then("^Select the date$")
	public void select_the_date() 
	{
		soft.select_date();
	}

	@And("^Scroll and click any news$")
	public void scroll_and_click_any_news() throws InterruptedException 
	{
		soft.Scroll_click();
		Thread.sleep(3000);
		soft.quit();
	}
	
	//NEXT PAGE
	@Given("^Launch the application for nextpage$")
	public void launch_the_application_for_nextpage()
	{
		soft.Nextpage_Launch_Browser();
	}
	@Then("^Scroll Down and click next page$")
	public void scroll_Down_and_click_next_page() throws InterruptedException
	{
		soft.Scroll_clicknext();
		Thread.sleep(3000);
		soft.quit();
	}
}

	
	



