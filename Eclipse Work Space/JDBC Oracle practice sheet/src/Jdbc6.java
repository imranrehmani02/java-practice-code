import java.sql.Statement;
public class Jdbc6 {

	public static void main(String[] args)throws Exception 
	{
	Statement stmt=EUtil.getStatement();
	String s1="insert into student values(112,'Rinkita',24)";
	stmt.execute(s1);
	System.out.println("Done");
	}
}
