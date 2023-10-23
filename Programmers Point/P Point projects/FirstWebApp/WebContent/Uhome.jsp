<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<h1 align="center">welcome to user home</h1>
<%
String email=(String) session.getAttribute("id");
out.println("welcome "+email);
out.println("<a href=Logout>Logout</a>");
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
		<a href="https://www.paypal.com/in/signin">BUY NOW</a><br/>
		<a href="cart.jsp?name=<%=name %>&price=<%=price %>&cat=<%=cat %>&cmp=<%=cmp %>&img=<%=img %>">ADD TO CART</a>
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