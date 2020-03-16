package com.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Page_PhoneFinder {
	WebDriver driver;
	By phone_finder=By.xpath("/html/body/div[1]/div[2]/div/div[20]/div[2]/a");
	By click_go=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[4]/div[2]");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\SoftPedia_Application_with_excel\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		//js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void phoneFinder() throws InterruptedException
	{	
		Thread.sleep(1000);
		driver.findElement(phone_finder).click();
		Thread.sleep(1000);
	}
	public void filtering() 
	{     
		Select brand = new Select(driver.findElement(By.xpath("//*[@id=\"mbfilt_brand\"]/div[2]")));
		brand.selectByIndex(2);
		Select platform = new Select(driver.findElement(By.xpath("//*[@id=\"mbfilt_platform\"]/div[2]")));
		platform.selectByIndex(2);
		Select battery = new Select(driver.findElement(By.xpath("//*[@id=\"mbfilt_battery\"]/div[2]")));
		battery.selectByIndex(0);
		Select availability = new Select(driver.findElement(By.xpath("//*[@id=\"mbfilt_availability\"]/div[2]")));
		availability.selectByIndex(2);
	}
	public void go()
	{
		driver.findElement(click_go).click();
	}
	
	public  void takeSnapShot(String path) throws Exception
	{
	        TakesScreenshot scrShot =((TakesScreenshot)driver);
	        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	        File DestFile=new File(path);
	        FileUtils.copyFile(SrcFile, DestFile);
	}
	public void Quit()
	{
		driver.close();
	}


}

