import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc2
{
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
Statement stmt=con.createStatement();
stmt.execute("insert into person values(110,'Bhawna',27)");
System.out.println("done");
con.close();
}
}