

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpadteServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
		
		out.println("<table align='center' border='2px'>");
		out.println("<form action=UpdateS>");
		out.println("<caption>Update</caption>");
		out.println("<tr><td>Id: </td> <td><input type=number required name=id value="+id+"></td></tr>");
		out.println("<tr><td>Name: </td> <td><input type=text required name=name value="+name+"></td></tr>");
		out.println("<tr><td>Salary: </td> <td><input type=number required name=salary value="+salary+"></td></tr>");
		out.println("<tr><td>Email: </td> <td><input type=email required name=email value="+email+"></td></tr>");
		out.println("<tr><td>City : </td> <td><select name=city required value="+city+" style=widht:150px>");
		out.println("<option></option>");
		out.println("<option>Indore</option>");
		out.println("<option>Ratlam</option>");
		out.println("<option>Bhopal</option>");
		out.println("<option>Ujjain</option>");
		out.println("<option>others</option></td></tr>");
		out.println("</select>");
		out.println("<tr><td><input type=submit value=Update></td></tr>");
		out.println("</form>");
		out.println("</table>");
	}

}
