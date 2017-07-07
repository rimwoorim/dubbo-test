package com.linyoulin.dubbotest.learning.spi;

/**
 * @author lin.youlin
 * @version createDate:2017/7/7 9:26
 */
public class SpiAImpl implements Spi {
    public boolean isSupport(String name) {
        return "SPIA".equalsIgnoreCase(name.trim());
    }

    public String sayHello() {
        return "hello im Comp A";
    }
}
