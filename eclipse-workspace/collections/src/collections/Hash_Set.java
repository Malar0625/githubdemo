package collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set
{

	public static void main(String[] args)
	{
		HashSet<String> h=new HashSet<String>();
		h.add("chennai");
		h.add("pondicherry");
		h.add("kerala");
		h.add("madurai");
		h.add("madurai");
		System.out.println("the elements are "+h);
		h.remove("kerala");
		System.out.println("after removing element "+h);
		Iterator itr=h.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}


}
}
