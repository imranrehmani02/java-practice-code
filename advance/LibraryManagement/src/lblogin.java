

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lblogin
 */
@WebServlet("/lblogin")
public class lblogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lblogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("lid");
		String pwd=request.getParameter("pwd");
		if(id.equals("admin")&&pwd.equals("admin123"))
		{
			response.sendRedirect("lbhome.html");
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("lib.html");
			rd.include(request, response);
			out.println("<script>window.alert('invalid id and password')</script>");
		}
		}
	}


