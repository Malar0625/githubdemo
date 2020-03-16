package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Login 
{
	WebDriver driver;
	By click_user_icon=By.xpath("//*[@id=\"navicos\"]/li[3]");
	By email=By.id("_lu");
	By password=By.id("_lp");
	By login=By.xpath("//*[@id=\"spovl1\"]/div/div/form/input[3]");
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void icon_credential()
	{
		driver.findElement(click_user_icon).click();
		driver.findElement(email).sendKeys("malarvizhimarie@gmail.com");
		driver.findElement(password).sendKeys("123456789");
		
	}
	public void login_button()
	{
		driver.findElement(login).click();
	}
	public void Quit()
	{
		driver.close();
	}
}
