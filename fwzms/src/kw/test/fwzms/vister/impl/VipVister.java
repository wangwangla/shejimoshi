package kw.test.fwzms.vister.impl;

import kw.test.fwzms.element.AmmeterElement;
import kw.test.fwzms.vister.Vister;

public class VipVister extends Vister {
    @Override
    public double visit(AmmeterElement ammeterElement) {
        return ammeterElement.showElwmentCount() * 0.8F;
    }
}
