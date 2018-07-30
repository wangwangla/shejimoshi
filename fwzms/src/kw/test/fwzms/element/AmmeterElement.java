package kw.test.fwzms.element;

import kw.test.fwzms.vister.Vister;

/**
 * auther   kangwang
 */
public abstract class AmmeterElement {
    /*运行访问*/
    public abstract void accept(Vister v);
    /*展示结果*/
    public abstract double showElwmentCount();
    /*设置参数*/
    public abstract void setElementAmount(double n);
}
