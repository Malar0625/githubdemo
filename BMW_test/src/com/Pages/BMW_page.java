package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BMW_page {
	WebDriver driver;
	
   By clickmodels = By.linkText("Models");
   By clickseries = By.linkText("7");
   
   public BMW_page(WebDriver driver)
   {
	   this.driver= driver;
   }
   public void click_models()
   {
	   driver.findElement(clickmodels).click();
   }
   public void click_series()
   {
	   driver.findElement(clickseries).click();
   }
   public void img()
   {
	   Actions ac = new Actions(driver);
	   WebElement a = driver.findElement(By.xpath("//img[@alt='Not Found']"));
	   ac.moveToElement(a).click().build().perform();
   }
}
