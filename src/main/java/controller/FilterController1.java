package controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import static java.lang.System.lineSeparator;

@WebServlet("/filterController1")
public class FilterController1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write(this.getClass().toString() + lineSeparator());
        writer.write(req.getUserPrincipal().toString() + lineSeparator());
        writer.write(req.getSession().getId() +lineSeparator());
        Enumeration<String> attributeNames = req.getSession().getAttributeNames();
        while(attributeNames.hasMoreElements()){
            String elem = attributeNames.nextElement();
            writer.write("ATTRIBUTE : " + elem + " " + req.getSession().getAttribute(elem).toString() + lineSeparator());
        }

    }
}
