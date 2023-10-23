<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String email=(String) session.getAttribute("id");
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
		String cat=rs.getString("cat");
		String cmp=rs.getString("cmp");
		String img=rs.getString("img");
		%>
	<center><div style="height: 230px;width: 50%;background-color: pink">
	<%=name %><br/>
	<%=price %><br/>
	<%=cat %><br/>
	<%=cmp %><br/>

	<img alt="" src="<%=img %>" height="50%" width="20%"><br/>
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