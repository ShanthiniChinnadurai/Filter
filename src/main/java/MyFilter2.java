//package servletfilter;

import java.io.IOException;  
import java.io.PrintWriter;  
   
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;  

   @WebFilter("/hello")
public class MyFilter2 implements Filter{  
   
public void init(FilterConfig arg0) throws ServletException {
   //initialization of filter
}  
       
public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {  
           
   PrintWriter out=response.getWriter();  
   String userName2 = request.getParameter("userName");
   out.print("<h2>Hello "+userName2+"</h2>");  
           
   chain.doFilter(request, response);//sends request to next resource  
           
   out.print("<h2>Thank you "+userName2+"</h2>");  
   }  
   public void destroy() {
   //servlet filter destroy
   }  
}  