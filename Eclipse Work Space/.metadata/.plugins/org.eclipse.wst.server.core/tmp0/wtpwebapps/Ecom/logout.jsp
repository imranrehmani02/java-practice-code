<%
session.getAttribute("email");
		session.invalidate();
		RequestDispatcher rd=request.getRequestDispatcher("Ulogin.html");
		rd.include(request, response);
		out.println("LOGOUT SUCCESSFULLY");
		%>