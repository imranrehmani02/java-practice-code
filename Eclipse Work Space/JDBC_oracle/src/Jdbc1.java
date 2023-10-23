import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args)throws Exception
	{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
Statement stmt=con.createStatement();
stmt.execute("create table person(id int,name varchar(20),age int)");
System.out.println("done");
con.close();
	}

}
