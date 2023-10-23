import java.sql.Statement;
public class Jdbc11 {
public static void main(String args[])throws Exception
{
Statement stmt=EUtil.getStatement();
String s1="insert into student values(211,'Soru',30)";
String s2="insert into student values(22,'Majid',32)";
String s3="update student set name='Hello' where id=7";
String s4="delete from student where id=9";

stmt.execute(s1);
stmt.execute(s2);
stmt.execute(s3);
stmt.execute(s4);
System.out.println("Done");
}
}
