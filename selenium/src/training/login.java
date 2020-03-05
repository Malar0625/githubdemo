package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.linkedin.com/");
		driver.findElement(By.className("nav__button-secondary")).click();
		driver.findElement(By.id("username")).sendKeys("xyz@gmail.com");
		driver.findElement(By.id("password")).sendKeys("8754838968");
		driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();//absolute xpath(copy full path)
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();//relative xpath(copy xpath)
		driver.quit();//all tabs will close
		driver.close();//current tab will close
		driver.findElement(By.partialLinkText("Join")).click();
		driver.findElement(By.linkText("Join now")).click();
		driver.findElement(By.xpath("//*[@class=\"pill pill--talent-finder-cta\"]")).click();
		driver.findElement(By.xpath("//*[@class=\'btn__primary--large from__button--floating\' and @type='submit']")).click();
		driver.findElement(By.xpath("//*[@class=\'btn__primary--large from__button--floating\' or @type='submit']")).click();
		driver.findElement(By.xpath("//*[starts-with(@name, 'session')]")).sendKeys("***********");
		}

}
