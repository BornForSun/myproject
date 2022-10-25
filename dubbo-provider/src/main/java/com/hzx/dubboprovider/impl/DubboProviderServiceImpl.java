package com.hzx.dubboprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hzx.dubboprovider.service.DubboProviderService;

@Service(timeout = 500,version = "1.0.0")
public class DubboProviderServiceImpl implements DubboProviderService {
    @Override
    public void sayHello() {
        System.out.println("进来了》》》》");
    }
}
