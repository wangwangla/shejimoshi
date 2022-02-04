package kw.test.gcff.impl;

import kw.test.gcff.Car;
import kw.test.gcff.CarFactory;

public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
