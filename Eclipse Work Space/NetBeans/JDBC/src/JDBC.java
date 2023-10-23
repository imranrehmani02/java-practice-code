import java.sql.*;
public class JDBC
{
public static void main(String args[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root","root")) ;
        String qr="insert into emp2 values(102,'Tannu')";
        
        Statement st=con.createStatement();
        
        int i=st.executeUpdate(qr);
        System.out.println(i+"record added");
    
}
catch(Exception e)
{
e.printStackTrace();
}
}
}