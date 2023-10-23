import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc14
{
public static void main(String[]args) throws Exception
{
     String s1 = "select * from emp";
     Statement stmt = EUtil.getStatement();
ResultSet rs = stmt.executeQuery("sql");
while(rs.next())
{
System.out.println(rs.getString(1));
System.out.println(rs.getString(2));
System.out.println(rs.getString(3));
    }
}
}

