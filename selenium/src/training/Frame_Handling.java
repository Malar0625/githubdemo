package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Handling
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]")).isDisplayed());
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Droppable")).click();;

	}

}
