package exercise_1;

import java.util.Scanner;

public class palindrome
{

	public static void main(String[] args) 
	{
		int r, sum=0, n,temp;
		//n=555;
		System.out.println("enter a number:");
		Scanner scanner=new Scanner(System.in);
		n=scanner.nextInt();
		temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		
		}
		if(temp==sum)
			System.out.println("palindrome");
		else
			System.out.println("not palindrome");
	}

}
