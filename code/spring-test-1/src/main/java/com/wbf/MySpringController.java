package com.wbf;

import java.lang.String;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/test")
public class MySpringController {

    @RequestMapping(method = RequestMethod.GET)
    public String getMyName() {
        return "wubofeng";
    }

}
