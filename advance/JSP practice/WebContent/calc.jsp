<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP use bean</title>
</head>
<body>
<jsp:useBean id="one" class="Calc"/>
<%
int m=one.cube(5);
out.println("cube is :"+m);
%>
</body>
</html>