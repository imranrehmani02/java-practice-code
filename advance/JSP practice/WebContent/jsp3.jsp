<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "JSP Declaration tag" %><br><br>
<%! int a=10;
int b=20;
int c=a+b;%>

<%= "addition is :"+c%>
</body>
</html>