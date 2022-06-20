import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

//create table logindetails(username varchar(20),password varchar(20));

public class Signup extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res){
        String user="root";
        String password="pandey";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skill?autoReconnect=true&useSSL=false",user,password);
            Statement st=con.createStatement();

            String name=req.getParameter("name");
            String pass=req.getParameter("pass");
            res.setContentType("text/html");
            PrintWriter pw=res.getWriter();
            String s="select * from logindetails";
            ResultSet rs=st.executeQuery(s);
            int flag=0;
            String temp;
            while(rs.next()){
                temp=rs.getString(1);
                if(temp.compareTo(name)==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                pw.println("The given username: "+name+" is already taken! Please try other username<br>");
                pw.println("<a href=\"http://localhost:8080/skilltest/new_account.html\">Click here to go to signup page</a>");
            }
            else{
                PreparedStatement ps=con.prepareStatement("insert into logindetails values(? , ?)") ;
                ps.setString(1,name);
                ps.setString(2,pass);
                ps.executeUpdate();
                pw.println("<h3>You have been registered Successfully</h3><br>");
                pw.println("<form action=\"http://localhost:8080/skilltest/event.html\" method=\"get\">");
                pw.println("<input type=\"hidden\" name=\"username\" value=\"" + name + "\">");
                pw.println("<input type=\"submit\" value=\"Proceed to enter Personal Details\" /></form>");
            }
            
            st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}