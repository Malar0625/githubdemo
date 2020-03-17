package com.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Page_PrizeClaim {
	WebDriver driver;
	By click_prize_claim=By.xpath("/html/body/div[1]/div[2]/div[2]/div/p/b[2]/a");
	By click_submit=By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td/button");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\BLTuser.BLT215\\\\Desktop\\\\SoftPedia_Application\\\\src\\\\test\\\\resources\\\\Driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void Discount_Giveaways()
	{	
		driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[2]")).click();
		WebElement a=driver.findElement(By.linkText("Discounts & Giveaways"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
		driver.findElement(click_prize_claim).click();
	}
	
	public void submit_license() throws InterruptedException
	{
		driver.findElement(click_submit).click();
	    Alert alert = driver.switchTo().alert();		 
        String alertMessage= driver.switchTo().alert().getText();		
        System.out.println(alertMessage);	
        Thread.sleep(5000);	
        alert.accept();	
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

