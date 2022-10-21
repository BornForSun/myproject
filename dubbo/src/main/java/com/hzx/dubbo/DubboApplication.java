package com.hzx.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hzx
 */
@SpringBootApplication
public class DubboApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboApplication.class, args);
        System.out.println("服务提供者模块启动完成>>>");
    }
}
