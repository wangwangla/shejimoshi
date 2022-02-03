package com.kw.celue.verion.two;

/**
 * duck 版本二
 *
 *  新的需求
 *  鸭子需要一些新的属性，比如可以飞
 *
 *  就在父类 中加入一个fly，但是fly会在每个实例中都会有，我们有时候并不需要
 *
 *  不会飞的什么也不做，覆盖即可
 */
public abstract class Duck {
    public void play(){
        System.out.println("XXXXXXX");
    }
    public void quack(){
        System.out.println("XXXXXXX");
    }
    public abstract void display();
    public void fly(){
        prt("fly");
    }

    private void prt(String string){
        System.out.println("show :"+string);
    }
}
