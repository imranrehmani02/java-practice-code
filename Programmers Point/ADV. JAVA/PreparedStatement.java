import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatement {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter id");
		 int id=sc.nextInt();
		 System.out.println("enter name");
		 String name=sc.next();
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root","root");
String qr="insert into temp values("+id+",'"+name+"')";
Statement st=con.createStatement();
int i=st.executeUpdate(qr);
System.out.println(i+" record added");
con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
