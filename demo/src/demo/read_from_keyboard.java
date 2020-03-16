package demo;

import java.util.Scanner;

public class read_from_keyboard {

	public static void main(String[] args)
	{
		int a,b,c,d;
		System.out.println("enter the value of a");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		System.out.println("enter the value of b");
		b=scanner.nextInt();
		System.out.println("enter the value of c");
		c=scanner.nextInt();	
		System.out.println((a+b+c)/3);
		
		
		

	}

}
