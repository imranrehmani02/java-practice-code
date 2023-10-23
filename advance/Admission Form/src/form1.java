

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class form1
 */
@WebServlet("/form1")
public class form1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public form1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		
		String fname=request.getParameter("fname");
		String femail=request.getParameter("femail");
		String fpassword=request.getParameter("fpassword");
		String fcont=request.getParameter("fcont");
		String fgen=request.getParameter("fgen");
		
		out.println("Form Submitted");
		out.println(fname);
		out.println(femail);
		out.println(fpassword);
		out.println(fcont);
		out.println(fgen);
		
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");  
			  
			PreparedStatement ps=con.prepareStatement("insert into formdata values(?,?,?,?,?)");  
			  
			ps.setString(1,fname);  
			ps.setString(2,femail);  
			ps.setString(3,fpassword);  
			ps.setString(4,fcont);
			ps.setString(5,fgen);
			          
			int i=ps.executeUpdate();  
			if(i>0)  
			{
			out.println("You are successfully registered...");  
			}
			
			else
			 {
			out.println("You are not registered...");  
			 }
			 con.close();
			}
		
			 catch(Exception e2) 
			 {
			System.out.println(e2);
			} 
	}
}