package kw.test.jzzms.builder;

import kw.test.jzzms.bean.EcopeTower;
import kw.test.jzzms.bean.Engine;
import kw.test.jzzms.bean.OrbitalModule;

/**
 * auther   kangwang
 * 2018
 *
 */
public interface AirShipBuilder {
    OrbitalModule builderOrbitalModule();
    Engine builderEngine();
    EcopeTower builderEcopeTower();
}
