package com.liba;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StartSessionServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Authenticator authenticator = (Authenticator) this.getServletContext().getAttribute("authenticator");
        if (authenticator.checkPassword(req.getParameter("user"), req.getParameter("password"))) {
            HttpSession session =  req.getSession();

            System.out.println("Session created");

            List<String> messages = new ArrayList<String>();
            messages.add(req.getParameter("user") + " login! ");
            session.setAttribute("messages", messages);

            req.setAttribute("result", messages);
            req.getRequestDispatcher("/render.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("index.html?m=lf");
        }
    }
}
