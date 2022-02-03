package com.kw.celue.verion.one;

/**
 * duck 版本一
 *
 *  鸭子可以叫
 *  鸭子可以玩
 *  鸭子的样子才可以改变，不同的鸭子是不一样的
 *
 *
 * 子类怎么做？
 *   实现接口即可
 */
public abstract class Duck {
    public void play(){
        System.out.println("XXXXXXX");
    }
    public void quack(){
        System.out.println("XXXXXXX");
    }

    public abstract void display();

}
