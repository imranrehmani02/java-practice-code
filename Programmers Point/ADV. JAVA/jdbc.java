import java.sql.*;
class Demo
{
public static void main(String aa[])
{
try
{
Class.forName("com.mysql.jdbc.Driver");
System.out.println("driver loaded");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/navigate","root","root");
System.out.println("connection established");

String qr="insert into faculty values(101,'nikku','pharma',8999,422)";
System.out.println("write a query");

Statement st=con.createStatement();
System.out.println("make a statement object");

int i=st.executeUpdate(qr);
System.out.println(i+" record added");

con.close();
System.out.println("close the connection");
}catch (Exception e)
{
e.printStackTrace();
}
}
}