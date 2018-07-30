package kw.test.fwzms.vister.impl;

import kw.test.fwzms.element.AmmeterElement;
import kw.test.fwzms.vister.Vister;

/**
 * auther   kangwang
 */
public class HomeVister extends Vister {

    @Override
    public double visit(AmmeterElement ammeterElement) {
        /*具体的访问来，通过传来的数据进行数据的计算*/
        double e  = ammeterElement.showElwmentCount();
        return e*10;
    }
}
