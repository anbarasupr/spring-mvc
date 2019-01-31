package filter;
import java.io.IOException;  
import java.io.PrintWriter;  
  
import javax.servlet.*;  
  
public class MyFilterInter implements Filter{  
  
public void init(FilterConfig arg0) throws ServletException {}  
      
public void doFilter(ServletRequest req, ServletResponse resp,  
    FilterChain chain) throws IOException, ServletException {  
          
    PrintWriter out=resp.getWriter();  
    out.println("MyFilterInter is invoked before");  
    System.out.println("MyFilterInter is invoked before");  

          
    chain.doFilter(req, resp);//sends request to next resource  
          
    out.println("MyFilterInter is invoked after"); 
    System.out.println("MyFilterInter is invoked after");  

    }  
    public void destroy() {}  
}  