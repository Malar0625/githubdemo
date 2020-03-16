package collections;
import java.util.*;
import java.util.Iterator;

public class Treee_Set 
{

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		ts.add(12.5);
		ts.add(10.5);
		ts.add(8.5);
		ts.add(13.5);
		ts.add(8.5);
		System.out.println("the elements are "+ts);
		ts.remove(10.5);
		System.out.println("after removing "+ts);
		Iterator itr=ts.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		

	}

}
}
