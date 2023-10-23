import java.sql.*;
public class Temp
{
	public static void main(String args[])
	{
		try
		{
		Class.forName("com:mysql.jdbc.driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Demo","root","root");
		
		String qr="insert into dummy values(301,'bharat roy','a. manager')";
		
		Statement st=con.createStatement();
		
		int i=st.executeUpdate(qr);
		System.out.println(i+" record added");
		
		con.close();
		
	}catch (Exception e)
		{
		e.printStackTrace();
		}
}
}