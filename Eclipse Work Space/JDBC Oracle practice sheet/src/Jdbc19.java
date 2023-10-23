import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc19
{
public static void main(String[]args) throws Exception
{
String s1 = "select * from emp where name like '%a%'";
Statement stmt = EUtil.getStatement();
ResultSet rs = stmt.executeQuery(s1);
boolean flag = true;
while(rs.next())
{
if(flag)
{
flag = false;
}
System.out.println(rs.getInt("id"));
System.out.println(","+rs.getString("name"));
System.out.println(","+rs.getString("surname"));
System.out.println(","+rs.getString("age"));
}
if(flag)
      {
System.out.println("no record available to your search");
        }
    }
}
