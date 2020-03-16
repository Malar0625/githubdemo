package collections;
import java.util.*;

public class Hash_Map
{

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hm=new HashMap<Integer, String>();
		hm.put(100, "malar");
		hm.put(150, "vizhi");
		hm.put(200, "murali");
		hm.put(150, "vignesh");
		hm.put(null, "null");
		hm.put(null, "null");
		hm.put(null, "ashwin");
		hm.put(40, "null");
		System.out.println(hm);
		hm.remove(40);
		System.out.println("after removing elements: "+hm);
		for(Map.Entry<Integer, String> mentry : hm.entrySet())
			System.out.println("Key: "+mentry.getKey()+ "\t value: "+mentry.getValue());
	}

}
