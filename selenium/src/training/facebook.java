package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("06251");
		driver.findElement(By.id("Log In")).click();
		driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[5]/td[4]")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//Sets the amount of time to wait for a page load
		Select day=new Select(driver.findElement(By.id("day")));//select value from dropdown using selectByIndex, selectByVisibleText and selectByValue
		day.selectByIndex(25);
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByValue("1996");
		driver.findElement(By.className("_58mt")).click();

	}

}
