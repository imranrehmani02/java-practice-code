import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;
import java.util.Scanner;

public class ResultSet {

	public static void main(String[] args) {
		 
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/adv","root","root");
			String qr="select * from temp";
			Statement st=con.createStatement();
			java.sql.ResultSet rs= st.executeQuery(qr);
			if(rs.next())
			{
				do
				{
					//System.out.println(rs.getInt(1)+" "+rs.getString(2));
					System.out.println(rs.getInt("id")+" "+rs.getString("name"));
				}while(rs.next());
			}else
			{
				System.out.println("no records found");
			}
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
