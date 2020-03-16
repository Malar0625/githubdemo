package collections;
import java.util.*;
public class Hash_table 
{

	public static void main(String[] args) 
	{
		Hashtable<Integer, String> ht=new Hashtable<Integer, String>();
		ht.put(100, "malar");
		ht.put(150, "vizhi");
		ht.put(200, "murali");
		ht.put(150, "vignesh");
		System.out.println(ht);
		for(Map.Entry<Integer, String> mentry : ht.entrySet())
			System.out.println("Key: "+mentry.getKey()+ "\t value: "+mentry.getValue());
	}

}
