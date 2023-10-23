<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddProduct.jsp">
NAME<input type="text" name="name" /><br>
PRICE<input type="number" name="price" /><br>
CAT<select name="cat">
<option>MOBILE</option>
<option>LAPTOP</option>
<option>TV</option>
<option>TAB</option>
<option>AC</option>
</select><br>
CMP<select name="cmp">
<option>SAMSUNG</option>
<option>XIAOMI</option>
<option>DELL</option>
<option>LG</option>
</select><br>
<input type="submit" value="AddProduct" />
</form>
</body>
</html>