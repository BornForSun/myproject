package com.hzx.admin.dubboserivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hzx.admin.dubboserivce.DubboComsumer;

@Service(version = "1.0.0",timeout = 60000)
public class DubboComsumerServiceImpl implements DubboComsumer {
}
