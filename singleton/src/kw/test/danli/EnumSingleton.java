package kw.test.danli;

/**
 * auther   kangwang
 * 2018
 *
 *枚举
 *
 *
 * 最安全的一个
 */
public enum  EnumSingleton {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(EnumSingleton.INSTANCE.toString()+"");
        }
    }
}
