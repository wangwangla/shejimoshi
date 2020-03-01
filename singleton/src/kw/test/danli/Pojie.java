package kw.test.danli;

import java.lang.reflect.Constructor;

public class Pojie {
    public static void main(String[] args) throws Exception {
//        String className = "kw.test.sjms.FClient";
        Class<LanhanSingleton> clazz = (Class<LanhanSingleton>)Class.forName("kw.test.danli.Pojie");
        Constructor<LanhanSingleton> c= clazz.getDeclaredConstructor(null);
        for (int i = 0; i < 10; i++) {
            System.out.println("newIntance"+c.newInstance());
        }
    }
}
