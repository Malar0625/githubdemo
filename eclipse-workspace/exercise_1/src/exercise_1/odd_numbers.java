package exercise_1;

import java.util.Arrays;
import java.util.Scanner;

public class odd_numbers
{
	public static void main(String[] args) 
	{
		int i, odd=0, nums;
		//int[] nums = {1,2,3,4,5};
		Scanner scanner=new Scanner(System.in);
		
		//System.out.print(" Enter any Number : ");
		//nums=scanner.nextInt();
		// System.out.println("Original Array: "+ nums);
		
		for(i = 1; i <= 5; i++)
		{
			System.out.print(" Enter any Number : ");
			nums=scanner.nextInt();
			if(nums % 2 != 0)
			{         
		          odd++;
		          
			}
			
		}

		System.out.printf("count is"+ odd );
		
		
	}
}
