package kw.test.jdgc.App;

import kw.test.jdgc.Car;
import kw.test.jdgc.impl.Aodi;
import kw.test.jdgc.impl.Byd;

/**
 * auther   kangwang
 *
 * 不使用工厂的方式创建
 */
public class Client {
    public static void main(String[]args) {
        Car car01 = new Aodi();
        Car car02 = new Byd();
        System.out.print(car01);
        System.out.print(car02);
    }
}
