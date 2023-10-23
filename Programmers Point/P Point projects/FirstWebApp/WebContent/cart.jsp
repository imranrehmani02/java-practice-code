<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String name=request.getParameter("name");
String price=request.getParameter("price");
String cat=request.getParameter("cat");
String cmp=request.getParameter("cmp");
String img=request.getParameter("img");
String email=(String) session.getAttribute("id");
String qr="insert into cart values(?,?,?,?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, price);
ps.setString(3, cat);
ps.setString(4, cmp);
ps.setString(5, img);
ps.setString(6, email);
int i=ps.executeUpdate();
if(i>0)
{
RequestDispatcher rd=request.getRequestDispatcher("Uhome.jsp");
rd.include(request, response);
out.println("<script>window.alert('added to cart');</script>");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("Uhome.jsp");
	rd.include(request, response);
	out.println("<script>window.alert('not added to cart');</script>");	
}
%>




