<%
String name=request.getParameter("name");
String price=request.getParameter("price");
String category=request.getParameter("category");
String company=request.getParameter("company");
%>
<form action="Update.jsp">

OLD NAME<input type="text" name="name" value="<%=name %>" /><br>
PRICE<input type="number" name="price" value="<%=price %>"><br>
CATEGORY<select name="category">
<option></option>
<option>MOBILE</option>
<option>LAPTOP</option>
<option>TV</option>
<option>TAB</option>
<option>AC</option>
</select><br>
COMPANY<select name="company">
<option></option>
<option>SAMSUNG</option>
<option>XIAOMI</option>
<option>DELL</option>
<option>LG</option>
</select><br>
<input type="submit" value="Update" />
</form>