package collections;

import java.util.Map;
import java.util.TreeMap;


public class Tree_Map 
{

	public static void main(String[] args)
	{
		TreeMap<Integer, String> tm=new TreeMap<Integer, String>();
		tm.put(50, "malar");
		tm.put(100, "vizhi");
		tm.put(35, "murali");
		tm.put(80, "vignesh");
		System.out.println(tm);
		for(Map.Entry<Integer, String> mentry : tm.entrySet())
			System.out.println("Key: "+mentry.getKey()+ "\t value: "+mentry.getValue());
		int size=tm.size();
		System.out.println("size "+size);
		tm.remove(50);
		System.out.println("after removing elements "+tm);
		
	}

}
