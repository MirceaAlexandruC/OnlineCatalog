package com.mac.onlinecatalog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
//    / din ( " " ) este demumirea si se pune in fisierul de html dorit, sub forma unui th: href= "@{ / }"
    public String index(){
        return "index";
    }
}
