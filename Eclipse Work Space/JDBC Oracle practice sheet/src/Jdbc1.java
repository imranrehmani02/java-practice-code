import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc1 {

	public static void main(String[] args)throws Exception
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	Statement st=con.createStatement();
	st.execute("create table student(id number, name varchar(15), age number)");
	System.out.println("done");
	con.close();
	}

}
