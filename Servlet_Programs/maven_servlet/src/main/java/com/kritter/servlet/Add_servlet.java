package com.kritter.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class Add_servlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("name1"));
        int j = Integer.parseInt(req.getParameter("name2"));
        int k=i+j;

        PrintWriter out = res.getWriter();
        out.println("addition: "+k);

        // HttpSession session= req.getSessioddn();
        // session.setAttribute("k",k);

         //res.sendRedirect("sq");

        //http://mirrors.fibergrid.in/apache/tomcat/tomcat-7/v7.0.92/bin/apache-tomcat-7.0.92.tar.gz
    }
}
