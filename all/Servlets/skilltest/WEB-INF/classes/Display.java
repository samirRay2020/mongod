import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Display extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="pandey";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            String username=req.getParameter("username");
            String s="select * from personalinfo where username=\""+username+"\"";
            ResultSet rs=st.executeQuery(s);
            String name="",college="",college_addr="",pin="",age="",gender="",dept="",mob="",email="",skills="";
            while(rs.next()){
                name=rs.getString(2);
                college=rs.getString(3);
                college_addr=rs.getString(4);
                pin=rs.getString(5);
                age=rs.getString(6);
                gender=rs.getString(7);
                dept=rs.getString(8);
                mob=rs.getString(9);
                email=rs.getString(10);
                skills=rs.getString(11);
            }
            pw.println("<center><h3>Profile of "+username+"</h3><br><br>");
            pw.println("<table style=\"border: 1px solid black\">");
            pw.println("<tr><th>Name</th><td>"+name+"</td></tr>");
            pw.println("<tr><th>College Name</th><td>"+college+"</td></tr>");
            pw.println("<tr><th>College Address</th><td>"+college_addr+"</td></tr>");
            pw.println("<tr><th>PIN Code</th><td>"+pin+"</td></tr>");
            pw.println("<tr><th>Age</th><td>"+age+"</td></tr>");
            pw.println("<tr><th>Gender</th><td>"+gender+"</td></tr>");
            pw.println("<tr><th>Department</th><td>"+dept+"</td></tr>");
            pw.println("<tr><th>Mobile Number</th><td>"+mob+"</td></tr>");
            pw.println("<tr><th>Email</th><td>"+email+"</td></tr>");
            pw.println("<tr><th>Skills</th><td>"+skills+"</td></tr></table></center>");

            pw.println("<form action=\"http://localhost:8080/skilltest/home.html\" method=\"get\">");
                pw.println("<input type=\"hidden\" name=\"username\" value=\"" + username + "\">");
                pw.println("<input type=\"submit\" value=\"Go back to home page\">");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}