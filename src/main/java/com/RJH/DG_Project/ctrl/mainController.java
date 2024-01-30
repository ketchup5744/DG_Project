package com.RJH.DG_Project.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping("/api/hello")
    public String test() {
        return "Hello, world!";
    }

    /*@RequestMapping("/")
    public String main() {
        return "index";
    }*/
}