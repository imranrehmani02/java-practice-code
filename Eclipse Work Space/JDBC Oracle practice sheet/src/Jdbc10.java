import java.sql.Statement;
public class Jdbc10 {
public static void main(String args[])throws Exception
{
Statement stmt=EUtil.getStatement();
String s1="update emp set name='Bhavini' where id=4";
stmt.execute(s1);
System.out.println("Done");
}
}
