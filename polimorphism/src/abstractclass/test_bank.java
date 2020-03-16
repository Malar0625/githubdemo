package abstractclass;

public class test_bank 
{

	public static void main(String[] args) 
	{
		bank b;
		b=new icici();
		System.out.println("icici roi " +b.get_roi());
		b=new hdfc();
		System.out.println("hdfc roi " +b.get_roi());

	}

}
