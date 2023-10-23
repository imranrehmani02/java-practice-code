import java.sql.*;
public class Demo {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root");
			
String qr="insert into emp2 values(102,'Saqlain')";
			
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
