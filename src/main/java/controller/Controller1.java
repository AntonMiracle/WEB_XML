package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Controller1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String p1 = getServletContext().getInitParameter("1");
        String p2 = getServletContext().getInitParameter("2");
        String p3 = getServletContext().getInitParameter("3");
        String p4 = getServletContext().getInitParameter("4");
        String p5 = getServletContext().getInitParameter("param1");
        String p6 = getServletContext().getInitParameter("param2");
        resp.getWriter().write(p1+ System.lineSeparator());
        resp.getWriter().write(p2+ System.lineSeparator());
        resp.getWriter().write(p3+ System.lineSeparator());
        resp.getWriter().write(p4+ System.lineSeparator());
        resp.getWriter().write(p5 + System.lineSeparator());
        resp.getWriter().write(p6+ System.lineSeparator());
    }
}
