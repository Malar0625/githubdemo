package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_NextPage 
{
	WebDriver driver;
	By nextpage=By.xpath("/html/body/div/div[2]/div[10]/div[9]/div[22]/div[8]/div/a[11]");
	By previouspage=By.xpath("//*[@id=\"sjmp\"]/div[9]/div[22]/div[8]/div/a[1]");
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\git\\githubdemo\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://linux.softpedia.com/");
	}
	
	public void Scroll_clicknext()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(nextpage).click();
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(previouspage).click();
	}
}


