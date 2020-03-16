package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_ContactUs 
{
	WebDriver driver;
	//By click_i_icon=By.xpath("//*[@id=\"navicos\"]/li[2]");
	//By click_contactus=By.linkText("Contact Us");
	By click_radiobutton=By.xpath("/html/body/div/div[2]/div/div[2]/form/p/span[2]/b");
	By message=By.xpath("//*[@id=\"ctf_message_1\"]");
	By email=By.xpath("//*[@id=\"ctf_email_1\"]");
	By click_send=By.xpath("//*[@id=\"spradio_ctf_1\"]/button");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void contactus()
	{
		driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[2]")).click();;
		WebElement a=driver.findElement(By.linkText("Contact Us"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
	}
	public void radiobutton()
	{
		driver.findElement(click_radiobutton).click();
	}
	public void message_email()
	{
		driver.findElement(message).sendKeys("helloooo");
		driver.findElement(email).sendKeys("malarvizhimarie@gmail.com");
	}
	public void send_button()
	{
		driver.findElement(click_send).click();
	}
	public void Quit()
	{
		driver.close();
	}
}
