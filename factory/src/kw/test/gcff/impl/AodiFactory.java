package kw.test.gcff.impl;

import kw.test.gcff.Car;
import kw.test.gcff.CarFactory;

/**
 * auther   kangwang
 */
public class AodiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Aodi();
    }
}
