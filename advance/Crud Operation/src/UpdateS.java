

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

/**
 * Servlet implementation class UpdateS
 */
@WebServlet("/UpdateS")
public class UpdateS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateS() {
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
		String salary=request.getParameter("salary");
		String email=request.getParameter("email");
		String city=request.getParameter("city");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			String qr="update developer set name=?, salary=?, email=?, city=? where id=?";
			java.sql.PreparedStatement ps=con.prepareStatement(qr);
			
			ps.setString(1, name);
			ps.setString(2, salary);
			ps.setString(3, email);
			ps.setString(4, city);
			ps.setString(5, id);
			
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("ViewServlet");
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
