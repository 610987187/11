package com.xdclass.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aa {
    @RequestMapping("/index")
    public String hello(){
        //22
        //55
        //33
        return "h111111111111";
    }
}
