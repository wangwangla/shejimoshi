package kw.test.jdgc.factory;

import kw.test.jdgc.Car;
import kw.test.jdgc.impl.Aodi;
import kw.test.jdgc.impl.Byd;

/**
 * auther   kangwang
 * 2017
 *
 * 工厂的第二种创建
 */
public class CarFactory02 {
    public static Car createAoDi()
    {
        return new Aodi();
    }
    public static Car createByd()
    {
        return new Byd();
    }
}
