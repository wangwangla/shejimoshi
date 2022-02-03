package com.kw.celue.verion.three;

/**
 * duck 版本三
 *
 *  版本二的缺点：
 *      每次覆盖会增加代码，并且加入忘记覆盖，就会出现问题
 *
 *   这个版本的做法：
 *      将飞等方法都写成一个新的类，需要的时候继承即可。
 *
 *   这个类现在应该是不可以使用的，因为不可以多继承。
 *
 *
 *   我们需要飞的时候，实现fly，但是当非常多的时候这个又该怎么说呢 。虽然解决了问题，但是会造成类麻烦
 */
public abstract class Duck {
    public void play(){
        System.out.println("XXXXXXX");
    }
//    public void quack(){
//        System.out.println("XXXXXXX");
//    }
    public abstract void display();
//    public void fly(){
//        prt("fly");
//    }

    private void prt(String string){
        System.out.println("show :"+string);
    }
}
