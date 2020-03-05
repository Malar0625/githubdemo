package com.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainclass 
{
	WebDriver driver;
	public void launch_url()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\\\selenium\\\\drive\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);	
		driver.get("https://www.carwale.com/?utm_source=google&utm_medium=cpc&utm_term=carwale&utm_campaign=6038662&gclid=CjwKCAiAnfjyBRBxEiwA-EECLDLnFEzGxH53BWyNk2NRFlsFTjv2JWv8iMFQi74MAYo95hr2vRmuCBoCjecQAvD_BwE");
	}
	
	public void login_icon()
	{
		driver.findElement(By.className("cwsprite user-login-icon")).click();
		
	}	
	public void user_pass()
	{
		driver.findElement(By.id("txtloginemail")).sendKeys("malarvizhimarie@gmail.com");
		driver.findElement(By.id("txtpasswordlogin")).sendKeys("8248979226");
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
	}
}
	
