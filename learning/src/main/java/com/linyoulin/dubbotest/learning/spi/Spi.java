package com.linyoulin.dubbotest.learning.spi;

/**
 * @author lin.youlin
 * @version createDate:2017/7/7 9:14
 */
public interface Spi {
    boolean isSupport(String name);
    String sayHello();
}
