package controller;

import model.Role;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.lineSeparator;

@WebServlet("/filterController1")
public class FilterController1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write(this.getClass().toString() + lineSeparator());
        writer.write(req.getSession().getId() + lineSeparator());
        writer.write("session is new ? : " + String.valueOf(req.getSession().isNew()) + lineSeparator());

        Role role = new Role();
        role.setId(100231L);
        role.setName("RoleName");
        Cookie[] cookies = req.getCookies();
        writer.write("COOKIES:");
        for (Cookie c : cookies) {
            writer.write(c.toString() + lineSeparator());
        }
        writer.write("END COOKIES" + lineSeparator());

    }
}
