package training;

import java.io.IOException;

public class callwrapper 
{
	public static void main(String args[]) throws IOException
	{
		wrapper_method wm=new wrapper_method();
		wm.lauchapp("https://www.linkedin.com/");
		wm.clickbyxpath("/html/body/nav/a[3]");
		wm.enterbyid("username", "malar");
		wm.enterbyid("password", "12345");
		wm.clickbyxpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");
		wm.screenshot("C:\\Users\\BLTuser.BLT215\\Desktop\\selenium\\screenshot\\screen2.png");
		
	}
}
