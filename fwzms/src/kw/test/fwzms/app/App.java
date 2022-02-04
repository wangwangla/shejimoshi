package kw.test.fwzms.app;

import kw.test.fwzms.element.impl.Element;
import kw.test.fwzms.vister.Vister;
import kw.test.fwzms.vister.impl.HomeVister;
import kw.test.fwzms.vister.impl.VipVister;

public class App {
    public static void main(String[] args) {
        HomeVister vister = new HomeVister();
        Element element = new Element();
        element.setElementAmount(100);
        element.accept(vister);
        element.showElwmentCount();

        VipVister vipVister = new VipVister();
        element.accept(vipVister);
    }
}
