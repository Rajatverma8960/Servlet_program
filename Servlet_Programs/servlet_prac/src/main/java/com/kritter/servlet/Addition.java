package com.kritter.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Addition extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        int i = Integer.parseInt(req.getParameter("first"));
        int j = Integer.parseInt(req.getParameter("second"));
        int k=i+j;

        PrintWriter out= res.getWriter();
        out.println("Result of two no:"+k);
    }
}