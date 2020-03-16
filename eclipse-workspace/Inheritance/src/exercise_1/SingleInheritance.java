package exercise_1;

public class SingleInheritance 
{
	int empno=100;
	void displayempno()
	{
		System.out.println("empno"+empno);
	}
}
class derived extends SingleInheritance
{
	String empname="malar";
	Void displayname()
	{
		System.out.println("empname"+empname);
		return null;
	}


	
public static void main(String[] args)
{
		
		derived d=new derived();
		d.displayempno();
		d.displayname();
}
}
