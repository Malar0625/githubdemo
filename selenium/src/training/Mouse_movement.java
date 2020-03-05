package training;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_movement
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		WebElement a=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[1]"));
		WebElement b=driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		Actions action=new Actions(driver);
		action.moveToElement(a);
		action.moveToElement(b).click().perform();//build() is used to select many fields
	}

}
