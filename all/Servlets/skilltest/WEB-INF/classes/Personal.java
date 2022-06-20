import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

//create table personalinfo(username varchar(20),name varchar(30),college varchar(30),college_addr varchar(50),pin varchar(6),age varchar(3),gender varchar(8),
//                          department varchar(15),mobile varchar(10),email varchar(30),skills varchar(40));

public class Personal extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="pandey";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();

            String username=req.getParameter("username");
            String name=req.getParameter("Name");
            String college=req.getParameter("College Name");
            String college_addr=req.getParameter("College Address");
            String pin=req.getParameter("PIN Code");
            String age=req.getParameter("Age");
            String gender=req.getParameter("gender");
            String dept=req.getParameter("department");
            String mob=req.getParameter("Contact Number");
            String email=req.getParameter("Email");
            String[] skills=req.getParameterValues("Skills");
            String s="";
            for(int i=0;i<skills.length-1;i++){
                s+=skills[i];
                s+=',';
            }
            s+=skills[skills.length-1];

            PreparedStatement q=con.prepareStatement("insert into PersonalInfo values(?,?,?,?,?,?,?,?,?,?,?)");
            q.setString(1,username);
            q.setString(2,name);
            q.setString(3,college);
            q.setString(4,college_addr);
            q.setString(5,pin);
            q.setString(6,age);
            q.setString(7,gender);
            q.setString(8,dept);
            q.setString(9,mob);
            q.setString(10,email);
            q.setString(11,s);

            q.executeUpdate();
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            pw.println("Personal details for user: "+username+" updated successfully");
            pw.println("<form action=\"http://localhost:8080/skilltest/home.html\" method=\"get\">");
            pw.println("<input type=\"hidden\" name=\"username\" value=\"" + username + "\">");
            pw.println("<input type=\"submit\" value=\"Proceed to Home Page\" /></form>");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}