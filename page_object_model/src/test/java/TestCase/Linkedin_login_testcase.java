package TestCase;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Library.WrapperEx;
import Pages.Linkedin_Login;

public class Linkedin_login_testcase extends WrapperEx
{
	@BeforeClass
	public void startup()
	{
		launchApplication("Chrome", "https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		
	}
	@Test
	public void login()
	{
		Linkedin_Login lpage=new Linkedin_Login(driver);
		lpage.linkedin_username("malarvizhimarie@gmail.com");
		lpage.linkedin_password("8754838966");
		lpage.linkedin_signin();
		
	}
	
	
}
