package com.hzx.dubbo.annotation;

import com.alibaba.dubbo.config.annotation.Service;

@Service(timeout=5000)
public class ProviderServiceAnnotationImpl implements ProviderServiceAnnotation {
    @Override
    public String sayHello(String hello) {
        return hello;
    }
}
