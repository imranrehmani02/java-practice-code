import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Jdbc4 {
public static void main(String args[])throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	Statement st=con.createStatement();
	String s1="insert into student values(109,'Akash',20)";
	String s2="insert into student values(110,'Priya',23)";
	String s3="insert into student values(111,'Sami',18)";
	st.execute(s1);
	st.execute(s2);
	st.execute(s3);
	System.out.println("Done");
	con.close();
	}
}
