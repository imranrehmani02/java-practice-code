import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
public class Jdbc3 {
	public static void main(String args[])throws Exception 
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	Statement st=con.createStatement();
	st.execute("insert into student values(106,'Ankita',24)");
	st.execute("insert into student values(107,'Rashi',22)");
	st.execute("insert into student values(108,'Ashu',19)");
	System.out.println("done");
	con.close();
	}
}
