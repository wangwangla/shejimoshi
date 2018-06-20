package kw.test.demo;

import java.lang.reflect.Constructor;

/**
 * auther   kangwang
 * 2018
 * 懒汉式的破解方法
 */
public class PoJie {
    public static void main(String[]args)throws Exception
    {
        LanhanSingleton lanhanSingleton01 = LanhanSingleton.getInstance();
        LanhanSingleton lanhanSingleton02 = LanhanSingleton.getInstance();
        System.out.print(lanhanSingleton01);
        System.out.print(lanhanSingleton02);


        /////////////////破解//////////////////
        Class<LanhanSingleton> clazz = (Class<LanhanSingleton>)Class.forName("kw.test.danli.LanhanSingleton");
        //获取构造方法
        Constructor<LanhanSingleton> c = clazz.getDeclaredConstructor(null);
        //因为私有的无法访问，需要使用一个方法,跳过权限检查
        c.setAccessible(true );
        //创建对象
        LanhanSingleton lanhanSingleton03 = c.newInstance();
        LanhanSingleton lanhanSingleton04 = c.newInstance();

        System.out.print(lanhanSingleton03);
        System.out.print(lanhanSingleton04);
    }
}
