package kw.test.danli;

/**
 * auther   kangwang
 * 2018
 *
 *双重锁检测法
 *
 * 此模式的同步内容在if内部，执行效率不必每次都进行同步，只有第一次同步创建之后就没哟必要了。
 * 问题：由于编译器优化的原因和JVM的底层内部模型原因，会出现问题，不推荐使用
 */
public class SchongJCSingleton {
    private SchongJCSingleton(){}
    private static SchongJCSingleton instance = null ;

    public static SchongJCSingleton getInstance() {
        if(instance == null)
        {
            SchongJCSingleton demoSCS;
            synchronized (SchongJCSingleton.class) {
                if(instance == null)
                {
                    instance = new SchongJCSingleton();
                }
            }
        }
        return instance;
    }

}
