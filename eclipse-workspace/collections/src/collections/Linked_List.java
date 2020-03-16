package collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List 
{

	public static void main(String[] args) 
	{
		LinkedList<String> obj=new LinkedList<String>();
		obj.add("A");
		obj.add("B");
		obj.addFirst("C");
		obj.addLast("Z");
		obj.add("D");
		obj.add("E");
		System.out.println("the elements are"+obj);
		obj.remove(1);
		System.out.println("after removing 2nd element "+obj);
		boolean status = obj.contains("F"); 
		if(status)
		{
			System.out.println("linked list contains element");
		}
		else
		{
			System.out.println("linked list does not contains element");
		}
		int size=obj.size();
		System.out.println("linked list type is "+size);
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
