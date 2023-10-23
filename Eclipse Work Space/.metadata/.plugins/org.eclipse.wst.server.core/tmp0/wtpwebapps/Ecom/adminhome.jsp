<h1 align="center">Welcome to Admin Home</h1>
<%
String id=(String)session.getAttribute("ids");
%>
<%="welcome "+id %>
<br/>
<a href="addpro.jsp">Add Product</a>
<br/>
<a href="Delpro.html">Delete Product</a>
<br/>
<a href="Update.html">Update Product</a>
<br/>
<a href="Show.jsp">Show Product</a>