package SeleniumDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class junittestcase 
{
@Test
public void testcase1()
{
	System.out.println("testcase1");
	
}
@Test
public void testcase2()
{
	System.out.println("testcase2");
	
}
@Test
public void testcase3()
{
	System.out.println("testcase3");
	
}
@Before
public void beforemethod()
{
	System.out.println("before method");
}
@After
public void aftermethod()
{
	System.out.println("after method");
}
@BeforeClass
static public void beforeclass()
{
	System.out.println("before class");
}
@AfterClass
static public void afterclass()
{
	System.out.println("after class");
}
}
