<h1 align="center">welcome to admin home</h1>
<%
String id=(String)session.getAttribute("ids");
%>
<%="welcome "+id %>
<a href="addpro.jsp">Add Product</a>
<a href="Show.jsp">Show Product</a>
