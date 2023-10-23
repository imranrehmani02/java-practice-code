import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Jdbc2 {
public static void main(String args[])throws Exception
{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
Statement st=con.createStatement();
st.execute("insert into student values(105,'Ashu',21)");
System.out.println("Done");
con.close();
}
}
