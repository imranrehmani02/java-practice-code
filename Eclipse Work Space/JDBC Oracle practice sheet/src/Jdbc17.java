import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc17
{
public static void main(String[]args) throws Exception
{
     Statement stmt = EUtil.getStatement();
String s1 = "select name, id, age from emp";
ResultSet rs = stmt.executeQuery(s1);
while(rs.next())
{
System.out.println(rs.getString(1));
System.out.println(","+rs.getInt(2));
System.out.println(","+rs.getInt(3));
       }
    }
}
