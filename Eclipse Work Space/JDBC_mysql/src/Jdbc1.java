import java.sql.*;

public class Jdbc1 {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
			Statement st=con.createStatement();
			
			String qr="insert into emp values(1017,'Shreya','HR','Dewas')";
			
			st.executeUpdate(qr);
			
			System.out.println("Done");
			
			con.close();
		}catch(Exception e)
		{
			
			e.printStackTrace();
		}
	}
}