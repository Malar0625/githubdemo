package collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class linked_Hash
{

	public static void main(String[] args)
	{
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(20);
		lhs.add(10);
		lhs.add(30);
		lhs.add(50);
		lhs.add(50);
		System.out.println("the elements are "+ lhs);
		lhs.remove(10);
		System.out.println("after removing elements "+lhs);
		int size=lhs.size();
		System.out.println("size of linkedhash set is "+size);
		System.out.println("remove elements which is not present in the linkedhash set: "+ (lhs.remove(15)));
		Iterator itr=lhs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
