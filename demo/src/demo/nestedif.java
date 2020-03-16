package demo;

public class nestedif 
{

	public static void main(String[] args)
{
		int marks=59;
		
		if(marks >=91 && marks <=100)
		{
			System.out.println("grade A");
			
		}
		else if(marks >=81 && marks <=90)
		{
			System.out.println("grade B");
		}
		else if(marks >=60 && marks <=70)
		{
			System.out.println("grade C");
		}
		else
		{
			System.out.println("failed");
		}
	}
		

}
