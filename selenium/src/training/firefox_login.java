package training;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_login 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drive\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

	}

}
