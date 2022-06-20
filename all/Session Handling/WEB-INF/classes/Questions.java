import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Questions extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="abhay";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();

            String username=req.getParameter("username1");
            String s="select skills from personalinfo where username=\""+username+"\"";
            ResultSet rs=st.executeQuery(s);
            Cookie[] cookies = req.getCookies();
            String userId = username;
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equals("userId")) {
                    userId = cookies[i].getValue();
                }
            }
            String skills="";
            while(rs.next()){
                skills=rs.getString(1);
            }
            String[] sk=skills.split(",");
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            pw.println("<center><h3>Skill Test</h3></center>");
            pw.println("<form action=\"score\" method=\"post\">");
            pw.println("<input type=\"hidden\" name=\"username\" value=\"" + username + "\">");
            if(Arrays.asList(sk).contains("C")){
                pw.println("<h4>C</h4>");
                pw.println("Q1: Who designed C language?");
                pw.println("<br><input type=\"radio\" name=\"cq1\" value=\"Dennis Ritchie\" required />Dennis Ritchie<br>");
                pw.println("<input type=\"radio\" name=\"cq1\" value=\"Steve Jobs\" />Steve Jobs<br>");
                pw.println("<input type=\"radio\" name=\"cq1\" value=\"Guido van Rossum\" />Guido van Rossum<br><br><br>");

                pw.println("Q2: Identify invalid variable");
                pw.println("<br><input type=\"radio\" name=\"cq2\" value=\"0a32\" required />0a32<br>");
                pw.println("<input type=\"radio\" name=\"cq2\" value=\"_abc4\" />_abc4<br>");
                pw.println("<input type=\"radio\" name=\"cq2\" value=\"A_id\" />A_id<br><br><br>");
            }
            if(Arrays.asList(sk).contains("Java")){
                pw.println("<h4>Java</h4>");
                pw.println("Q1: Who designed Java?");
                pw.println("<br><input type=\"radio\" name=\"jq1\" value=\"Dennis Ritchie\" required />Dennis Ritchie<br>");
                pw.println("<input type=\"radio\" name=\"jq1\" value=\"James Gosling\" />James Gosling<br>");
                pw.println("<input type=\"radio\" name=\"jq1\" value=\"Steve Jobs\" />Steve Jobs<br><br><br>");

                pw.println("Q2: Number of access modifiers are: ");
                pw.println("<br><input type=\"radio\" name=\"jq2\" value=\"3\" required />3<br>");
                pw.println("<input type=\"radio\" name=\"jq2\" value=\"4\" />4<br>");
                pw.println("<input type=\"radio\" name=\"jq2\" value=\"5\" />5<br><br><br>");
            }
            if(Arrays.asList(sk).contains("Python")){
                pw.println("<h4>Python</h4>");
                pw.println("Q1: Who designed Python language?");
                pw.println("<br><input type=\"radio\" name=\"pq1\" value=\"Dennis Ritchie\" required />Dennis Ritchie<br>");
                pw.println("<input type=\"radio\" name=\"pq1\" value=\"Steve Jobs\" />Steve Jobs<br>");
                pw.println("<input type=\"radio\" name=\"pq1\" value=\"Guido van Rossum\" />Guido van Rossum<br><br><br>");

                pw.println("Q2: Module that contains heapq: ");
                pw.println("<br><input type=\"radio\" name=\"pq2\" value=\"math\" required />math<br>");
                pw.println("<input type=\"radio\" name=\"pq2\" value=\"numpy\" />numpy<br>");
                pw.println("<input type=\"radio\" name=\"pq2\" value=\"collections\" />collections<br><br><br>");
            }
            if(Arrays.asList(sk).contains("C++")){
                pw.println("<h4>C++</h4>");
                pw.println("Q1: Who designed C++ language?");
                pw.println("<br><input type=\"radio\" name=\"cpq1\" value=\"Dennis Ritchie\" required />Dennis Ritchie<br>");
                pw.println("<input type=\"radio\" name=\"cpq1\" value=\"Steve Jobs\" />Steve Jobs<br>");
                pw.println("<input type=\"radio\" name=\"cpq1\" value=\"Bjarne Stroustrup\" />Bjarne Stroustrup<br><br><br>");

                pw.println("Q2: Number of access modifiers in C++: ");
                pw.println("<br><input type=\"radio\" name=\"cpq2\" value=\"3\" required />3<br>");
                pw.println("<input type=\"radio\" name=\"cpq2\" value=\"2\" />2<br>");
                pw.println("<input type=\"radio\" name=\"cpq2\" value=\"4\" />4<br><br><br>");
            }
            pw.println("<input type=\"submit\" value=\"Submit Test\" />");
            pw.println("</form>");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}