package com.linyoulin.dubbotest.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linyoulin on 2017/7/5.
 */
public class ProviderClient {
    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        Thread.sleep(Integer.MAX_VALUE);
    }
}
