package oops;

public class college_mark 
{
	int rno;
	String name;
	int java, maths;
	float avg;
	public void college_mark(int rno, String name, int java, int maths)
	{
		this.rno=rno;
		this.name=name;
		this.java=java;
		this.maths=maths;
		
		avg=(java+maths)/2f;
	}
	public void display()
	{
		System.out.println("Roll number : " +rno);
		System.out.println("Name : " +name);
		System.out.println("Maths mark : " +maths);
		System.out.println("Java mark : " +java);
		System.out.println("Average : " +avg);
		System.out.println("---------------------");
	}

}
