package kw.test.fwzms.element.impl;

import kw.test.fwzms.element.AmmeterElement;
import kw.test.fwzms.vister.Vister;

/**
 * auther   kangwang
 */
public class Element extends AmmeterElement {
    private double count;

    @Override
    public void accept(Vister v) {
        count =  v.visit(this);
    }

    @Override
    public double showElwmentCount() {
        return count;
    }

    @Override
    public void setElementAmount(double n) {
        count = n;
    }
}
