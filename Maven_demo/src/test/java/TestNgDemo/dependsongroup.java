package TestNgDemo;

import org.testng.annotations.Test;

public class dependsongroup 
{
	@Test(groups= {"functional testing", "retesting"})
	  public void testcase1() 
	  {
		  System.out.println("testcase1");
	  }
	  @Test(groups= {"functional testing", "smoke testing"})
	  public void testcase2() 
	  {
		  System.out.println("testcase2");
	  }
	  @Test(groups= {"regression testing", "smoke testing"})
	  public void testcase3() 
	  {
		  System.out.println("testcase3");
	  }
}
