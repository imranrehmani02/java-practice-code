

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
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html");  
	        PrintWriter out=response.getWriter();  
	         
	        String id=request.getParameter("id");
	        String name=request.getParameter("name");  
	        String salary=request.getParameter("salary");  
	        String email=request.getParameter("email");  
	        String city=request.getParameter("city");  
	          
	        try
	        {
	        	Class.forName("oracle.jdbc.driver.OracleDriver");  
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
				  
				PreparedStatement ps=con.prepareStatement("insert into developer values(?,?,?,?,?)");  
				  
				ps.setString(1,id);  
				ps.setString(2,name);  
				ps.setString(3,salary);  
				ps.setString(4,email);
				ps.setString(5,city);
				          
				int i=ps.executeUpdate();  
	       
	        if(i>0){  
	            out.println("<p>Record saved successfully!</p>");  
	            RequestDispatcher rd=request.getRequestDispatcher("/index.html");
	            rd.include(request, response);
	        }
	        else
	        {  
	            out.println("Sorry! unable to save record");  
	        }  
	          
	        con.close();  
	        }catch (Exception e) {
			
			out.println(e);
		}
	}
}