package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Search 
{
	WebDriver driver;
	public void launch_url()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\drive\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.carwale.com/?utm_source=google&utm_medium=cpc&utm_term=carwale&utm_campaign=6038662&gclid=CjwKCAiAnfjyBRBxEiwA-EECLDLnFEzGxH53BWyNk2NRFlsFTjv2JWv8iMFQi74MAYo95hr2vRmuCBoCjecQAvD_BwE");
		System.out.println(driver.getTitle());
	}
	public void select_car()
	{
		driver.findElement(By.id("newCarsList")).sendKeys("bmw");
	}
	public void dropdown()
	{
		WebElement a=driver.findElement(By.xpath("//*[@id=\"newCarsList\"]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"ui-id-70\"]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(a);
		action.moveToElement(b).click().perform();
	}
	public void select_version()
	{
		//driver.findElement(By.className("selectcustom-input selected-version__name"));
		Select version=new Select(driver.findElement(By.className("selectcustom-input selected-version__name")));
		version.selectByValue("sDrive20d xLine");
	}
	public void select_city()
	{
		driver.findElement(By.xpath("//*[@id=\"divModelDesc\"]/div[2]/div[2]/div/div/div/span")).click();
		WebElement a=driver.findElement(By.xpath("//*[@id=\"askLocation_365\"]/div/div[1]/input"));
		a.sendKeys("pondicherry");
		WebElement b=driver.findElement(By.xpath("//*[@id=\"ui-id-215\"]"));
		Actions action=new Actions(driver);
		action.moveToElement(a);
		action.moveToElement(b).click().perform();
		driver.findElement(By.id("ctaClick")).click();
	}
	public void click_offer()
	{
		driver.findElement(By.className("btn btn-orange font16 getLeadAssistance")).click();
	}
	
}


