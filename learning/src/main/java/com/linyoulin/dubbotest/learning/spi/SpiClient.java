package com.linyoulin.dubbotest.learning.spi;

/**
 * @author lin.youlin
 * @version createDate:2017/7/7 9:36
 */
public class SpiClient {
    public static void main(String[] args) {
        Spi spi = SpiFactory.getSpi("SPIB");
        String hello = spi.sayHello();
        System.out.println(hello);
    }
}
