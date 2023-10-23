<%@page import="java.sql.*" %>
<%
String email=request.getParameter("email");
String password=request.getParameter("password");
session.setAttribute("email", email);
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");

String qr = "select password from user where email = '"+email+"'";
Statement st = con.createStatement();
ResultSet rs = st.executeQuery(qr);
String dbPassword;
if(rs.next())
	{
	dbPassword=rs.getString("password");
	if(email.equals(email)&&password.equals(dbPassword))
	{
		session.setAttribute("ids", email);
		//response.sendRedirect("adminhome.jsp");
		%>
		<jsp:forward page="Uhome.jsp"></jsp:forward>
		<%
	}
	else
	{
		out.println("Invalid password");
	}

}else out.println("id does not exist");
	

%>
