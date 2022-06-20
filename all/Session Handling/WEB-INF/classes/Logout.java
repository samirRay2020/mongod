import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Logout extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                cookies[i].setMaxAge(0);
                res.addCookie(cookies[i]);
                System.out.println("Logout.java >> " + cookies[i]);
            }
        }

        HttpSession session = req.getSession(false);
        if (session != null) {
            session.invalidate();
            //System.out.println("Logout.java >> Destroying Session... SessionCount: " + CountUserListener.getSessionCount());
        }

        res.sendRedirect("index.html");
    }
}
