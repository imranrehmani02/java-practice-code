<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String email=(String) session.getAttribute("email");
out.println("welcome "+email);
%>
<%
String qr="select * from cart where email=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, email);
ResultSet rs=ps.executeQuery();
if(rs.next())
{
	do
	{
		String name=rs.getString("name");
		String price=rs.getString("price");
		String category=rs.getString("category");
		String company=rs.getString("company");
		%>
	<center><div style="height: 230px;width: 50%;background-color: pink">
	<%=name %><br/>
	<%=price %><br/>
	<%=category %><br/>
	<%=company %><br/>

		<a href="https://www.paypal.com/in/signin">CHECKOUT</a><br/>
		
		<hr/>
</div></center>
		<%
	}while(rs.next());
}
else
{
	out.println("no records found");
}
con.close();
%>