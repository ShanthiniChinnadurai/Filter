import java.io.IOException;  
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
   
@WebServlet("/hello")
public class DemoServletFilters extends HttpServlet {  
    public void doPost(HttpServletRequest request, HttpServletResponse response, RequestDispatcher rd)  
            throws ServletException, IOException {  
   
        response.setContentType("text/html");  
        response.setCharacterEncoding("UTF-8");
        
        PrintWriter out = response.getWriter();  
       
        out.print("<h2>welcome to Splessons ServletFilters</h2>");  
       
            rd.forward(request, response);
            rd = request.getRequestDispatcher("/hell2");
    }  
   
}  