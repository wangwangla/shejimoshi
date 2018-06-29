package kw.test.jzzms;


import kw.test.jzzms.bean.EcopeTower;
import kw.test.jzzms.bean.Engine;
import kw.test.jzzms.bean.OrbitalModule;

/**
 * auther   kangwang
 *
 * 建造者模式
 */
public class AirShip {
    private OrbitalModule orbitalModule;
    private Engine engine;
    private EcopeTower ecopeTower;

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EcopeTower getEcopeTower() {
        return ecopeTower;
    }

    public void setEcopeTower(EcopeTower ecopeTower) {
        this.ecopeTower = ecopeTower;
    }
}
