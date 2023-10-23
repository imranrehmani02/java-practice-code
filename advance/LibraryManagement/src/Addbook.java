

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addbook
 */
@WebServlet("/Addbook")
public class Addbook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addbook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		 response.setContentType("text/html");  
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String genre=request.getParameter("genre");
		String price=request.getParameter("price");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
			String qr="insert into book values(?,?,?,?)";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(qr);
			ps.setString(1, id);
			ps.setString(2, name);
			ps.setString(3, genre);
			ps.setString(4, price);
			int i=ps.executeUpdate();
			if(i>0)
			{
				out.println("record added");
			}else
			{
				out.println("record not added");
			}
			con.close();
		} catch (Exception e) {
			
			out.println(e);
		}
			 	}
}