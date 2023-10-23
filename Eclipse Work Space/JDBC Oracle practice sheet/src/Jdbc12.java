import java.sql.ResultSet;
import java.sql.Statement;
public class Jdbc12 {
public static void main(String args[])throws Exception
{
String s1="select * from student";
Statement stmt=EUtil.getStatement();
ResultSet rs=stmt.executeQuery(s1);
while(rs.next())
{
System.out.println(rs.getInt("id"));
System.out.println(rs.getString("name"));
System.out.println(rs.getInt("age"));
System.out.println("----------------------");
}
}
}
