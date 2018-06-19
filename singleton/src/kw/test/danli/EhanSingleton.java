package kw.test.danli;

/**
 * auther   kangwang
 * 2018
 *
 * 测试饿汉式单例模式
 * (1)线程安全
 * （2）调用效率高，无同步
 */
public class EhanSingleton {
    /*
    创建的时候是在类初始化的时候，它是一个天然的线程安全模式
     */
    private static EhanSingleton instance = new EhanSingleton();
    private EhanSingleton(){}

    public EhanSingleton getInstance()
    {
        return instance;
    }
}
