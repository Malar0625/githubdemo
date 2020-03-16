
public class arithmetice 
{
	public static void main(String[] args)
	{
	try
	{
	int[] arr= {1,2,3};
	int a=7,b=0,c;
	//System.out.println("before");
	c=a/b;
	System.out.println(c);	
	System.out.println(arr[4]);
	
	//System.out.println("after");
	}
	//catch(Exception o)
	//{
		//System.out.println("exception");
	//}
	
	catch(ArithmeticException a)
	{
		System.out.println("arithmetic exception");	
	
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("array index exception");	
	}
}
}
