package com.siyuanren.application.web.controller;

import com.siyuanren.application.exception.BaseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "hello world";
    }

    @RequestMapping(value = "ex", method = RequestMethod.GET)
    public String ex() {
        throw new BaseException("test ex");
    }

}
