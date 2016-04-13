import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Entry extends HttpServlet
{
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
      String n = req.getParameter("name");
    String a = req.getParameter("aadhar");
    String c = req.getParameter("contact");
     PrintWriter pw = resp.getWriter();
    pw.println("Welcome   "+n);
    
  }
    
}