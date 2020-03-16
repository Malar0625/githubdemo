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

public class Page_SubmitApplication {
	WebDriver driver;
	By click_submit=By.xpath("//*[@id=\"spf__pad\"]/table/tbody/tr[4]/td/button");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\soft\\SoftPedia_Application_with_excel\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void SubmitApplication()
	{	
		driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[2]")).click();
		WebElement a=driver.findElement(By.linkText("Submit Applications"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
	}
	
	public void submit_form()
	{
		driver.findElement(click_submit).click();
	}
	public void alert_handle() throws InterruptedException
	{     
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