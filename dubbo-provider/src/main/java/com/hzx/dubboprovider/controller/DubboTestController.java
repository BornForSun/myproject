package com.hzx.dubboprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DubboTestController {

    @GetMapping("/test")
    public String test(){
        System.out.println("dsgsgsg");
        return "dfgdgdf";
    }
}
