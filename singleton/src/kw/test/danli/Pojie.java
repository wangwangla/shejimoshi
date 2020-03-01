package kw.test.danli;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Pojie {
    public static void main(String[] args) throws Exception {
//        String className = "kw.test.sjms.FClient";
        //这种方法的破解方式是，通过反射，跳过检查，当构造函数是私有的时候使用
        Class<LanhanSingleton> clazz = (Class<LanhanSingleton>)Class.forName("kw.test.danli.LanhanSingleton");
        Constructor<LanhanSingleton> c= clazz.getDeclaredConstructor(null);
        c.setAccessible(true);
        for (int i = 0; i < 10; i++) {
            System.out.println("newIntance"+c.newInstance());
        }

        //方式二

        LanhanSingleton fDemoLH1 = LanhanSingleton.getInstance();
        System.out.println(fDemoLH1);
        FileOutputStream fileOutputStream = new FileOutputStream("D:/a.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        oos.writeObject(fDemoLH1);
        oos.close();
        fileOutputStream.close();
        /*
         * 反序列化
         */
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:/a.txt"));
        LanhanSingleton fDemoLH = (LanhanSingleton) ois.readObject();
        System.out.println(fDemoLH);

    }
}
