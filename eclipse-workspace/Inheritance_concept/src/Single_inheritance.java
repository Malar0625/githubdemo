

public class Single_inheritance
{
	class SingleInheritance 
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


		
	public void main(String[] args)
	{
			
			derived d=new derived();
			d.displayempno();
			d.displayname();
	}

	}


}
