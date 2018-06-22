package kw.test.jdgc.factory;

import kw.test.jdgc.Car;
import kw.test.jdgc.impl.Aodi;
import kw.test.jdgc.impl.Byd;

/**
 * auther   kangwang
 */
public class Carfactory {
    public static Car CreateCar(String type)
    {
        if("Aodi".equals(type)){
            return new Aodi();
        }else if("Byd".equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
}
