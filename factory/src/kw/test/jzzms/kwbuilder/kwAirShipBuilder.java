package kw.test.jzzms.kwbuilder;

import kw.test.jzzms.bean.EcopeTower;
import kw.test.jzzms.bean.Engine;
import kw.test.jzzms.bean.OrbitalModule;
import kw.test.jzzms.builder.AirShipBuilder;

/**
 * auther   kangwang
 */
public class kwAirShipBuilder implements AirShipBuilder {

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.print("创建OrbitalModule");
        return new OrbitalModule("OrbitalModule");
    }

    @Override
    public Engine builderEngine() {
        System.out.print("创建Engine");
        return new Engine("Engine");
    }

    @Override
    public EcopeTower builderEcopeTower() {
        System.out.print("创建EcopeTower");
        return new EcopeTower("EcopeTower");
    }
}
