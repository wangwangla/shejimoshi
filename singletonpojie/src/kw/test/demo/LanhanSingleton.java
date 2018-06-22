package kw.test.demo;

import java.io.Serializable;

/**
 * auther   kangwang
 * 2018
 *
 * 懒汉式
 *
 * 延迟加载，资源利用率高，但是效率低，每次使用的时候需要同步，并发时候效率低。
 */
public class LanhanSingleton implements Serializable {
    private static LanhanSingleton instance=null;
    private LanhanSingleton(){
        //检查是否为null.检查是否允许创建对象，这种方法可以防止反射破解
        if(instance!=null)
        {
            throw new RuntimeException();
        }
    }
    public static synchronized  LanhanSingleton getInstance() {
        if (instance == null) {
            instance = new LanhanSingleton();
        }
        return instance;
    }

    public Object readResolve
}
