import java.io.FileWriter;
import java.io.IOException;
public class Io_Exception 
{
	

	public class FileNotFound {

	   public void main(String args[]) throws IOException
	   {		
	      FileWriter myWriter = new FileWriter("C://filenotfound.txt");

	      myWriter.write("Hi, I'm trying to write something.");
	      myWriter.close();
	   }
	}
}
