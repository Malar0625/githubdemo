package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Seleniumhq {
	WebDriver driver;
	By clickdownload = By.linkText("Downloads");
	By clicklink = By.xpath("/html/body/div[2]/div[2]/p/a[2]");
	
	  public Seleniumhq(WebDriver driver)
	   {
		   this.driver= driver;
	   }
	   public void click_download()
	   {
		   driver.findElement(clickdownload).click();
	   }
	   public void click_link() throws InterruptedException
	   {
		   driver.findElement(clicklink).click();
		   Thread.sleep(3000);
	   }
	}



