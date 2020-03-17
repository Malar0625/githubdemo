package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.ExcelUtility.Excel_data;

public class Page_softpedia 
{
	WebDriver driver;
	WebElement Register;
	
	By log_click_user_icon=By.xpath("//*[@id=\"navicos\"]/li[3]");
	By log_email=By.id("_lu");
	By log_password=By.id("_lp");
	By log_login=By.xpath("//*[@id=\"spovl1\"]/div/div/form/input[3]");
	
	By search_word=By.id("hp_search");
	By search_click_go=By.xpath("//*[@id=\"main-search\"]/form/button");
	By search_vlc_link=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[3]/h4/a");
	By search_click_downloadnow=By.linkText("DOWNLOAD NOW");
	By search_external_mirror=By.xpath("//*[@id=\"dllinks\"]/div[3]/a");
	
	By contact_click_radiobutton=By.xpath("/html/body/div/div[2]/div/div[2]/form/p/span[2]/b");
	By contact_message=By.xpath("//*[@id=\"ctf_message_1\"]");
	By contact_email=By.xpath("//*[@id=\"ctf_email_1\"]");
	By contact_click_send=By.xpath("//*[@id=\"spradio_ctf_1\"]/button");
	
	By submitapp_click_submit=By.xpath("//*[@id=\"spf__pad\"]/table/tbody/tr[4]/td/button");
	
	By ph_phone_finder=By.linkText("//*[@id=\"wrapper\"]/div[2]/div/div[20]/div[2]/a");
	By ph_click_go=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[4]/div[2]");
	
	By prize_click_claim=By.xpath("/html/body/div[1]/div[2]/div[2]/div/p/b[2]/a");
	By prize_click_submit=By.xpath("/html/body/div[1]/div[2]/div[2]/div[3]/form/table/tbody/tr[3]/td/button");
	
	By games=By.xpath("//*[@id=\"wrapper\"]/div[1]/div[2]/div/div[3]/ul[1]/li[3]/a");
	By games_click_sidebar=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[3]/div/i[2]");
	By games_click_autonauts=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[3]/div/div/div[1]/div[4]/a");
	
	By cal_left=By.xpath("/html/body/div[1]/div[2]/div[2]/div[2]/div[1]/a");
	By cal_click_date=By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div[2]/div[17]/a");
	By cal_click_news=By.xpath("/html/body/div[1]/div[2]/div[2]/div[18]/div[3]/h3/a");
	
	By nextpage=By.xpath("/html/body/div/div[2]/div[10]/div[9]/div[22]/div[8]/div/a[11]");
	By previouspage=By.xpath("//*[@id=\"sjmp\"]/div[9]/div[22]/div[8]/div/a[1]");
	
