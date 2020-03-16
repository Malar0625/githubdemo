package com.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperClass 
{
	protected WebDriver driver;
	public void LaunchBrowser(String url)// First--> Launch the browser
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\Malarvizhi.K_844847\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
	}
	public void Screenshot(String path) throws IOException
	{
		//screenshot of the output page
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path));
	}
	public void Quit()
	{
		//Fifth ---> close the application
		driver.close();
	}
}
