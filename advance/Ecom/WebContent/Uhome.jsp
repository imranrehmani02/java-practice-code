<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<h1 align="center">welcome to user home</h1>
<%
String email=(String) session.getAttribute("email");
out.println("welcome "+email);
out.println("<a href=logout.jsp>Logout</a>");
%>
<a href="showcart.jsp">Show cart</a>
<%
String qr="select * from product";
Statement st=con.createStatement();
ResultSet rs=st.executeQuery(qr);
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

			<a href="https://www.paypal.com/in/signin">BUY NOW</a><br/>
		<a href="cart.jsp?name=<%=name %>&price=<%=price %>&category=<%=category %>&company=<%=company %>">ADD TO CART</a>
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