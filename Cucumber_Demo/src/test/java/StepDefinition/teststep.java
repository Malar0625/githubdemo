package StepDefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class teststep {
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\selenium\\\\drive\\\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(5000);
	}
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.get("https://www.google.com/");
	}
	@Then("^I verify that the page displays search text box")
	public void verify_textbox() throws InterruptedException           
	{
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
		Thread.sleep(5000);
		txtbox.sendKeys("testcase");
	

	}
	}
	@Then("^i verify that text is entered and searched$")
	public void verify_search() throws InterruptedException
	{
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).sendKeys(Keys.ENTER);
	   
	}
	@And("^clicks the submit button$")
	public void display_searchbutton()
	{

	System.out.println("The page displays Google Search Button");

	}

	
}

