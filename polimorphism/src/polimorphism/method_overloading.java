package polimorphism;

public class method_overloading
{
	int add(int x, int y)
	{
		return(x+y);
	}
	 float add(int x, int y, float z)
	{
		return(x+y+z);
	}

	public static void main(String[] args)
	{
		method_overloading s = new method_overloading(); 
        System.out.println(s.add(10, 20)); 
        System.out.println(s.add(10, 20,30.5f));

	}

}