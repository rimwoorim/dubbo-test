package com.linyoulin.dubbotest.learning.spi;

/**
 * @author lin.youlin
 * @version createDate:2017/7/7 9:27
 */
public class SpiBImpl implements Spi {
    public boolean isSupport(String name) {
        return "SPIB".equalsIgnoreCase(name.trim());
    }

    public String sayHello() {
        return "hello, im Comp B";
    }
}
