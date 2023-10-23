<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Error Page Example</title>
</head>
<body>
<%@ page errorPage="errorpage.jsp" %>
<%= 100/0 %>
</body>
</html>