import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Rs {

	public static void main(String[] args) {
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root","root");
			String qr="select * from temp";
			Statement st=con.createStatement();
	
		java.sql.ResultSet rs= st.executeQuery(qr);
			rs.beforeFirst();
			rs.afterLast();
			rs.first();
			rs.last();
			rs.absolute(3);
			rs.relative(2);
			rs.next();
			System.out.println(rs.getInt("id")+" "+rs.getString("name"));
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
