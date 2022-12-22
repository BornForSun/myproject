package com.hzx.admin.API;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("commonBusiness")
public class CommonBusinessController {

    @PostMapping("/test")
    public void test(){
        log.info("测试接口进入》》》");
    }

}
