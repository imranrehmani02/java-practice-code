<%@page errorPage="error.jsp"%>
<%@include file="db.jsp"%>
<%
String name=request.getParameter("name");
String email=request.getParameter("email");
String password=request.getParameter("password");
String qr="insert into user values(?,?,?)";
PreparedStatement ps=con.prepareStatement(qr);
ps.setString(1, name);
ps.setString(2, email);
ps.setString(3, password);
int i=ps.executeUpdate();
if(i>0)
{
	RequestDispatcher rd=request.getRequestDispatcher("Ulogin.html");
	rd.include(request, response);
	out.println("successfully registered");
}
else
{
	RequestDispatcher rd=request.getRequestDispatcher("Uregs.html");
	rd.include(request, response);
	out.println("registration failed");
}
con.close();
%>