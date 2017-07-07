package com.linyoulin.dubbotest.client;

import com.linyoulin.dubbotest.service.IHelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linyoulin on 2017/7/5.
 */
public class ConsumerClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        IHelloService helloService = (IHelloService) context.getBean("helloService");
        String hello = helloService.sayHello("linlin");
        System.out.println(hello);
    }
}
