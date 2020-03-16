

package SeleniumDemo;
import java.io.IOException;
import  java.sql.Connection;		
import  java.sql.Statement;		
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;
public class database { 
public static void main(String[] args) throws IOException, ClassNotFoundException, 

SQLException { 	
String dburl = "jdbc:mysql://localhost:3306/database_selenium"; 
String username = "root";
String password = "root"; 
String query = "Select * from employeone"; 
Class.forName("com.mysql.jdbc.Driver"); 
Connection con= DriverManager.getConnection(dburl, username, password); 
Statement stmt = con.createStatement(); 
ResultSet rs = stmt.executeQuery(query); 
 while(rs.next())
{ 
String id = rs.getString("id"); 
String name = rs.getString("name"); 
//String sal= rs.getString("sal"); 
System.out.println(id); 
System.out.println(name); 
//System.out.println(sal); 
 
} 
 con.close();
} 
}
