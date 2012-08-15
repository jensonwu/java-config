package com.liba;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class PostSessionMessageServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        List<String> messages = (List<String>) session.getAttribute("messages");
        messages.add(req.getParameter("m"));

        req.setAttribute("result", messages);
        req.getRequestDispatcher("/render.jsp").forward(req, resp);
    }
}
