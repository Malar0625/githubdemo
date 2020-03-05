package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();//maximize output window size
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[3]/div/label")).click();
		driver.findElement(By.xpath("/html/body/div[6]/table/tbody/tr[5]/td[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div/div[4]/div/label")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[4]/td[4]")).click();
		
	}

}
