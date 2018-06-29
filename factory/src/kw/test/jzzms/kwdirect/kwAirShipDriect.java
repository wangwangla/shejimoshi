package kw.test.jzzms.kwdirect;

import kw.test.jzzms.AirShip;
import kw.test.jzzms.bean.EcopeTower;
import kw.test.jzzms.bean.Engine;
import kw.test.jzzms.bean.OrbitalModule;
import kw.test.jzzms.builder.AirShipBuilder;
import kw.test.jzzms.direct.AirShipDirect;

/**
 * auther   kangwang
 */
public class kwAirShipDriect implements AirShipDirect {
    private AirShipBuilder airShipBuilder;

    public kwAirShipDriect(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip createShip() {
        EcopeTower ecopeTower = airShipBuilder.builderEcopeTower();
        Engine engine = airShipBuilder.builderEngine();
        OrbitalModule orbitalModule = airShipBuilder.builderOrbitalModule();

        AirShip airShip = new AirShip();
        airShip.setEcopeTower(ecopeTower);
        airShip.setEngine(engine);
        airShip.setOrbitalModule(orbitalModule);
        return airShip;
    }
}
