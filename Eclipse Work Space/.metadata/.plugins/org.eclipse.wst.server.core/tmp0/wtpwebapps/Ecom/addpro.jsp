<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Pro</title>
</head>
<body>
<form action="AddProduct.jsp">
NAME<input type="text" name="name" /><br>
PRICE<input type="text" name="price" /><br>
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
<input type="submit" value="AddProduct" />
</form>
</body>
</html>