package kw.test.demo;

/**
 * auther   kangwang
 * 2018
 *
 * 懒汉式
 *
 * 延迟加载，资源利用率高，但是效率低，每次使用的时候需要同步，并发时候效率低。
 */
public class LanhanSingleton {
    private static LanhanSingleton instance=null;
    private LanhanSingleton(){}
    public static synchronized  LanhanSingleton getInstance() {
        if (instance == null) {
            instance = new LanhanSingleton();
        }
        return instance;
    }
}
