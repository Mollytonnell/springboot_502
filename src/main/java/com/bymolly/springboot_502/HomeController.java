package com.bymolly.springboot_502;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
