package kw.test.cxgc.impl;

import kw.test.cxgc.Engine;

/**
 * auther   kangwang
 * 2018
 */
public class LiEngine implements Engine {
    @Override
    public void run() {
        System.out.print("LiEngine is run");

    }

    @Override
    public void start() {
        System.out.print("LiEngine is ");
    }
}
