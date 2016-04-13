import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class NewFilter implements Filter
{
  @Override
  public void init(FilterConfig config) throws ServletException {
  }
  @Override
  public void destroy() {
  }
  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException 
  {
   
      Calendar c = Calendar.getInstance();
   int hr = c.get(c.HOUR_OF_DAY);
   if(hr>=9 && hr <= 17)
     chain.doFilter(req, res); // call the action page 
   else
   {
     PrintWriter out = res.getWriter();
     out.println("<body bgcolor=pink><h2><tt>");
     String u = req.getParameter("name");
     out.println("Sorry "+u+", U can visit from 9am to 5pm");
   }
  }
 }