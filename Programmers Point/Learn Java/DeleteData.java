import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteData {

	public static void main(String[] args) {
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root","root");
		
		String qr="delete from student where id=101";
		
		Statement st=con.createStatement();

		int i=st.executeUpdate(qr);
		System.out.println(i+" record deleted");

		con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
