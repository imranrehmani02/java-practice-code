import java.io.FileReader;
//import java.io.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Set;

public class Jdbc8 {
public static void main(String args[])throws Exception
{
Statement stmt=EUtil.getStatement();
Properties pr=new Properties();
FileReader fin=new FileReader("test2.txt");
pr.load(fin);
Set<String>keys=pr.stringPropertyNames();
String value;
for(String key:keys)
{
value=pr.getProperty(key);
stmt.execute(value);
}
System.out.println("done");
}
}
