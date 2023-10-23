import java.sql.Statement;
public class Jdbc7 {
	public static void main(String args[])throws Exception
	{
		Statement stmt=EUtil.getStatement();
		String s2="create table emp(id int,name varchar(20),surname varchar(20),age int)";
		stmt.execute(s2);
		System.out.println("Done");
	}

}
