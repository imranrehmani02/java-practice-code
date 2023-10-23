<%@page errorPage="error.jsp" %>
<%@include file="db.jsp" %>
<%
String name=request.getParameter("name");
String price=request.getParameter("price");
String category=request.getParameter("category");
String company=request.getParameter("company");

String qr="update product set price=?,category=?,company=? where name=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, price);
ps.setString(2, category);
ps.setString(3, company);
ps.setString(4, name);
int i=ps.executeUpdate();
if(i>0)
{
	RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
	rd.include(request, response);
	out.println("updated");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
	rd.include(request, response);
	out.println("not updated");	
}
con.close();
%>