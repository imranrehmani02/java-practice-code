import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.PreparedStatement;

/**
 * Servlet implementation class updatebook
 */
@WebServlet("/updatebook")
public class updatebook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updatebook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String genre=request.getParameter("genre");
		String price=request.getParameter("price");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","root");
			String qr="update book set id=?,genre=?,price=? where name=?";
			PreparedStatement ps=(PreparedStatement) con.prepareStatement(qr);
			ps.setString(4, name);
			ps.setString(1, id);
			ps.setString(2, genre);
			ps.setString(3, price);
			
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("showbook");
			if(i>0)
			{
				rd.include(request, response);
				out.println("Record Updated");
			}else
			{
				rd.include(request, response);
				out.println("Record not updated");
			}
			con.close();
			
		}catch(Exception e)
		{
			out.println(e);
		}

	}

}
