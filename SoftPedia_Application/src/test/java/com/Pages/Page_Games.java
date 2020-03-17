package com.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_Games {
	WebDriver driver;
	By games=By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[3]/ul[1]/li[3]/a");
	By click_sidebar=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[3]/div/i[2]");
	By click_autonauts=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[3]/div/div/div[1]/div[4]/a");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\git\\githubdemo\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void GameTab() throws InterruptedException
	{	
		driver.findElement(games).click();
		Thread.sleep(1000);
		
		
	}
	public void sidebar()
	{
		driver.findElement(click_sidebar).click();
	}
	public void SelectGame()
	{
		driver.findElement(click_autonauts).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
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
