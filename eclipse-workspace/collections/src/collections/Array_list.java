package collections;
import java.util.ArrayList;

import java.util.Iterator;

public class Array_list 
{



	public static void main(String[] args)
	{
		ArrayList<String> obj=new ArrayList<String>();
		
		obj.add("selenium");
		obj.add("Training");
		obj.add("BLT");
		System.out.println(obj);
		obj.remove(1);
		System.out.println("after removing 2nd element"+obj);
		System.out.println("array list elements are");
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

	
		
	}


