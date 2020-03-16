package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Register 
{
	WebDriver driver;
	By emailid=By.name("email_create");
	By createacc=By.xpath("//*[@id=\"SubmitCreate\"]/span");
	
	public void launchurl()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\Logo_Shop_Automation\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
	
	public void signin()
	{
		
		driver.findElement(emailid).sendKeys("automationpracticeselenium@gmail.com");
		
	}
	public void create() 
	{
		driver.findElement(createacc).click();
	
	}
}

