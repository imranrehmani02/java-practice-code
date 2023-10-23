<%@page import="java.sql.*" %>
<%
String name=request.getParameter("name");
String price=request.getParameter("price");
String category=request.getParameter("category");
String company=request.getParameter("company");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
String qr="insert into product values(?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, price);
ps.setString(3, category);
ps.setString(4, company);
int i=ps.executeUpdate();
if(i>0)
{
	out.println("Product added");
}
else
{
	out.println("Product not added");
}
con.close();
%>





