package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Controller4 - doGet" + System.lineSeparator());
        resp.getWriter().write(getInitParameter("4param1") + System.lineSeparator());
        resp.getWriter().write(getInitParameter("4param2") + System.lineSeparator());
    }
}
