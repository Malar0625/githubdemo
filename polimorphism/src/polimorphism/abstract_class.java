package polimorphism;

abstract class abstract_class
{
	public void sound()
	{
	}
	
}
 class animal extends abstract_class
{

   public void sound()
   {
	System.out.println("Woof");
   }

	public static void main(String[] args) 
	{
			abstract_class obj=new animal();
			obj.sound();
	}
}

	
