package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page_Seleniumhq 
{
	WebDriver driver;
	By ClickDownload=By.xpath("/html/body/section[2]/div/div[2]/div[2]/a/div/b");
	By Click_64bit_WindowsIE=By.xpath("/html/body/div[2]/div[2]/p/a[2]");
	
	public Page_Seleniumhq(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Download() throws InterruptedException 
	{
		//Second ---> Click the download option
		driver.findElement(ClickDownload).click();
		Thread.sleep(3000);
	
	}
	public void IELink() throws InterruptedException
	{
		//Third ---> Click the 64 bit Windows IE
		driver.findElement(Click_64bit_WindowsIE).click();
		Thread.sleep(3000);
	}
	
}
