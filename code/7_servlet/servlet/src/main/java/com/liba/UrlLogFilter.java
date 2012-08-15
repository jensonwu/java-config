package com.liba;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class UrlLogFilter implements Filter {
    private String name;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.name = filterConfig.getFilterName();
        System.out.println("filter:" + this.name  + " => init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        System.out.println("filter: " + this.name + " => before chain. Url:   " + httpServletRequest.getRequestURL());

        chain.doFilter(request, response);

        System.out.println("filter: " + this.name + " => after chain. Url:   " + httpServletRequest.getRequestURL());
    }

    @Override
    public void destroy() {
        System.out.println("filter: " + this.name  + " => destroy ");
    }
}
