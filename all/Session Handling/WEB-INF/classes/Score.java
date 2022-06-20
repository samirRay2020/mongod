import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Score extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="abhay";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();

            String username=req.getParameter("username");
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            pw.println("<h3> Test Results for user: "+username);
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
            String a1,a2;
            if(Arrays.asList(sk).contains("C")){
                pw.println("<h4>C</h4>");
                a1=req.getParameter("cq1");
                a2=req.getParameter("cq2");
                s="select answer from cqs where question=\"q1\"";
                String r1="",r2="";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r1=rs.getString(1);
                }
                s="select answer from cqs where question=\"q2\"";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r2=rs.getString(1);
                }
                int c=0;
                if(a1.compareTo(r1)==0){
                    c+=1;
                }
                if(a2.compareTo(r2)==0){
                    c+=1;
                }
                pw.println("Score: "+c+"/2<br><br>");
            }
            if(Arrays.asList(sk).contains("Java")){
                pw.println("<h4>Java</h4>");
                a1=req.getParameter("jq1");
                a2=req.getParameter("jq2");
                s="select answer from javaqs where question=\"q1\"";
                String r1="",r2="";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r1=rs.getString(1);
                }
                s="select answer from javaqs where question=\"q2\"";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r2=rs.getString(1);
                }
                int c=0;
                if(a1.compareTo(r1)==0){
                    c+=1;
                }
                if(a2.compareTo(r2)==0){
                    c+=1;
                }
                pw.println("Score: "+c+"/2<br><br>");
            }
            if(Arrays.asList(sk).contains("Python")){
                pw.println("<h4>Python</h4>");
                a1=req.getParameter("pq1");
                a2=req.getParameter("pq2");
                s="select answer from pythonqs where question=\"q1\"";
                String r1="",r2="";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r1=rs.getString(1);
                }
                s="select answer from pythonqs where question=\"q2\"";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r2=rs.getString(1);
                }
                int c=0;
                if(a1.compareTo(r1)==0){
                    c+=1;
                }
                if(a2.compareTo(r2)==0){
                    c+=1;
                }
                pw.println("Score: "+c+"/2<br><br>");
            }
            if(Arrays.asList(sk).contains("C++")){
                pw.println("<h4>C++</h4>");
                a1=req.getParameter("cpq1");
                a2=req.getParameter("cpq2");
                s="select answer from cppqs where question=\"q1\"";
                String r1="",r2="";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r1=rs.getString(1);
                }
                s="select answer from cppqs where question=\"q2\"";
                rs=st.executeQuery(s);
                while(rs.next()){
                    r2=rs.getString(1);
                }
                int c=0;
                if(a1.compareTo(r1)==0){
                    c+=1;
                }
                if(a2.compareTo(r2)==0){
                    c+=1;
                }
                pw.println("Score: "+c+"/2<br><br>");
            }
            pw.println("Thank you for taking the test");
            pw.println("<form action=\"http://localhost:8080/1005_ex5/home.html\" mathod=\"get\">");
            pw.println("<input type=\"hidden\" name=\"username\" value=\"" + username + "\">");
            pw.println("<input type=\"submit\" value=\"Go back to the home page\" /></form>");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}