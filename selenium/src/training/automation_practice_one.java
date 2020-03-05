package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class automation_practice_one 
{

	WebDriver driver;
	public void lauchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}
	public void clickbyxpath(String path1)
	{
		driver.findElement(By.xpath(path1)).click();
	}
	public void clickbyclassname(String path2)
	{
		driver.findElement(By.className(path2)).click();
	}
	public void enterbyid(String loc, String value)
	{
		driver.findElement(By.id(loc)).sendKeys(value);;
	}
	public void dropdown()
	{
		Select select=new Select(driver.findElement(By.id("card_type")));
		select.selectByIndex(0);
		
	}
	public void screenshot(String path3) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path3));
	}
}
