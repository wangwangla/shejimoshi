package kw.test.demo;

import com.sun.corba.se.spi.ior.ObjectId;
import kw.test.danli.LanhanSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * auther   kangwang
 * 2018
 *
 * 反序列化的方法破解
 *
 * 处理方法：首先将其存储到磁盘上，然后在通过反序列化的将其从里面取出来
 * 所以也是需要实现序列化接口的
 */
public class fanxuliehua {
    public static void main(String[]args)
    {
        LanhanSingleton lanhanSingleton01 = LanhanSingleton.getInstance();
        System.out.print(lanhanSingleton01);

        FileOutputStream fileOutputStream = new FileOutputStream("d:/1.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.write(lanhanSingleton01);
        fileOutputStream.close();
        objectOutputStream.close();

        //反序列化
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("d:/1.txt"));
        LanhanSingleton lanhanSingleton02 = (LanhanSingleton) objectInputStream.readObject();
        System.out.print(lanhanSingleton02);



    }
}
