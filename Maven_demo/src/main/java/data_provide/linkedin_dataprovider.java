package data_provide;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class linkedin_dataprovider 
{
	WebDriver driver;
	@Test(dataProvider="getData")
	public void setData(String username, String password)
	{
		
		  driver.findElement(By.id("username")).sendKeys(username);
		  driver.findElement(By.id("password")).sendKeys(password);
		
	}
	@BeforeMethod
	public void beforemethod()
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
	@DataProvider(name= "getData")
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] ="malarvizhimari";
		data[0][1] = "dfjhsdfh";
		
		data[1][0] ="malar";
		data[1][1] = "ioiobk";
		
		data[2][0] ="vizhi";
		data[2][1] = "xyx";
		return data;
		
	}
}
