

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		try
	
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			String qr="select * from developer";
			PreparedStatement st=con.prepareStatement(qr);
			ResultSet rs=st.executeQuery(qr);
			if(rs.next())
			{
				out.println("<table align=center border=1px cellpadding=7px cellspecing=1px>");
				out.println("<caption>Employee List</caption>");
				out.println("<br>");
				out.println("<tr>");
				out.println("<th>");
				out.println("ID");
				out.println("</th>");
				out.println("<th>");
				out.println("NAME");
				out.println("</th>");
				out.println("<th>");
				out.println("SALARY");
				out.println("</th>");
				out.println("<th>");
				out.println("EMAIL");
				out.println("</th>");
				out.println("<th>");
				out.println("CITY");
				out.println("</th>");
				out.println("<th>");
				out.println("DELETE");
				out.println("</th>");
				out.println("<th>");
				out.println("UPDATE");
				out.println("</th>");
				out.println("</tr>");
				do
					{
					
					String id=rs.getString("id");
					String name=rs.getString("name");
					String salary=rs.getString("salary");
					String email=rs.getString("email");
					String city=rs.getString("city");
					
					out.println("<tr>");
					out.println("<td>");
					out.println(id);
					out.println("</td>");
					out.println("<td>");
					out.println(name);
					out.println("</td>");
					out.println("<td>");
					out.println(salary);
					out.println("</td>");
					out.println("<td>");
					out.println(email);
					out.println("</td>");
					out.println("<td>");
					out.println(city);
					out.println("</td>");
					out.println("<td>");
					out.println("<a href=DeleteServlet?id="+id+">Delete</a>");
					out.println("</td>");
					out.println("<td>");
					out.println("<a href=UpdateServlet?id="+id+"&name="+name+"&salary="+salary+"&email="+email+"&city="+city+">Update</a>");
					out.println("</td>");
					out.println("</tr>");
				}while(rs.next());
				out.println("</table>");
			}
			else
			{
				out.println("no records found");
			}
			con.close();
		}catch(Exception e)
		{
			out.println(e);
		}
	}

}