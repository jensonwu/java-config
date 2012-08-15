package com.liba;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginFilter implements Filter {
    private String name;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.name = filterConfig.getFilterName();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpSession session = httpServletRequest.getSession(false);
        if (session == null) {
            HttpServletResponse httpServletResponse = (HttpServletResponse) response;

            System.out.println("filter: " + this.name + " => Not login redirect to login page");
            httpServletResponse.sendRedirect("index.html?m=nl");
        } else {
            System.out.println("filter: " + this.name + " => logined ");
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
