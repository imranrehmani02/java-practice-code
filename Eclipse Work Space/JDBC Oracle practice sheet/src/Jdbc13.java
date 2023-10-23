import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc13
{
public static void main(String[]args) throws Exception
{
     String sql = "select * from emp";
     Statement stmt = EUtil.getStatement();
ResultSet rs = stmt.executeQuery(sql);
while(rs.next())
{
System.out.println(rs.getInt(1));
System.out.println(","+rs.getString(2));
System.out.println(rs.getString(3));
System.out.println(rs.getInt(4));
      }

    }
}
