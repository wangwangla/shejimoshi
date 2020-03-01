package kw.test.jdgc.App;

import kw.test.jdgc.Car;
import kw.test.jdgc.impl.Aodi;
import kw.test.jdgc.impl.Byd;

/**
 * auther   kangwang
 *
 * 不使用工厂的方式创建
 *
 * 简单工厂如果需要加一个对象，就继承car，让在工厂中加入就可以了。
 */
public class Client {
    public static void main(String[]args) {
        Car car01 = new Aodi();
        Car car02 = new Byd();
        System.out.print(car01);
        System.out.print(car02);
    }
}
