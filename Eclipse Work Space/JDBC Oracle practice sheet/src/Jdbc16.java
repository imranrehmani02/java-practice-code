import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc16
{
public static void main(String[]args) throws Exception
{
     String s1 = "select * from emp";
     Statement stmt = EUtil.getStatement();
ResultSet rs = stmt.executeQuery(s1);
while(rs.next())
{
System.out.println(rs.getString("id"));
System.out.println(","+rs.getString("name"));
System.out.println(","+rs.getString(3));
System.out.println(","+rs.getString(4));
       }
    }
}
