package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.Principal;

public class AuthServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.isUserInRole("Administrator")){
            resp.getWriter().write("AuthServlet like Administrator" + System.lineSeparator());
            resp.getWriter().write(req.getRemoteUser() + System.lineSeparator());
            Principal principal = req.getUserPrincipal();
            resp.getWriter().write(principal.toString() + System.lineSeparator());
        }
    }
}
