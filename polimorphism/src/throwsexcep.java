
public class throwsexcep 
{
	public void f1() throws ArithmeticException
	{
		
		System.out.println("in f1 - before");
		int a=10, b=0,c;
		c=a/b;
		System.out.println("in f1 - after");
	}

	public static void main(String[] args) 
	{
		System.out.println("in main - before");
		try
		{
		throwsexcep te=new throwsexcep();
		te.f1();
		}
		catch(ArithmeticException ae)
		{
		System.out.println("arithmetic exception");
		}
		System.out.println("in main - after");
	}

}
