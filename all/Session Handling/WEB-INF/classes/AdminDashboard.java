import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AdminDashboard extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        PrintWriter out = res.getWriter();
        CountUserListener c=new CountUserListener();
        int users = c.getSessionCount();
        out.println("<!DOCTYPE html><html><head><title>Admin DashBoard</title>");
        out.println("</head><body>");
        out.println("<center><form action='logout'><h3>There are "+users+" currently logged in</h3>");
        out.println("<button type='submit'>Logout</button></form></center>");
        out.println("</body></html>");

    }
}

