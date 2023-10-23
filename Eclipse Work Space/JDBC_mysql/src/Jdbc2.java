import java.sql.*;
public class Jdbc2 {

	public static void main(String[] args)
	{
		try {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://3306/demo","root","root");
	Statement st=con.createStatement();
	String qr="update emp set job='ios' where id=1017";
	st.executeUpdate(qr);
	con.close();
	System.out.println("Done");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
