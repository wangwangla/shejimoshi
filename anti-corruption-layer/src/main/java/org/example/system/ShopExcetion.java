package org.example.system;

public class ShopExcetion extends Exception{
    public ShopExcetion(String msg){
        super(msg);
    }

    public static ShopExcetion throwIncorrectData(String lhs,String rhs) throws ShopExcetion {
        throw new ShopExcetion(
                ""
        );
    }
}
