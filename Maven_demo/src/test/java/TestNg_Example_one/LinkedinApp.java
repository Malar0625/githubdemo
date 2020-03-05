package TestNg_Example_one;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class LinkedinApp 
{
	WebDriver driver;
  @Test
  public void collectionpage() 
  {
	  driver.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000450914890\"]/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span")).click();
	 
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.practiceselenium.com/welcome.html");
  }

  @AfterMethod
  public void afterMethod() 
  {
	 //driver.close();
  }

}
