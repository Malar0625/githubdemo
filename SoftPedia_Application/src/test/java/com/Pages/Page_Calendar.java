package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Calendar 
{
	WebDriver driver;
	By cal_left=By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/a");
	By click_date=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[2]/div[17]/a");
	By click_news=By.xpath("/html/body/div[1]/div[2]/div[2]/div[18]/div[3]/h3/a");
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\git\\githubdemo\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://news.softpedia.com/newsArchive/");
	}
	public void select_mon_year()
	{
		driver.findElement(cal_left).click();
	}
	public void select_date()
	{
		driver.findElement(click_date).click();
	}
	public void Scroll_click()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(click_news).click();
	}
}
