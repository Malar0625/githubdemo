package collections;

import java.util.ArrayList;

import collections.ArrayList_demo;

public class ArrayList_demo 
{
	ArrayList<student> obj=new ArrayList<student>();
	
	public void create()
	{
		student s1=new student(77, "malar", 80, 90);
		student s2=new student(77, "vizhi", 85, 95);
		obj.add(s1);
		obj.add(s2);
	}
	public void display()
	{
		for(student i : obj)
		{
		System.out.println("Roll number : " +i.rno);
		System.out.println("Name : " +i.name);
		System.out.println("Maths mark : " +i.maths);
		System.out.println("Java mark : " +i.java);
		System.out.println("Average : " +i.avg);
		System.out.println("---------------------");
		}
	}

	public static void main(String[] args)
	{
		ArrayList_demo obj=new ArrayList_demo();
		obj.create();
		System.out.println("array list created");
		obj.display();
		System.out.println("array list displayed");
	}

}
