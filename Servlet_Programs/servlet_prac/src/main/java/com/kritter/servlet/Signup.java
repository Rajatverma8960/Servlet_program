package com.kritter.servlet;

import org.apache.log4j.BasicConfigurator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.lang.*;
import java.util.logging.Logger;


public class Signup extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {

        Logger logger = Logger.getLogger(String.valueOf(Signup.class));
        BasicConfigurator.configure();


        logger.info("All the Logs for servlet");

        String First_name= req.getParameter("first");
        String last_name = req.getParameter("second");
        String Teen=req.getParameter("age-16-24");
        String adult= req.getParameter("age-25-50");
        String Senior = req.getParameter("age-51-80");
        String Email = req.getParameter("Email");
        String Pass= req.getParameter("pass");

        PrintWriter outx = res.getWriter();

        HttpSession session= req.getSession();
        if(session.isNew())
        {
            //outx.println("Welcome");
            session.setAttribute("user_id",Email);
        }
        else
        {
            //outx.println("Welcome back");
        }


        res.setContentType("text/html");

        String docType =
                "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";


        PrintWriter out = res.getWriter();

        out.println(docType+ "<html>\n"+
                "<body>\n"+
                "<center>"+
                "<h2 style='padding-top: 50px;\n" +
                "    height: 100px;\n" +
                "    font-size: xx-large;\n" +
                "    color: #28af2e;\n" +
                "    background-color: black;'>" +
                "Thank-You Your Account is created Succesfully" +"</h2>"+
                "<u>"+"Your login details are:"+"</u><br><br>"
                +"Email:"+session.getAttribute("user_id")+
                "<br>Password:"+Pass+"xxxxxxxx"
                +"<br>Account Name:"+First_name+" "+last_name

                +"<br><a href='Login'>" +
                "<input style='margin-top: 50px;\n" +
                "    width: 12%;color: white;\n" +
                "    border: none;\n" +
                "    padding: 9px;\n" +
                "    border-radius: 7px;\n" +
                "    font-style: italic;\n" +
                "    background-color: #5a9420;' type='button' value='Login'>" +
                "</a>"
                 );

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost/Java_DB","root","9335");

            Statement st=con.createStatement();

            String sql= "insert into emp_servlet values ('"+First_name+"','"+last_name+"','"+Email+"','"+Pass+"')";
            st.executeUpdate(sql);
            //out.println(sql);

        }
        catch (Exception e)
        {
           out.println(e);
        }

        out.println("<center></body>"+"<html>");

        out.close();

    }
}
