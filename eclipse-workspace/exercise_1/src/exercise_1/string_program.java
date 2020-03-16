package exercise_1;

public class string_program {

	public static void main(String[] args) {
		{
			String S1="Selenium";
			String S2=new String("Selenium");
			System.out.println(S1==S2);
			System.out.println(S1.equals(S2));
			System.out.println(S1.compareTo(S2));
		}

	}

}
