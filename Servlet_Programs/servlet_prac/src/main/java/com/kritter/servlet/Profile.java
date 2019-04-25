package com.kritter.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Profile extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse response) throws IOException
    {
        String id=(String)req.getParameter("Email");
        String pass=(String)req.getParameter("pass");

        PrintWriter out = response.getWriter();
        //out.println("Email: "+id+" Pass: "+pass);

        HttpSession session=req.getSession(false);
        String id_x = (String)session.getAttribute("user_id");

        String id_db = null;
        String ps_db = null;
        String f_name = null;
        String l_name = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Java_DB","root","9335");
            Statement st = con.createStatement();
            String sql =" Select * from emp_servlet where email='"+id+"' AND pass='"+pass+"'";
            ResultSet rs = st.executeQuery(sql);
                while (rs.next())
                {
                    id_db=rs.getString("email");
                    ps_db=rs.getString("pass");
                    f_name=rs.getString("first");
                    l_name=rs.getString("last");
                }
            }
            catch (Exception e) {        }

        if(id_x.equals(id_db) && pass.equals(ps_db))
        {
            //out.println("DB_email:"+id_db+" DB_Pass:"+ps_db+" Session_value:"+id_x);

            String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";

            out.println(docType+"<html>\n"+
                    "<body>\n"+
                    "<center>"+
                    "<h2 style='padding-top: 50px;\n" +
                    "    height: 130px;\n" +
                    "    font-size: xx-large;\n" +
                    "    color: #28af2e;\n" +
                    "    background-color: black;'>" +
                    "Profile Page <br>" +
                    "You have made successfull login......" +"</h2>"+
                    "<u>"+"Hello!"+f_name+" "+l_name+"</u><br><br><br>"
                    +"<h3>Email:"+id_x+
                    "<br>Password:"+ps_db+"xxxxxxxx"
                    +"<br>Account Name:"+f_name+" "+l_name+"</h3>"
                     );

        }
        else
        {
            response.sendRedirect("/myapp/Login");
        }

    }

}
