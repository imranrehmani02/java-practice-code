import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Statement;
import java.util.Arrays;

public class Jdbc9 {
public static void main(String args[])throws Exception
{
FileReader fin=new FileReader("test1.txt");
BufferedReader bin=new BufferedReader(fin);
Statement stmt=EUtil.getStatement();
String s1=bin.readLine();
String s2[],sql;
while(s1 !=null)
{
s2=s1.split("\\|");
sql="insert into emp values("+s2[0].trim()+","+s2[2].trim()+","+s2[3].trim()+")";
stmt.execute(sql);
s1=bin.readLine();
}
System.out.println("Done");
}
}

