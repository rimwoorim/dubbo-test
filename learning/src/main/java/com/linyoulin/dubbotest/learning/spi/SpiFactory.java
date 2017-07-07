package com.linyoulin.dubbotest.learning.spi;

import java.util.ServiceLoader;

/**
 * @author lin.youlin
 * @version createDate:2017/7/7 9:29
 */
public class SpiFactory {
    // load config for all implements
    private static ServiceLoader<Spi> spiLoader = ServiceLoader.load(Spi.class);

    // choose implements by name
    public static Spi getSpi(String name) {
        for (Spi spi : spiLoader) {
            if (spi.isSupport(name)) {
                return spi;
            }
        }
        return null;
    }

}
