package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/")
    public String main(){
        return "main";
    }

    @RequestMapping("/hi")
    @ResponseBody
    public String hi(){
        return "Hello  sbb 2022.09.16";
    }
}
