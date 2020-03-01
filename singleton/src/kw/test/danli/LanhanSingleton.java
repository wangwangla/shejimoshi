package kw.test.danli;

import java.io.Serializable;

/**
 * auther   kangwang
 * 2018
 * 懒汉式
 *
 * 延迟加载，资源利用率高，但是效率低，每次使用的时候需要同步，并发时候效率低。
 */
public class LanhanSingleton implements Serializable {
    private static LanhanSingleton instance=null;
    private LanhanSingleton(){}
    public static synchronized  LanhanSingleton getInstance() {
        if (instance == null) {
            instance = new LanhanSingleton();
        }
        return instance;
    }

    //未防止反序列化的防破解方法
    //当请求来的时候，就可以直接的返回这个对象，而不是重新建对象
    private Object readResolve()
    {
        return instance;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(LanhanSingleton.getInstance()+"==============");
        }
    }
}
