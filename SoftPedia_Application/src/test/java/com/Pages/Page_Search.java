package com.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Search 
{
	WebDriver driver;
	By Search_word=By.id("hp_search");
	By click_go=By.xpath("//*[@id=\"main-search\"]/form/button");
	By vlc_link=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[3]/h4/a");
	By click_downloadnow=By.linkText("DOWNLOAD NOW");
	By external_mirror=By.xpath("//*[@id=\"dllinks\"]/div[3]/a");
	
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SoftPedia_Application\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/dyn-search.php?search_term");
	}
	public void Search()
	{
		driver.findElement(Search_word).sendKeys("vlc");
		
	}
	public void gobutton()
	{
		driver.findElement(click_go).click();
	}
	public void download()
	{
		driver.findElement(vlc_link).click();
		driver.findElement(click_downloadnow).click();
		driver.findElement(external_mirror).click();
	}
	public void check_file() throws InterruptedException
	{
		File ff=new File("C:\\Users\\BLTuser.BLT215\\Downloads\\vlc-3.0.8-win64 (2).exe");
		boolean bb=ff.exists();
		if(bb)
		{
			System.out.println("the file is exist");
			Assert.assertTrue(bb);
		}
		else
		{
			System.out.println("the file does not exist");
			Assert.assertFalse(bb);
		}
		
	}
	
	
	public void Quit()
	{
		driver.close();
	}
}

