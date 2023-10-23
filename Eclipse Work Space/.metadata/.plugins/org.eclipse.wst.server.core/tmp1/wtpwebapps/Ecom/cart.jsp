<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String name=request.getParameter("name");
String price=request.getParameter("price");
String category=request.getParameter("category");
String company=request.getParameter("company");
String email=(String) session.getAttribute("email");
String qr="insert into cart values(?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, price);
ps.setString(3, category);
ps.setString(4, company);
ps.setString(5, email);
int i=ps.executeUpdate();
if(i>0)
{
RequestDispatcher rd=request.getRequestDispatcher("Uhome.jsp");
rd.include(request, response);
out.println("<script>windows.alert('added to cart')</script>");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("Uhome.jsp");
	rd.include(request, response);
	out.println("<script>windows.alert('not added to cart')</script>");	
}
%>




