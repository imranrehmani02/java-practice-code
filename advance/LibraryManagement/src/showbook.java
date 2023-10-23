

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Statement;

/**
 * Servlet implementation class showbook
 */
@WebServlet("/showbook")
public class showbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public showbook() {
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
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
			String qr="select * from book";
			Statement st=(Statement) con.createStatement();
			ResultSet rs=st.executeQuery(qr);
			if(rs.next())
			{
				out.println("<center><h1>All Books</h1></center>");
				out.println("<table align=center border=1px cellpadding=8px cellspecing=3px>");
				do
					
							{
					
					String id=rs.getString("id");
					String name=rs.getString("name");
					String genre=rs.getString("genre");
					String price=rs.getString("price");
					out.println("<tr>");
					out.println("<td>");
					out.println(id);
					out.println("</td>");
					out.println("<td>");
					out.println(name);
					out.println("</td>");
					out.println("<td>");
					out.println(genre);
					out.println("</td>");
					out.println("<td>");
					out.println(price);
					out.println("</td>");
					out.println("<td>");
					out.println("<a href=Delete?name="+name+">Delete</a>");
					out.println("</td>");
					out.println("<td>");
					out.println("<a href=Updatepro?name="+name+"&id="+id+"&genre="+genre+"&price="+price+">Update</a>");
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
