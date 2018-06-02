package controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("initialization start");
        ServletContext context = getServletContext();
        context.setInitParameter("1", "StringValue");
        context.setInitParameter("2", String.valueOf(2));
        context.setInitParameter("3", String.valueOf(false));
        context.setInitParameter("4", String.valueOf(4.4));
        System.out.println("initialized complete");

    }
}
