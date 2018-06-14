import java.io.IOException;  
import java.io.PrintWriter;  
   
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;  
   
@WebServlet("/hell2")
public class Dispatcherservlet extends HttpServlet {  
    public void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
   
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
       
        out.print("<h2>welcome to Splessons ServletFilters</h2>");  
           
    }  
   
}  