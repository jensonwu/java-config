package com.liba.sample10;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class SampleController2 {
    @RequestMapping("/jrebel")
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("this is a testdfefeefefef!");
    }
}
