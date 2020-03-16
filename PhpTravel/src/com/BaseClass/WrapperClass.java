package com.BaseClass;

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

public class WrapperClass
{
	protected WebDriver driver;
	public void launchbrowser(String browser, String url)
	{
		try
		{
			if(browser.equalsIgnoreCase("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browser.equalsIgnoreCase("chrome"))
			{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\PhpTravel\\Driver\\chromedriver.exe");
				driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		}
		catch(WebDriverException we)
		{
			System.out.println("browser can not launched");
		}
	}
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Source=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path));
	}
	public void quit()
	{
		driver.close();
	}
}

