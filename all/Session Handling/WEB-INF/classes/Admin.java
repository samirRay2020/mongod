import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Admin extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="abhay";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();

            String name=req.getParameter("name");
            String pass=req.getParameter("pass");

            String s="select * from admin where username=\'"+name+"\' and password=\'"+pass+"\'" ;
            ResultSet rs=st.executeQuery(s);
            res.setContentType("text/html");
            PrintWriter out=res.getWriter();
            if(rs.next()==false){
                Cookie cookie = new Cookie("adminLoggedIn", "false");
                res.addCookie(cookie);

                System.out.println("Admin.java >> Redirecting to URL: /admin.html");
                res.sendRedirect("admin.html");
            }
            else{
                Cookie cookie = new Cookie("adminLoggedIn", "true");
                res.addCookie(cookie);
                Cookie userId = new Cookie("name", name);
                res.addCookie(userId);

                System.out.println("Admin.java >> Redirecting to URL: /admin/dashboard");
                res.sendRedirect("dashboard");
            }
            st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}