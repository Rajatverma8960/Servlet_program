package com.kritter.servlet;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class sqServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        HttpSession ses = req.getSession();

        int i = (int)ses.getAttribute("k");

        int k=i*i;
        PrintWriter out = res.getWriter();
        out.println("Square"+k);
    }
}
