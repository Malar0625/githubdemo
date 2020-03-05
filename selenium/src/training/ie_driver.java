package training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ie_driver 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.ie.driver", "C:/selenium/drive/IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.msn.com/en-in/?ocid=iehp");

	}

}
