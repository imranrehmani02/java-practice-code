import java.sql.*;
class Demo
{
public static void main(String aa[])
{
try
{
class.forName("com.mysql.jdbc.Driver");
System.out.println("Driver Loaded");

connection con=DriverManager.getconnection("jdbc:mysql://localhost:3306/adv","root","root");

System.out.println("Connection Established");
} catch(Exception e)
{
e.printStackTrace();
}
}
}