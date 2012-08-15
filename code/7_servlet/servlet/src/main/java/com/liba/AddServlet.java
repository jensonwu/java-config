package com.liba;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

public class AddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int a = Integer.valueOf(req.getParameter("a"));
        int b = Integer.valueOf(req.getParameter("b"));

        req.setAttribute("result", Arrays.asList(String.valueOf(a + b)));

        req.getRequestDispatcher("/render.jsp").forward(req, resp);

        System.out.println("servlet:" + this.getServletName() + " => "  + this.hashCode());
    }
}
