import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public void DemoServReq extends HttpServlet{
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      response.setContentType("text/html");
      PrintWriter pw = response.getWriter();
      String name = request.getParameter("name");
      
      pw.println("Welcome "+name);
      pw.close();
   }

}
