import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc3 {
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
String s1="select * from person";
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery(s1);
while(rs.next())
{
System.out.println(rs.getInt("id"));	
System.out.println(rs.getString("name"));
System.out.println(rs.getInt("age"));
System.out.println("-----------------");
}
}
}
