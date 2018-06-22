package kw.test.cxgc.impl;

import kw.test.cxgc.CarFactory;
import kw.test.cxgc.Engine;
import kw.test.cxgc.Seat;
import kw.test.cxgc.Tyre;

/**
 * auther   kangwang
 * 2018
 */
public class LiFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LiEngine();
    }

    @Override
    public Seat createSeat() {
        return new LiSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LiTyre();
    }
}
