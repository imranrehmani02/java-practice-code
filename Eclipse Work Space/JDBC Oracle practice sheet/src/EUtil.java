import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
public class EUtil {
public static Statement getStatement() throws Exception
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	Statement stmt=con.createStatement();
	return stmt;
}
}