package kw.test.jdgc.App;

import kw.test.jdgc.Car;
import kw.test.jdgc.factory.Carfactory;

/**
 * auther   kangwang
 * 2018
 */
public class Client01 {
    public static void main(String []args){
        Car car01 = Carfactory.CreateCar("Aodi");
        Car car02 = Carfactory.CreateCar("Byd");

        System.out.println(car01);
        System.out.println(car02);
    }
}
