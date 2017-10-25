package com.siyuanren.application.web.controller;

import com.siyuanren.application.core.exception.BaseException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("host", "http://siyuanren.com");
//        map.addAttribute("hello", "world");
        return "index";
    }

    @RequestMapping(value = "ex", method = RequestMethod.GET)
    public String ex() {
        throw new BaseException("test ex");
    }
}
