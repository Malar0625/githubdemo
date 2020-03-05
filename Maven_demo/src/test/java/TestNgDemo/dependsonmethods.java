package TestNgDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods 
{
	@Test
	public void login()
	{
		System.out.println("login the application");
	}
	@Test(dependsOnMethods= {"login"})
	public void search()
	{
		System.out.println("Searching");
		Assert.assertEquals("abc", "xyz");
	}
	@Test(dependsOnMethods= {"search"}, alwaysRun=true)
	public void logout()
	{
		System.out.println("logout the application");
	}
	
}
