

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();

    }
        
    

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        out.println("<h1 align='center'>Output of Calculator</h1>");
        
        
		String n1=request.getParameter("n1");
        String n2=request.getParameter("n2");
        String ch=request.getParameter("ch");
    
        int a=Integer.parseInt(n1);
        int b=Integer.parseInt(n2);
        
        switch (ch)
        {
        case "Add":
       out.println("Addition is "+(a+b));
        break;
        
        case "Sub":
        out.println("Substriction is "+(a-b));
        break;
        
        case "Mul":
        out.println("Multipication is "+(a*b));
        break;
        
        case "Div":
        try
        {
        out.println("Division is "+(a/b));
        break;
        } catch(Exception e)
        {
        out.println("Cant divided by zero");	
        }
        
        case "Per":
        {
        	out.println("Pescentage is "+(a*b/100));
        	break;
        	
        }
        }
		// TODO Auto-generated method stub
	}

}
