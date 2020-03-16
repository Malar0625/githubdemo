package com.Testcase;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Baseclass.Wrapperclass;
import com.Pages.Seleniumhq;

public class seleniumhq_test extends Wrapperclass{

	@BeforeMethod
	public void startup()
	{
		launchApplication("chrome","https://www.selenium.dev/");
	}
    @Test
    public void sel_test() throws InterruptedException
    {
    	Seleniumhq sel = new Seleniumhq(driver);
    	sel.click_download();
    	sel.click_link();
    }
    @AfterMethod
    public void close() throws IOException
    {
    	Screenshot("C:\\Users\\BLTuser.BLT215\\Desktop\\BMW_test\\Screenshots\\BMW.png");
        quit();
    }
}
