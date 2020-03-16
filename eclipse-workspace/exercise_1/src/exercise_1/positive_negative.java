package exercise_1;

import java.util.Scanner;

public class positive_negative {

	public static void main(String[] args) 
	{

		 	int n;
		 	Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter the number :");
	        n=scanner.nextInt();
	        if(n > 0)
	        {
	            System.out.println("The given number "+n+" is Positive");
	        }
	        else if(n < 0)
	        {
	            System.out.println("The given number "+n+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+n+" is neither Positive nor Negative ");

	}

}
}
