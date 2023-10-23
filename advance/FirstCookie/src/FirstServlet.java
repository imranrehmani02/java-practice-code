

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String n=request.getParameter("username");
		out.println("welcome "+n);
		
		Cookie ck=new Cookie("username",n);
		ck.setMaxAge(0);
		response.addCookie(ck);
		
		out.println("<form action='SecondServlet'>");
		out.println("<input type='submit' value='Go'>");
		out.println("</form>");
		
		out.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
