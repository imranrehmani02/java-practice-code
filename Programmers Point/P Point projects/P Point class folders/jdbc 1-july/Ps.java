import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Ps {

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
			String qr="insert into temp values(?,?)";
			//update temp set name=? where id=?;
			//delete from temp where id=?;
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setInt(1, id);
			ps.setString(2, name);
			int i=ps.executeUpdate();
			System.out.println(i+" record added");
			con.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
