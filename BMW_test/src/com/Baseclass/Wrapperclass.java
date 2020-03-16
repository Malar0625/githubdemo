package com.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Wrapperclass {
protected WebDriver driver;

public void launchApplication(String browser,String url)
{
	try {
		if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT215\\Desktop\\BMW_test\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
		}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
	}
	catch(WebDriverException e)
	{
		System.out.println("Browser cannot be launched");
	}
}
	public void Screenshot(String path) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path));
	}
	 public void quit()
	 {
		 driver.close();
	 }
	
}

