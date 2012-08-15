package com.liba;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AuthenticatorInitListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Authenticator authenticator = new Authenticator();
        sce.getServletContext().setAttribute("authenticator", authenticator);
        System.out.println("Authenticator is saved in application scope");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().removeAttribute("authenticator");
        System.out.println("Authenticator is removed in application scope");
    }
}
