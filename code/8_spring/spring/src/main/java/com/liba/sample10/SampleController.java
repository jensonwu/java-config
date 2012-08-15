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
public class SampleController {
    @RequestMapping("/sample1")
    public void handle(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("this is a test!");
    }

    @RequestMapping("/sample2")
    public void handle2(@RequestParam String name, HttpServletResponse response) throws IOException {
        response.getWriter().println("this is a test! " + name);
    }

    @RequestMapping("/sample3")
    @ResponseBody
    public String handle3(@RequestParam String name) {
        return "this is a test! " + name;
    }

    @RequestMapping(value ="/sample4", produces = {"application/json"})
    @ResponseBody
    public String handle4(@RequestParam String name) {
        return "{\"content\" : \"this is a test! " + name + "\" }";
    }

    @RequestMapping(value ="/sample5/{id}")
    @ResponseBody
    public String handle5(@PathVariable String id) {
        return "id is " + id;
    }
}
