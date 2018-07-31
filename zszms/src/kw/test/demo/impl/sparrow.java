package kw.test.demo.impl;

import kw.test.demo.Brid;

public class sparrow extends Brid{
    public final int DISTANCE = 100;
    @Override
    public int fly(){
        return DISTANCE;
    }
}