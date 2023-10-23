<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<h1>this is jsp page</h1>
<%
String s="hello";
out.println(s);
%>
<%!String b="global variable"; %>
<h1><%=b %></h1>
</body>
</html>









