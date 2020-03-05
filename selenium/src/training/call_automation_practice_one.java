package training;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class call_automation_practice_one 
{
	public static void main(String args[]) throws IOException
	{
	
		automation_practice_one ap=new automation_practice_one();
		ap.lauchapp("http://www.practiceselenium.com/welcome.html");
		ap.clickbyxpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000450914890\"]/span");
		ap.clickbyxpath("//*[@id=\"wsb-button-00000000-0000-0000-0000-000451955160\"]/span");
		ap.enterbyid("email", "malarvizhimarie@gmail.com");
		ap.enterbyid("name", "Malarvizhi");
		ap.enterbyid("address", "No.30, Mettu Street, Puducherry-605005");
		ap.dropdown();
	}

}
