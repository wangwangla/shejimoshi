package kw.test.danli;

/**
 * auther   kangwang
 * 2018
 *
 * 静态内部类
 * ，线程安全，懒加载，调用效率高
 */
public class InnerClassSingleton {
    private InnerClassSingleton(){}
    private static class Instance
    {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
    public static InnerClassSingleton getInatce(){
        return Instance.instance;
    }

    public static void main(String[] args) {
        InnerClassSingleton singleton = new InnerClassSingleton();
        System.out.println(Instance.instance);
    }
}
