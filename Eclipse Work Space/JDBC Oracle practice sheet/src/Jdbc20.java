import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
public class Jdbc20
{
public static void main(String[]args) throws Exception
{
Statement stmt = EUtil.getStatement();
Scanner sc = new Scanner(System.in);
ResultSet rs = null;
String key,sql,decider;
do
{
System.out.println("enter search key");
key = sc.next();
sql = "select * from emp where first_name like '%"+key+"%' or last_name like '%"+key+"%' or last_name like '%" + key + "%'";
rs = stmt.executeQuery(sql);
boolean flag = true;
while(rs.next())
{
if(flag)
{
flag = false;
System.out.println("search Result to " + key);
System.out.println("==============");
      }
System.out.println(rs.getInt("id"));
System.out.println(","+rs.getString("name"));
System.out.println("," +rs.getString("surname"));
System.out.println("," +rs.getInt("age"));
      }
if(flag)
{
System.out.println("no result found to:" + key);
     }
System.out.println("search again(y/n)?");
decider = sc.next();
}
while("y".equals(decider));
System.out.println("end of the game");
         }
}
