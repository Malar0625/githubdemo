
public class NullPointException {

	public static void main(String[] args)
	{
		try
		{
		
		String name=null;
		System.out.println(name.length());
		int x=Integer.parseInt(name);
		}
		catch(NullPointerException npe)
		{
			System.out.println("declaration");
		}
	}

}
