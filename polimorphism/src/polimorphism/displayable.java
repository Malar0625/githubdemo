package polimorphism;

class disp implements interface1
{
	
	@Override
	public void show() 
	{
		
		System.out.println("show");
	}

	@Override
	public void display() 
	{
		System.out.println("display");
		
	}
}
public class displayable
{
	public static void main(String[] args)
	{
		disp d1=new disp();
		d1.show();
		d1.display();
	}
}
	
	