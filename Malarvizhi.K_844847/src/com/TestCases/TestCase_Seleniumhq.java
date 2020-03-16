package com.TestCases;

import java.io.File;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.BaseClass.WrapperClass;
import com.Pages.Page_Seleniumhq;

public class TestCase_Seleniumhq extends WrapperClass
{
	@BeforeMethod
	public void LaunchWeb()
	{
		//launch the application
		LaunchBrowser("https://www.selenium.dev/");
	}
	@Test
	public void Seleniumhq() throws InterruptedException 
	{
		Page_Seleniumhq ps=new Page_Seleniumhq(driver);
		ps.Download();
		Thread.sleep(3000);
		ps.IELink();
		Thread.sleep(5000);
		
	}
	@Test
	public void Assert_successful() throws InterruptedException
	{
		//Fourth ---> Assert the successful download of the zip file
		File ff=new File("C:\\Users\\BLTuser.BLT215\\Downloads\\IEDriverServer_x64_3.150.1 (1).zip");
		boolean bb=ff.exists();
		if(bb)
			System.out.println("the file is exist");
		Assert.assertTrue(bb);
		Thread.sleep(3000);
	}
	@AfterMethod
	public void Close() throws IOException
	{
		Screenshot("C:\\Users\\BLTuser.BLT215\\Desktop\\Malarvizhi.K_844847\\Screenshot\\Snap\\one.png");
		Quit();
	}
}
