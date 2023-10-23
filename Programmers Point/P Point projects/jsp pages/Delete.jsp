<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String name=request.getParameter("name");
String qr="delete from product where name=?";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
int i=ps.executeUpdate();
if(i>0)
{
	RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
	rd.include(request, response);
	out.println("record deleted");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("Show.jsp");
	rd.include(request, response);
	out.println("record not deleted");	
}
con.close();
%>