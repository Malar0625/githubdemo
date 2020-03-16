package demo;

import java.util.Scanner;

public class Array_Demo {

	public static void main(String[] args) {
		int totalNos;
		String StringArray[]=new String[10];
		Scanner s=new Scanner(System.in);
		totalNos= s.nextInt();
		for(int i=0;i<totalNos;i++) 
			StringArray[i]=s.next();
		for(int i=0;i<totalNos;i++)
			System.out.println ("the numbers are:"+StringArray[i]);
			
		

	}

}
