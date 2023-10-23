<%
String id=request.getParameter("id");
String pwd=request.getParameter("pwd");
if(id.equals("admin")&&pwd.equals("12345"))
{
	session.setAttribute("ids", id);
	//response.sendRedirect("adminhome.jsp");
	%>
	<jsp:forward page="adminhome.jsp"></jsp:forward>
	<%
}
else
{
	out.println("Invalid id and password");
}
%>