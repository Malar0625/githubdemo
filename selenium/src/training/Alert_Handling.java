package training;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
		driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
		Alert a=driver.switchTo().alert();
		
		System.out.println(a.getText());
		a.accept();
		a.sendKeys("malar");
		a.dismiss();
		driver.close();
		
		
	
	}

}
