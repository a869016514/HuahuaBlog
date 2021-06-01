package com.huahua.blog.sys.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class sysController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
