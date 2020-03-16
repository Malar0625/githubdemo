package basic_program;

import java.util.Scanner;

public class odd_no_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int sum=0;
		System.out.println("enter a number:");
		Scanner scanner=new Scanner(System.in);
		 n=scanner.nextInt();
		 while (n > 0)  
		    { 
		        int rem = n % 10; 
		        if (rem % 2 != 0)
		        {
		        	sum=sum+rem;
		        	
		        }
		        n=n/10;
		       // System.out.println(sum);
	}
System.out.println(sum);
}
}