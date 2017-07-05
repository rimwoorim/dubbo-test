package com.linyoulin.dubbotest.service.impl;

import com.linyoulin.dubbotest.IHelloService;

/**
 * Created by linyoulin on 2017/7/5.
 */
public class HelloServiceImpl implements IHelloService {
    public String sayHello(String name) {
        return "hello " + name;
    }
}
