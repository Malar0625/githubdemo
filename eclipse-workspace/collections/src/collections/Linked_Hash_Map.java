package collections;

import java.util.LinkedHashMap;


public class Linked_Hash_Map
{

	public static void main(String[] args) 
	{
		LinkedHashMap<String, String> lhm=new LinkedHashMap<String, String>();
		lhm.put(null, null);
		lhm.put("malar", "vizhi");
		lhm.put("dharan", "murali");
		lhm.put("balu", "vignesh");
		System.out.println(lhm);
		}

}
