<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<table align="center" border="1px">
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
		<tr>
		<td><%=name %></td>
		<td><%=price %></td>
		<td><%=category %></td>
		<td><%=company %></td>

		<td><a href="Delete.jsp?name=<%=name %>">Delete</a></td>
		<td><a href="UpdatePro.jsp?name=<%=name%>&price=<%=price%>&category=<%=category%>&company=<%=company%>">Update</a></td>
		</tr>
		<%
	}while(rs.next());
}
else
{
	out.println("no records found");
}
con.close();
%>
</table>