	//REGISTER
	Excel_data ed = new Excel_data();
	public void registeration() throws IOException
	{
		for(int i=1;i<=3;i++)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.get("https://www.softpedia.com/");
		
			Register=driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[3]"));
			Register.click();
			System.out.println("click the user icon");
			Register=driver.findElement(By.xpath("//*[@id=\"spovl1\"]/div/div/div[1]/a[3]"));
			Register.click();
			System.out.println("click on register now button");
		
		
			driver.findElement(By.id("reguser")).sendKeys(ed.excel_username(i));
			driver.findElement(By.id("regmail")).sendKeys(ed.Email(i));
			driver.findElement(By.id("regpass1")).sendKeys(ed.excel_password(i));
			driver.findElement(By.id("regpass2")).sendKeys(ed.excel_repassword(i));
			driver.findElement(By.xpath("//*[@id=\"regbtn\"]")).click();
			
			driver.close();
			
		}
	}
	public void quit()
	{
		driver.close();
	}
	
	//LOGIN
	public void Login_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void icon_credential()
	{
		driver.findElement(log_click_user_icon).click();
		driver.findElement(log_email).sendKeys("malarvizhimarie@gmail.com");
		driver.findElement(log_password).sendKeys("123456789");	
	}
	public void login_button()
	{
		driver.findElement(log_login).click();
	}
	//SEARCHING
	public void Search_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/dyn-search.php?search_term");
	}
	public void Search()
	{
		driver.findElement(search_word).sendKeys("vlc");
	}
	public void gobutton()
	{
		driver.findElement(search_click_go).click();
	}
	public void download()
	{
		driver.findElement(search_vlc_link).click();
		driver.findElement(search_click_downloadnow).click();
		driver.findElement(search_external_mirror).click();
	}
	public void check_file() throws InterruptedException
	{
		File ff=new File("C:\\Users\\BLTuser.BLT215\\Downloads\\vlc-3.0.8-win64 (2).exe");
		boolean bb=ff.exists();
		if(bb)
		{
			System.out.println("the file is exist");
			Assert.assertTrue(bb);
		}
		else
		{
			System.out.println("the file does not exist");
			Assert.assertFalse(bb);
		}
		
	}
	
	//CONTACT US
	public void Contactus_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void contactus()
	{
		driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[2]")).click();;
		WebElement a=driver.findElement(By.linkText("Contact Us"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
	}
	public void radiobutton()
	{
		driver.findElement(contact_click_radiobutton).click();
	}
	public void message_email()
	{
		driver.findElement(contact_message).sendKeys("helloooo");
		driver.findElement(contact_email).sendKeys("malarvizhimarie@gmail.com");
	}
	public void send_button()
	{
		driver.findElement(contact_click_send).click();
	}
	
	//SUBMIT APPLICATION
	public void Submitapp_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void SubmitApplication()
	{	
		driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[2]")).click();
		WebElement a=driver.findElement(By.linkText("Submit Applications"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
	}
	
	public void submit_form()
	{
		driver.findElement(submitapp_click_submit).click();
	}
	public void alert_handle() throws InterruptedException
	{     
        Alert alert = driver.switchTo().alert();		 
        String alertMessage= driver.switchTo().alert().getText();		
        System.out.println(alertMessage);	
        Thread.sleep(5000);	
        alert.accept();	
	}
	
	//PHONE FINDER
	public void Phonefinder_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		//js.executeScript("window.scrollBy(0,1000)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void phoneFinder() throws InterruptedException
	{	
		//Thread.sleep(1000);
		driver.get("https://mobile.softpedia.com/phoneFinder/");
		//driver.findElement(phone_finder).click();
		//Thread.sleep(1000);
	}
	public void filtering() 
	{     
		driver.findElement(By.xpath("//*[@id=\"mbfilt_brand\"]/div[2]")).click();
		WebElement brand=driver.findElement(By.xpath("//*[@id=\"mbfilt_brand\"]/ul/li[3]"));
		Actions action=new Actions(driver);
		action.moveToElement(brand).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_platform\"]/div[2]")).click();
		WebElement platform=driver.findElement(By.xpath("//*[@id=\"mbfilt_platform\"]/ul/li[2]"));
		action.moveToElement(platform).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_battery\"]/div[2]")).click();
		WebElement battery=driver.findElement(By.xpath("//*[@id=\"mbfilt_battery\"]/ul/li[1]"));
		action.moveToElement(battery).click().build().perform();
		
		driver.findElement(By.xpath("//*[@id=\"mbfilt_availability\"]/div[2]")).click();
		WebElement availability=driver.findElement(By.xpath("//*[@id=\"mbfilt_availability\"]/ul/li[3]"));
		action.moveToElement(availability).click().build().perform();
		
	}
	public void go()
	{
		driver.findElement(ph_click_go).click();
	}
	
	//PRIZE CLAIM
	public void Prize_claim_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void Discount_Giveaways()
	{	
		driver.findElement(By.xpath("//*[@id=\"navicos\"]/li[2]")).click();
		WebElement a=driver.findElement(By.linkText("Discounts & Giveaways"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
		driver.findElement(prize_click_claim).click();
	}
	
	public void submit_license() throws InterruptedException
	{
		driver.findElement(prize_click_submit).click();
	    Alert alert = driver.switchTo().alert();		 
        String alertMessage= driver.switchTo().alert().getText();		
        System.out.println(alertMessage);	
        Thread.sleep(5000);	
        alert.accept();	
	}
	
	//GAME
	public void Game_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.softpedia.com/");
	}
	public void GameTab() throws InterruptedException
	{	
		driver.findElement(games).click();
		Thread.sleep(1000);	
	}
	public void sidebar()
	{
		driver.findElement(games_click_sidebar).click();
	}
	public void SelectGame()
	{
		driver.findElement(games_click_autonauts).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
	}
	
	//CALENDAR
	public void Calendar_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://news.softpedia.com/newsArchive/");
	}
	public void select_mon_year()
	{
		driver.findElement(cal_left).click();
	}
	public void select_date()
	{
		driver.findElement(cal_click_date).click();
	}
	public void Scroll_click()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(cal_click_news).click();
	}

	//NEXT PAGE
	public void Nextpage_Launch_Browser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT215\\Desktop\\SOFTPEDIA_APPLICATION_AS_SINGLE\\src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://linux.softpedia.com/");
	}
	
	public void Scroll_clicknext()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(nextpage).click();
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(previouspage).click();
	}
}
