import java.io.IOException;

public class IoException 
{
	public void display()
	{
		String name="display";
		System.out.println(name.length());
		int x=Integer.parseInt(name);
	}
	public static void main(String args[]) throws IOException
	{
		IoException ioe=new IoException();
		ioe.display();
	}


}
	

