

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
			String qr="delete from developer where id=?";
			PreparedStatement ps=con.prepareStatement(qr);
			ps.setString(1, id);
			int i=ps.executeUpdate();
			RequestDispatcher rd=request.getRequestDispatcher("ViewServlet");
			if(i>0)
			{
				rd.include(request, response);
				out.println("record deleted");
			}else
				
				{
					rd.include(request, response);
					out.println("record not deleted");	
				}
			con.close();
		}catch(Exception e)
		{
			out.println(e);
		}

	}

}