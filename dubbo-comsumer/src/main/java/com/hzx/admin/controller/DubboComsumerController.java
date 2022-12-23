package com.hzx.admin.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hzx.dubboprovider.service.DubboProviderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubbo")
public class DubboComsumerController {
    @Reference(version = "1.0.0",timeout = 300)
    private DubboProviderService dubboProviderService;

    @PostMapping("/test")
    public void testDubbo(){
        System.out.println("调用开始");
        dubboProviderService.sayHello();
        System.out.println("调用结束");

    }
}
