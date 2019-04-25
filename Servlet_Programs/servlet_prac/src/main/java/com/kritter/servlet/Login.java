package com.kritter.servlet;

import org.apache.log4j.BasicConfigurator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class Login extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse res) throws IOException {

        PrintWriter out= res.getWriter();
        HttpSession session=request.getSession(false);
        String n=(String)session.getAttribute("user_id");

        out.println("<head>"+"<meta charset='UTF-8'>"+

                "<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'>"+
                "<script src='https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js'></script>"+
                "<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'></script>"+

                "<title>Login</title>"+
                "</head>"+
                "<body>"+
                "<center>"+
                        "<h2 style='padding-top: 50px;\n" +
                        "    height: 100px;\n" +
                        "    font-size: xx-large;\n" +
                        "    color: #28af2e;\n" +
                        "    background-color: black;'>" +
                        "Login Form : Hi! "+n+"</h2>"+


                "<form class='form-horizontal' action='profile' method='post'>"+
                "<div class='container'>"+

                "<div class='form-group'>"+
                "<label class='control-label col-sm-4'>Email-Id:</label>"+
                "<div class='col-sm-8'>"+
                "<input type='email' class='form-control' name='Email' placeholder='Email-Id'>"+
                "</div>"+
                "</div>"+

                 "<div class='form-group'>"+
                 "<label class='control-label col-sm-4'>Password:</label>"+
                 "<div class='col-sm-8'>"+
                 "<input type='password' class='form-control' name='pass' placeholder='Password'>"+
                 "</div>"+
                 "</div>"+

                "<input style='margin-top: 50px; width: 12%;color: white;border: none;padding: 9px; border-radius: 7px;font-style: italic; background-color: #5a9420;'"+
                " type='submit' name='Login' value='Login'>"+
                "</form></div>"+

                "</center>"+"</body>"
        );

        out.close();
    }
}
