package com.xdclass.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aa {
    @RequestMapping("/index")
    public String hello(){
        System.out.println("aaa");
        //ll
        //22
        return "h111111111111";
    }
}
