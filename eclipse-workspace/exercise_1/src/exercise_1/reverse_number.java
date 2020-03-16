package exercise_1;

import java.util.Scanner;

public class reverse_number {

	public static void main(String[] args)
	{
		int r, reverse=0,n;
		
		System.out.println("enter a number:");
		Scanner scanner=new Scanner(System.in);
		 n=scanner.nextInt();
	
		while(n!=0)
		{
			r=n%10;
			reverse=(reverse*10)+r;
			n=n/10;
		
		}
		System.out.println("the reverse number is:" + reverse);

	}

}
