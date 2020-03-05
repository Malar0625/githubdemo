package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Linkedin_Login
{
	WebDriver driver;
	By email=By.id("username");
	By password=By.id("password");
	By signinbutton=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
	public Linkedin_Login(WebDriver driver)
	{
		this.driver=driver;
	}
	public void linkedin_username(String userid)
	{
		driver.findElement(email).sendKeys(userid);
	}
	public void linkedin_password(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void linkedin_signin()
	{
		driver.findElement(signinbutton).click();
	}
	
}
