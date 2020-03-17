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
	By phone_finder=By.linkText("//*[@id=\"wrapper\"]/div[2]/div/div[20]/div[2]/a");
	By click_go=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[4]/div[2]");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BLTuser.BLT215\\\\Desktop\\\\SoftPedia_Application\\\\src\\\\test\\\\resources\\\\Driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		//js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void phoneFinder() throws InterruptedException
	{	
		//Thread.sleep(1000);
		driver.get("https://mobile.softpedia.com/phoneFinder/");
		//driver.findElement(phone_finder).click();
		//Thread.sleep(1000);
	}
	public void filtering() 
	{     

		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_brand\"]/div[2]")).click();
		WebElement brand=driver.findElement(By.xpath("//*[@id=\"mbfilt_brand\"]/ul/li[3]"));
		Actions action=new Actions(driver);
		action.moveToElement(brand).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_platform\"]/div[2]")).click();
		WebElement platform=driver.findElement(By.xpath("//*[@id=\"mbfilt_platform\"]/ul/li[2]"));
		action.moveToElement(platform).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_battery\"]/div[2]")).click();
		WebElement battery=driver.findElement(By.xpath("//*[@id=\"mbfilt_battery\"]/ul/li[1]"));
		action.moveToElement(battery).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_availability\"]/div[2]")).click();
		WebElement availability=driver.findElement(By.xpath("//*[@id=\"mbfilt_availability\"]/ul/li[3]"));
		action.moveToElement(availability).click().build().perform();
		
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