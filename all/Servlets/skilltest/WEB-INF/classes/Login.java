import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Login extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="pandey";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();

            String name=req.getParameter("name");
            String pass=req.getParameter("pass");

            String s="select * from logindetails where username=\'"+name+"\' and password=\'"+pass+"\'" ;
            ResultSet rs=st.executeQuery(s);
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            if(rs.next()==false){
                pw.println("Invalid Login");
                pw.println("<a href=\"http://localhost:8080/skilltest/event.html\">Go back to main page</a>");
            }
            else{
                pw.println("Login Successful!");
                pw.println("<form action=\"http://localhost:8080/skilltest/home.html\" method=\"get\">");
                pw.println("<input type=\"hidden\" name=\"username\" value=\"" + name + "\">");
                pw.println("<input type=\"submit\" value=\"Proceed to the home page\" style=\"background-color:transparent;text-decoration:underline;color:blue;cursor:pointer\" /></form>");
            }
            st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}